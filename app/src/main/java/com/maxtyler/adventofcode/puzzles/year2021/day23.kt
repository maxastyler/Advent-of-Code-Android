package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day23 : Puzzle<Map<day23.Amph, Int>> {
    enum class Amph(cost: Int) {
        A(1), B(10), C(100), D(1000)
    }

    val neighbours = setOf(
        setOf(0, 1),
        setOf(1, 2),
        setOf(2, 3),
        setOf(3, 4),
        setOf(4, 5),
        setOf(5, 6),
        setOf(1, 7),
        setOf(7, 2),
        setOf(2, 9),
        setOf(9, 3),
        setOf(3, 11),
        setOf(11, 4),
        setOf(4, 13),
        setOf(13, 5),
        setOf(7, 8),
        setOf(9, 10),
        setOf(11, 12),
        setOf(13, 14)
    )


    val neighbourDistances = mapOf(
        setOf(0, 1) to 1,
        setOf(1, 2) to 2,
        setOf(2, 3) to 2,
        setOf(3, 4) to 2,
        setOf(4, 5) to 2,
        setOf(5, 6) to 1,
        setOf(1, 7) to 2,
        setOf(7, 2) to 2,
        setOf(2, 9) to 2,
        setOf(9, 3) to 2,
        setOf(3, 11) to 2,
        setOf(11, 4) to 2,
        setOf(4, 13) to 2,
        setOf(13, 5) to 2,
        setOf(7, 8) to 1,
        setOf(9, 10) to 1,
        setOf(11, 12) to 1,
        setOf(13, 14) to 1
    )

    val points = neighbours.flatMap { it }.toSet()

    fun getPaths(neighbours: Set<Set<Int>>, a: Int) =
        generateSequence(setOf(a) to listOf(listOf(a))) { (used, paths) ->
            val newPaths = paths.flatMap { path ->
                val lastPoint = path.last()
                (points - used).mapNotNull { point ->
                    if (setOf(
                            lastPoint,
                            point
                        ) in neighbours
                    ) path + point else null
                }
            }
            if (newPaths.isNotEmpty()) (used + newPaths.map { it.last() }.toSet()) to newPaths
            else null
        }.map { it.second }.fold(listOf<List<Int>>()) { c, v -> c + v }.toSet()

    val paths = points.flatMap { p ->
        val paths = getPaths(neighbours, p)
        points.filter { it != p }.mapNotNull { q ->
            paths.firstOrNull { it.last() == q }
                ?.let { path -> (p to q) to path }
        }
    }.toMap()

    val blocking = paths.mapValues { (_, v) -> v.drop(1).dropLast(1) }

    val distances = points.flatMap { p ->
        points.filter { it != p }.map { q ->
            (p to q) to
                    paths.get(p to q)?.zipWithNext()
                        ?.fold(0) { a, (p1, p2) -> a + (neighbourDistances[setOf(p1, p2)] ?: 0) }
        }
    }.toMap()


    override fun parseInput(input: String): Map<Amph, Int> = mapOf()

    override fun part1(input: Map<Amph, Int>): String {
        TODO("Not yet implemented")
    }

    override fun part2(input: Map<Amph, Int>): String {
        TODO("Not yet implemented")
    }
}