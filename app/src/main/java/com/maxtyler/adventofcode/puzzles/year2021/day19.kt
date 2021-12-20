package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import kotlin.math.absoluteValue

fun rot(v: Triple<Int, Int, Int>, axis: Int, n: Int): Triple<Int, Int, Int> {
    val (x, y, z) = v
    return when (axis) {
        0 -> when (n.mod(4)) {
            0 -> v
            1 -> Triple(x, -z, y)
            2 -> Triple(x, -y, -z)
            else -> Triple(x, z, -y)
        }
        1 -> when (n.mod(4)) {
            0 -> v
            1 -> Triple(-z, y, x)
            2 -> Triple(-x, y, -z)
            else -> Triple(z, y, -x)
        }
        else -> when (n.mod(4)) {
            0 -> v
            1 -> Triple(-y, x, z)
            2 -> Triple(-x, -y, z)
            else -> Triple(y, -x, z)
        }
    }
}

val rotations = listOf(0 to 0, 0 to 1, 0 to 2, 0 to 3, 1 to 1, 1 to 3).flatMap { (ax, m) ->
    (0..3).map {
        Triple(ax, m, it)
    }
}.asSequence()

operator fun Triple<Int, Int, Int>.plus(other: Triple<Int, Int, Int>) =
    Triple(this.first + other.first, this.second + other.second, this.third + other.third)

operator fun Triple<Int, Int, Int>.unaryMinus() = Triple(-this.first, -this.second, -this.third)
operator fun Triple<Int, Int, Int>.minus(other: Triple<Int, Int, Int>) = this + (-other)
fun Triple<Int, Int, Int>.manhattan(other: Triple<Int, Int, Int>) =
    (this - other).let { (a, b, c) -> a.absoluteValue + b.absoluteValue + c.absoluteValue }

object day19 : Puzzle<List<Set<Triple<Int, Int, Int>>>> {
    override fun parseInput(input: String) = input.split("\n\n").map {
        Regex("(-?\\d+),(-?\\d+),(-?\\d+)").findAll(it).map {
            val (a, b, c) = it.destructured
            Triple(a.toInt(), b.toInt(), c.toInt())
        }.toSet()
    }

    fun getBeacons(input: List<Set<Triple<Int, Int, Int>>>): Pair<Set<Triple<Int, Int, Int>>, Map<Int, Triple<Int, Int, Int>>> {
        val vecs = input.mapIndexed { i, ps ->
            i to (
                    ps.flatMap { p1 ->
                        ps.mapNotNull { p2 ->
                            if (p1 == p2) null else {
                                (p1 to p2) to (p2 - p1)
                            }
                        }
                    }.toMap())
        }

        val activeSet = vecs.first().second.toMutableMap()

        val scannerPositions = mutableMapOf(0 to Triple(0, 0, 0))

        val toDetermine = vecs.drop(1).map { (i, v2) ->
            i to rotations.map { (ax, n1, n2) ->
                val rotatedVectors = v2.mapValues { (_, v) -> rot(rot(v, ax, n1), 2, n2) }
                Triple(ax, n1, n2) to rotatedVectors
            }.toList()
        }.toMutableList()

        while (toDetermine.isNotEmpty()) {
            val activeDs = activeSet.values.toHashSet()
            val (indices, result) = toDetermine.flatMapIndexed { i, (j, rots) ->
                rots.map { (r, m) ->
                    Triple(
                        (i to j),
                        (r to m),
                        m.count { (_, v) -> v in activeDs })
                }
            }.maxByOrNull { it.third }!!
            val (r, orientation) = result
            val orientationRotated = orientation.mapKeys { (k, _) ->
                rot(
                    rot(k.first, r.first, r.second),
                    2,
                    r.third
                ) to rot(rot(k.second, r.first, r.second), 2, r.third)
            }

            val transform =
                orientationRotated.filterValues { it in activeSet.values }
                    .mapValues { (_, v) -> activeSet.firstNotNullOf { (k, v1) -> if (v1 == v) k else null } }
                    .flatMap { (a, b) ->
                        listOf(b.first - a.first, b.second - a.second)
                    }
                    .fold(mapOf<Triple<Int, Int, Int>, Int>()) { m, p ->
                        m + (p to m.getOrDefault(
                            p,
                            0
                        ).inc())
                    }
                    .maxByOrNull { it.value }!!.key

            activeSet += orientationRotated.mapKeys { (k, _) -> k.first + transform to k.second + transform }

            toDetermine.removeAt(indices.first)

            scannerPositions += (indices.second to transform)
        }
        return (activeSet.keys.fold(setOf<Triple<Int, Int, Int>>()) { a, v -> a + v.first + v.second } to scannerPositions)
    }

    override fun part1(input: List<Set<Triple<Int, Int, Int>>>): String {
        return getBeacons(input).first.size.toString()
    }

    override fun part2(input: List<Set<Triple<Int, Int, Int>>>): String {
        val beacons = getBeacons(input).second.values
        return beacons.flatMap { b1 -> beacons.map { b1 to it } }
            .maxOf { (b1, b2) -> b1.manhattan(b2) }.toString()
    }


}

