package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle


object day06 : Puzzle<List<Long>> {

    fun step(fish: List<Long>): List<Long> = fish.mapIndexed { i, l ->
        when {
            i == 6 -> fish[0] + fish[7]
            i == 15 -> fish[0] + fish[7]
            else -> fish[i + 1]
        }
    }

    override fun parseInput(input: String) =
        Regex("(\\d+)").findAll(input).map { it.value.toInt() }.groupingBy { it }.eachCount()
            .let { counts -> List(7 + 9) { counts[it]?.toLong() ?: 0L } }

    override fun part1(input: List<Long>) =
        generateSequence(input, ::step).elementAt(80).sum().toString()

    override fun part2(input: List<Long>) =
        generateSequence(input, ::step).elementAt(256).sum().toString()
}