package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

fun step(fish: List<Long>): List<Long> =
    (fish.drop(1) + (fish[0] + fish[7])).mapIndexed { index, i -> if (index == 6) i + fish[0] else i }

object day06 : Puzzle<List<Long>> {

    override fun parseInput(input: String) =
        Regex("(\\d+)").findAll(input).map { it.value.toInt() }.groupingBy { it }.eachCount()
            .let { counts ->
                val countArray = MutableList(7 + 9) { 0L }
                counts.forEach { i, v -> countArray[i] = v.toLong() }
                countArray
            }

    override fun part1(input: List<Long>): String {
        return generateSequence(input, ::step).drop(80).first().sum().toString()
    }

    override fun part2(input: List<Long>): String {
        return generateSequence(input, ::step).drop(256).first().sum().toString()
    }
}