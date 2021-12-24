package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day23 : Puzzle<Map<day23.Amph, Int>> {
    enum class Amph(val cost: Int) {
        A(1), B(10), C(100), D(1000)
    }

    val neighbourSets = setOf(
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

    val points = neighbourSets.flatMap { it }.toSet()

    val neighbours: Map<Int, Set<Int>> = points.associate { p ->
        p to neighbourSets.filter { p in it }.flatten().toSet().filter { it != p }.toSet()
    }

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
        val paths = getPaths(neighbourSets, p)
        points.mapNotNull { q ->
            paths.firstOrNull { it.last() == q }
                ?.let { path -> (p to q) to path }
        }
    }.toMap()

    val blocking = paths.mapValues { (_, v) -> v.drop(1).dropLast(1) }

    val distances = points.flatMap { p ->
        points.mapNotNull { q ->
            paths.get(p to q)?.zipWithNext()
                ?.fold(0) { a, (p1, p2) ->
                    a + (neighbourDistances[setOf(p1, p2)] ?: 0)
                }?.let { (p to q) to it }
        }
    }.toMap()

//    fun heuristic(current: Map<Int, Amph>) = current.mapNotNull { (pos, t) ->
//        when (t) {
//            Amph.A -> distances[(pos to 7)]
//            Amph.B -> distances[(pos to 9)]
//            Amph.C -> distances[(pos to 11)]
//            Amph.D -> distances[(pos to 13)]
//        }?.times(t.cost)
//    }.fold(0) { a, b -> a + b }

    fun heuristic(current: Map<Int, Amph>): Int {
        println(current)
        var cost = 0
        val used = mutableSetOf<Amph>()
        current.forEach { (p, t) ->
            when {
                t == Amph.A -> cost += t.cost * (if (t in used) {
                    distances[p to 8]!!
                } else {
                    used.add(t)
                    distances[p to 7]!!
                })
                t == Amph.B -> cost += t.cost * (if (t in used) {
                    distances[p to 10]!!
                } else {
                    used.add(t)
                    distances[p to 9]!!
                })
                t == Amph.C -> cost += t.cost * (if (t in used) {
                    distances[p to 12]!!
                } else {
                    used.add(t)
                    distances[p to 11]!!
                })
                t == Amph.D -> cost += t.cost * (if (t in used) {
                    distances[p to 14]!!
                } else {
                    used.add(t)
                    distances[p to 13]!!
                })

            }
        }
        return cost
    }

    fun possibleMoves(current: Map<Int, Amph>): List<Pair<Map<Int, Amph>, Int>> {
        val points = current.keys
        return current.flatMap { (pos, t) ->
            neighbours[pos]!!.filter { n ->
                (n !in points) &&
                        ((n == 0 || n == 1 || n == 2 || n == 3 || n == 4 || n == 5 || n == 6) ||
                                when (t) {
                                    Amph.A -> n == 7 || n == 8
                                    Amph.B -> n == 9 || n == 10
                                    Amph.C -> n == 11 || n == 12
                                    Amph.D -> n == 13 || n == 14
                                } || (n == 8 || n == 10 || n == 12 || n == 14))
            }.map { Triple(pos, t, it) }
        }.map {
            (current.minus(it.first) + (it.third to it.second)) to (neighbourDistances[setOf(
                it.first,
                it.third
            )]?.times(it.second.cost) ?: 0)
        }
    }

    override fun parseInput(input: String): Map<Amph, Int> = mapOf()

    override fun part1(input: Map<Amph, Int>): String {
        TODO("Not yet implemented")
    }

    override fun part2(input: Map<Amph, Int>): String {
        TODO("Not yet implemented")
    }
}