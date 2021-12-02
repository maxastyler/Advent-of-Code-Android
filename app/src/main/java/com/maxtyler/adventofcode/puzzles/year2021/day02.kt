package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

typealias Vec = Pair<Int, Int>

object day02 : Puzzle<List<Vec>> {
    override fun parseInput(input: String): List<Vec> =
        Regex("(\\p{Alpha}+) (\\p{Digit}+)").findAll(input).mapNotNull {
            val (dir, num) = it.destructured
            when (dir) {
                "up" -> 0 to -num.toInt()
                "down" -> 0 to num.toInt()
                "forward" -> num.toInt() to 0
                else -> null
            }
        }.toList()

    override fun part1(input: List<Vec>): String = input
        .fold(0 to 0) { (x, y), (dx, dy) ->
            (x + dx) to (y + dy)
        }
        .let { (x, y) -> x * y }
        .toString()

    override fun part2(input: List<Vec>): String =
        input
            .fold(Triple(0, 0, 0)) { (aim, x, y), (forward, vertical) ->
                Triple(
                    aim + vertical,
                    x + forward,
                    y + (aim * forward)
                )
            }
            .let { (_, x, y) -> x * y }
            .toString()
}