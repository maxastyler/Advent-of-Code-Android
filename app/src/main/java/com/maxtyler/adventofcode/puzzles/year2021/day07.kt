package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import kotlin.math.absoluteValue
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.roundToInt

object day07 : Puzzle<List<Int>> {
    override fun parseInput(input: String): List<Int> =
        Regex("(\\d+)").findAll(input).map { it.value.toInt() }.toList()

    override fun part1(input: List<Int>) = input.sorted()
        .let { l -> (l[input.size / 2] + l[input.size / 2 - 1]) / 2.0 }.roundToInt()
        .let { x -> input.fold(0) { a, i -> a + (i - x).absoluteValue } }.toString()

    override fun part2(input: List<Int>) = input.average()
        .let { x ->
            listOf(ceil(x), floor(x))
                .minOfOrNull { input.fold(0.0) { a, i -> a + (i - it).absoluteValue.let { it * (it + 1.0) / 2.0 } } }
        }!!.roundToInt().toString()

}