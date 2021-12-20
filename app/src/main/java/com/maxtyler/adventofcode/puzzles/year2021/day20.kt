package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day20 : Puzzle<Pair<Set<Int>, Map<Pair<Int, Int>, Int>>> {
    override fun parseInput(input: String): Pair<Set<Int>, Map<Pair<Int, Int>, Int>> {
        val (lut, image) = input.split("\n\n")
        return (lut.filter { it in "#." }.mapIndexedNotNull { i, c -> if (c == '#') i else null }
            .toSet() to
                image.lines()
                    .flatMapIndexed { i, l -> l.mapIndexed { j, c -> (i to j) to if (c == '.') 0 else 1 } }
                    .associate { it.first to it.second }
                )
    }

    fun enhance(
        lut: Set<Int>,
        image: Map<Pair<Int, Int>, Int>,
        outsideState: Int
    ) = (image.keys.minOf { it.first } - 1..image.keys.maxOf { it.first } + 1).flatMap { i ->
        (image.keys.minOf { it.second } - 1..image.keys.maxOf { it.second } + 1).map { j ->
            (i to j) to (1 downTo -1).flatMap { di ->
                (1 downTo -1).map { dj ->
                    val a = i + di
                    val b = j + dj
                    image.getOrDefault(a to b, outsideState)
                }
            }.foldIndexed(0) { i, a, v -> (v shl i) or a }
        }
    }.associate { it.first to if (it.second in lut) 1 else 0 }

    fun mapSequence(initialMap: Map<Pair<Int, Int>, Int>, lut: Set<Int>) =
        generateSequence(initialMap to 0) { (m, i) ->
            enhance(lut, m, i) to
                    (if (i == 0) if (0 in lut) 1 else 0 else if (511 in lut) 1 else 0)
        }

    override fun part1(input: Pair<Set<Int>, Map<Pair<Int, Int>, Int>>) =
        mapSequence(input.second, input.first).elementAt(2).first.count { it.value == 1 }.toString()

    override fun part2(input: Pair<Set<Int>, Map<Pair<Int, Int>, Int>>) =
        mapSequence(input.second, input.first).elementAt(50).first.count { it.value == 1 }
            .toString()


}