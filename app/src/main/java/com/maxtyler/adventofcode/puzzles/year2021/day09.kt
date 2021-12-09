package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day09 : Puzzle<Map<Pair<Int, Int>, Int>> {

    val offsets = listOf((-1 to 0), (1 to 0), (0 to -1), (0 to 1))

    fun lowPoints(heightMap: Map<Pair<Int, Int>, Int>) = heightMap.filter { (p, h) ->
        offsets.mapNotNull { (di, dj) -> heightMap[p.first + di to p.second + dj]?.let { it > h } }
            .all { it }
    }

    override fun parseInput(input: String) = input.lines()
        .flatMapIndexed { i, line -> line.mapIndexed { j, c -> Pair(i to j, c.digitToInt()) } }
        .toMap()

    override fun part1(input: Map<Pair<Int, Int>, Int>) =
        lowPoints(input).toList().fold(0) { a, v -> a + v.second + 1 }.toString()

    override fun part2(input: Map<Pair<Int, Int>, Int>): String {
        val higherNeighbours = input.mapValues { (p, h) ->
            offsets.mapNotNull { (di, dj) ->
                val neighbour = (p.first + di) to (p.second + dj)
                input[neighbour]?.let { nHeight -> if (nHeight > h) neighbour else null }
            }
        }
        return lowPoints(input).map { (p, _) ->
            generateSequence(listOf<Pair<Int, Int>>() to listOf(p))
            { (checked, toCheck) ->
                toCheck.firstOrNull()?.let { p ->
                    (checked + p) to (toCheck.drop(1) + (higherNeighbours[p] ?: listOf()))
                }
            }.last().first.toSet().filter { input[it]?.let { it < 9 } ?: false }.size
        }.sortedDescending().take(3).fold(1) { a, v -> a * v }.toString()
    }
}