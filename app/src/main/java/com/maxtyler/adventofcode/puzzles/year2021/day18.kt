package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import kotlin.math.ceil
import kotlin.math.roundToInt

val explodeRegex = Regex("\\[(\\d+),(\\d+)\\]")
val numRegex = Regex("(\\d+)")

fun sum(s1: String, s2: String) = "[$s1,$s2]"

fun explode(s: String): String? {
    val depth = s.scan(0) { a, c ->
        when (c) {
            '[' -> a.inc()
            ']' -> a.dec()
            else -> a
        }
    }
    return explodeRegex.findAll(s).map {
        it.range to (it.destructured.component1().toInt() to it.destructured.component2().toInt())
    }
        .firstOrNull { depth[it.first.first] >= 4 }
        ?.let { (range, nums) ->
            s.substring(0..range.first.dec()).let { before ->
                numRegex.findAll(before).lastOrNull()?.let { it ->
                    before.replaceRange(
                        it.range,
                        (it.value.toInt() + nums.first).toString()
                    )
                } ?: before
            } + '0' +
                    s.substring(range.last.inc()..s.length.dec()).let { after ->
                        numRegex.findAll(after).firstOrNull()?.let { it ->
                            after.replaceRange(
                                it.range,
                                (it.value.toInt() + nums.second).toString()
                            )
                        } ?: after
                    }
        }
}

fun split(s: String) = numRegex.findAll(s).firstOrNull { it.value.toInt() >= 10 }?.let {
    val i = it.value.toInt()
    s.replaceRange(
        it.range,
        "[${i.floorDiv(2)},${ceil(i.toFloat() / 2f).roundToInt()}]"
    )
}

fun reduce(s: String) = generateSequence(s) { explode(it) ?: split(it) }


@OptIn(kotlin.ExperimentalStdlibApi::class)
object day18 : Puzzle<List<day18.BTree<Int>>> {
    sealed class Path<T> {
        data class Left<T>(val right: BTree<T>) : Path<T>()
        data class Right<T>(val left: BTree<T>) : Path<T>()
    }

    data class Zipper<T>(val current: BTree<T>, val path: List<Path<T>> = listOf()) {
        fun goLeft(): Zipper<T>? = when (this.current) {
            is BTree.Leaf -> null
            is BTree.Node -> Zipper(this.current.left, path + Path.Left(this.current.right))
        }

        fun goRight(): Zipper<T>? = when (this.current) {
            is BTree.Leaf -> null
            is BTree.Node -> Zipper(this.current.right, path + Path.Right(this.current.left))
        }

        fun goUp(): Zipper<T>? = this.path.lastOrNull()?.let { parent ->
            when (parent) {
                is Path.Left -> Zipper(
                    BTree.Node(this.current, parent.right),
                    this.path.dropLast(1)
                )
                is Path.Right -> Zipper(
                    BTree.Node(parent.left, this.current),
                    this.path.dropLast(1)
                )
            }
        }

        fun iterateDepthFirst(): Sequence<Zipper<T>> =
            sequenceOf(this) + sequenceOf(this.goLeft(), this.goRight()).filterNotNull()
                .flatMap { it.iterateDepthFirst() }

        fun upSequence() = generateSequence(this) { it.goUp() }
        fun leftSequence() = generateSequence(this) { it.goLeft() }
        fun rightSequence() = generateSequence(this) { it.goRight() }

        fun nextLeaf(): Zipper<T>? =
            (if (this.current is BTree.Leaf) this.upSequence().mapNotNull {
                if (it.path.lastOrNull() is Path.Left) {
                    it.goUp()?.goRight()
                } else null
            }
                .firstOrNull() else this)?.leftSequence()?.last()

        fun prevLeaf(): Zipper<T>? =
            (if (this.current is BTree.Leaf) this.upSequence().mapNotNull {
                if (it.path.lastOrNull() is Path.Right) {
                    it.goUp()?.goLeft()
                } else null
            }
                .firstOrNull() else this)?.rightSequence()?.last()

        fun replace(newTree: BTree<T>) = this.copy(current = newTree)

        fun modify(f: (T) -> T): Zipper<T> =
            if (this.current is BTree.Leaf) this.copy(this.current.copy(f(this.current.value))) else this
    }

    sealed class BTree<T> {
        data class Node<T>(val left: BTree<T>, val right: BTree<T>) : BTree<T>() {
            override fun toString(): String = "[${this.left},${this.right}]"
            override fun magnitude(): Int = 3 * this.left.magnitude() + 2 * this.right.magnitude()
        }

        data class Leaf<T>(val value: T) : BTree<T>() {
            override fun toString(): String = this.value.toString()
            override fun magnitude(): Int = if (this.value is Int) this.value else 0
        }

        abstract fun magnitude(): Int
    }

    operator fun BTree<Int>.plus(other: BTree<Int>) =
        Zipper(BTree.Node(this, other)).reduce().upSequence().last().current

    fun BTree<Int>.explode() = Zipper(this).explode()?.upSequence()?.lastOrNull()?.current

    fun parseLine(input: String) = DeepRecursiveFunction<List<Pair<Int, Char>>, BTree<Int>> { s ->
        when (s.first().second) {
            '[' -> {
                val comma = s.indexOf(s.first().first.inc() to ',')
                val end = s.indexOf(s.first().first.inc() to ']')
                BTree.Node(
                    callRecursive(s.subList(1, comma)),
                    callRecursive(s.subList(comma.inc(), end))
                )
            }
            else -> BTree.Leaf(s.first().second.digitToInt())
        }
    }.invoke(input.scan(0) { v, c ->
        when (c) {
            '[' -> v.inc()
            ']' -> v.dec()
            else -> v
        }
    }.zip(input.toList()))

    override fun parseInput(input: String) = input.lines().map { parseLine(it) }.toList()

    fun Zipper<Int>.explode(): Zipper<Int>? =
        this.iterateDepthFirst()
            .firstOrNull { (it.path.size > 3) && (it.current is BTree.Node) && (it.current.left is BTree.Leaf) && (it.current.right is BTree.Leaf) }
            ?.let {
                val node = it.current as BTree.Node
                val leftV = (node.left as BTree.Leaf).value
                val rightV = (node.right as BTree.Leaf).value
                var replaced = it.replace(BTree.Leaf(0))
                replaced = replaced.prevLeaf()?.modify { it + leftV }?.nextLeaf() ?: replaced
                replaced = replaced.nextLeaf()?.modify { it + rightV } ?: replaced
                return replaced
            }

    fun Zipper<Int>.split(): Zipper<Int>? =
        generateSequence(this) { it.nextLeaf() }.filter { it.current is BTree.Leaf }
            .firstOrNull { (it.current as BTree.Leaf).value >= 10 }?.let { z ->
                val n = (z.current as BTree.Leaf).value
                z.replace(
                    BTree.Node(
                        BTree.Leaf(n.floorDiv(2)),
                        BTree.Leaf(ceil(n.toFloat() / 2f).roundToInt())
                    )
                )
            }

    fun Zipper<Int>.reduce(): Zipper<Int> {
        var current = this
        while (true) {
            current = current.explode()?.upSequence()?.lastOrNull() ?: current.split()?.upSequence()
                ?.lastOrNull() ?: break
        }
        return current
    }

    override fun part1(input: List<BTree<Int>>) =
        input.reduce { a, b -> a + b }.magnitude().toString()

    override fun part2(input: List<BTree<Int>>) =
        input.flatMap { a -> input.map { a + it } }.maxOf { it.magnitude() }.toString()
}