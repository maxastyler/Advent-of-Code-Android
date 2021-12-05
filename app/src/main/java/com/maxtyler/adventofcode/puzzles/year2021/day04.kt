package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

data class Bingo(val plays: List<Int>, val boards: List<Board>)

data class Board(val nums: List<List<Int>>) {
    fun score(called: List<Int>) = if (nums.any { it.all { it in called } } or (0 until nums.first()
            .count()).any { i -> nums.all { it[i] in called } }) {
        nums.flatten().fold(0) { acc, v -> acc + (if (v in called) 0 else v) } * called.last()
    } else null

    fun turnsToComplete(called: List<Int>) =
        (1..called.count()).asSequence().mapNotNull { i -> score(called.take(i))?.let { it to i } }
            .firstOrNull()

}

object day04 : Puzzle<Bingo> {
    override fun parseInput(input: String): Bingo {
        val split = input.split("\n\n")
        val nums = Regex("(\\d+)").findAll(split[0]).map { it.value.toInt() }.toList()
        val boards = split.drop(1).map {
            Board(
                it.split("\n")
                    .map { Regex("(\\d+)").findAll(it).map { it.value.toInt() }.toList() })
        }

        return Bingo(nums, boards)
    }

    override fun part1(input: Bingo) =
        input.boards.mapNotNull { it.turnsToComplete(input.plays) }.sortedBy { it.second }
            .first().first.toString()


    override fun part2(input: Bingo) =
        input.boards.mapNotNull { it.turnsToComplete(input.plays) }.sortedBy { it.second }
            .last().first.toString()

}