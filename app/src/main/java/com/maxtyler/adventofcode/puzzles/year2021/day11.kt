package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day11 : Puzzle<Map<Pair<Int, Int>, Int>> {
    val neighbours: List<Pair<Int, Int>> =
        (-1..1).flatMap { i -> (-1..1).map { i to it } }.filter { it != (0 to 0) }

    fun step(squids: Map<Pair<Int, Int>, Int>) =
        generateSequence(squids.mapValues { it.value.inc() } to setOf<Pair<Int, Int>>()) { (squid, flashed) ->
            val flashing = squid.filter { (c, v) -> !(c in flashed) and (v > 9) }.keys
            if (flashing.isNotEmpty()) {
                flashing.fold(squid) { s, (i, j) ->
                    neighbours.fold(s) { s, (di, dj) ->
                        val coord = (i + di) to (j + dj)
                        s[coord]?.let { s + (coord to it.inc()) } ?: s
                    }
                } to (flashed + flashing)
            } else null
        }.last()
            .let { (squids, flashed) -> squids + flashed.associate { it to 0 } to flashed }


    override fun parseInput(input: String): Map<Pair<Int, Int>, Int> =
        input.lines().flatMapIndexed { i, l -> l.mapIndexed { j, c -> (i to j) to c.digitToInt() } }
            .toMap()

    override fun part1(input: Map<Pair<Int, Int>, Int>) =
        generateSequence(input to setOf<Pair<Int, Int>>()) { (squids, _) -> step(squids) }
            .take(101)
            .sumOf { it.second.size }
            .toString()

    override fun part2(input: Map<Pair<Int, Int>, Int>) =
        generateSequence(input to setOf<Pair<Int, Int>>()) { (squids, _) -> step(squids) }
            .indexOfFirst { (squids, flashed) -> squids.size == flashed.size }
            .toString()
}