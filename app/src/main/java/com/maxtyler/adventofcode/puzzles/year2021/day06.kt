package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

fun step(fish: List<Long>): List<Long> = fish.mapIndexed { i, l ->
    when {
        i == 6 -> fish[0] + fish[7]
        i == 15 -> fish[0] + fish[7]
        else -> fish[i + 1]
    }
}

object day06 : Puzzle<List<Long>> {

    override fun parseInput(input: String) =
        Regex("(\\d+)").findAll(input).map { it.value.toInt() }.groupingBy { it }.eachCount()
            .let { counts -> List(7 + 9) { counts[it]?.toLong() ?: 0L } }

    override fun part1(input: List<Long>): String {
        return generateSequence(input, ::step).drop(80).first().sum().toString()
    }

    override fun part2(input: List<Long>): String {
        return generateSequence(input, ::step).drop(256).first().sum().toString()
    }
}