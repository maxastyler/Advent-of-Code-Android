package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

typealias Cuboid = List<IntRange>

@OptIn(ExperimentalStdlibApi::class)
object day22 : Puzzle<List<day22.Instruction>> {
    data class Instruction(val state: Boolean, val cuboid: Cuboid)

    fun IntRange.overlap(other: IntRange): List<IntRange>? {
        val start = maxOf(this.first, other.first)
        val end = minOf(this.last, other.last)
        return if (start > end) null else listOf(
            minOf(this.first, other.first) to start.dec(),
            start to end,
            end.inc() to maxOf(this.last, other.last)
        ).filter { (a, b) -> a <= b }.map { (a, b) -> a..b }
    }

    fun IntRange.splitBy(other: IntRange): List<IntRange> {
        val start = maxOf(this.first, other.first)
        val end = minOf(this.last, other.last)
        return if (start > end) listOf(this) else {
            buildList {
                if (this@splitBy.first < start) {
                    add(this@splitBy.first..start.dec())
                }
                add(start..end)
                if (this@splitBy.last > end) {
                    add(end.inc()..this@splitBy.last)
                }
            }
        }
    }

    infix fun Cuboid.intersects(other: Cuboid) =
        this.zip(other).all { (a, b) -> a.overlap(b) != null }

    fun <T> product(seq: List<List<T>>): List<List<T>> {
        val innerFun = DeepRecursiveFunction<List<List<T>>, List<List<T>>> { s ->
            if (s.size == 1) {
                s.first().map { listOf(it) }
            } else {
                s.first().flatMap { e ->
                    callRecursive(s.drop(1)).map { r -> listOf(e) + r }
                }
            }
        }
        return innerFun(seq)
    }

    infix fun Cuboid.split(other: Cuboid): List<Cuboid> {
        val overlaps = this.zip(other)
            .map { (r1, r2) -> r1.overlap(r2)?.toList()?.filter { it.first <= it.last } }
        return if (overlaps.any { it == null }) listOf(this, other) else {
            product(overlaps.filterNotNull())
        }
    }

    fun Cuboid.cutOut(other: Cuboid): List<Cuboid> {
        val overlaps = this.zip(other)
            .map { (r1, r2) -> r1.splitBy(r2) }
        return if (overlaps.any { it.size <= 1 }) listOf(this) else {
            product(overlaps).filter { !(it intersects other) }
        }.also { noIntersections(it) }
    }

    fun Cuboid.volume() = this.fold(1L) { a, v -> (v.last.inc() - v.first) * a }

    fun noIntersections(l: List<Cuboid>) {
        val sects =
            l.flatMap { c -> l.filter { it != c && it intersects c }.map { c to it } }.firstOrNull()
        assert(sects == null) { "${sects}" }
    }


    fun runInstructions(instructions: List<Instruction>) =
        instructions.drop(1).fold(listOf(instructions.first().cuboid)) { a, (state, cuboid) ->
            val (intersecting, nonIntersecting) = a.partition { it intersects cuboid }
            when {
                state && intersecting.isEmpty() -> nonIntersecting + listOf(cuboid)
                state -> nonIntersecting + intersecting + intersecting.fold(listOf(cuboid)) { newCubes, c ->
                    newCubes.flatMap { it.cutOut(c) }
                }
                else -> nonIntersecting + intersecting.flatMap { it.cutOut(cuboid) }
            }
        }

    override fun parseInput(input: String) =
        Regex("(on|off) x=(-?\\d+)..(-?\\d+),y=(-?\\d+)..(-?\\d+),z=(-?\\d+)..(-?\\d+)")
            .findAll(input)
            .map {
                val (state, xMin, xMax, yMin, yMax, zMin, zMax) = it.destructured
                day22.Instruction(
                    state == "on",
                    listOf(
                        xMin.toInt()..xMax.toInt(),
                        yMin.toInt()..yMax.toInt(),
                        zMin.toInt()..zMax.toInt()
                    )
                )
            }.toList()

    override fun part1(input: List<Instruction>) =
        runInstructions(input).mapNotNull {
            it.map { maxOf(it.first, -50)..minOf(it.last, 50) }
        }.sumOf { it.volume() }.toString()

    override fun part2(input: List<Instruction>): String {
        return runInstructions(input).sumOf { it.volume() }.toString()
    }
}