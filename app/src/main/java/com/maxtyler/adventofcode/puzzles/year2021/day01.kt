package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day01 : Puzzle<List<Int>> {
    override fun parseInput(input: String): List<Int> =
        Regex("(\\d+)").findAll(input).map { it.value.toInt() }.toList()

    override fun part1(input: List<Int>): String =
        input.windowed(2).filter { (a, b) -> b > a }.count().toString()

    override fun part2(input: List<Int>): String =
        input.windowed(4).filter { (a, _, _, b) -> b > a }.count().toString()

}