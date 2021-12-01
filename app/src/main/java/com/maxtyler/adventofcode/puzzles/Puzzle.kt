package com.maxtyler.adventofcode.puzzles

interface Puzzle<T> {

    fun parseInput(input: String): T
    fun part1(input: T): String
    fun part2(input: T): String

    fun runPuzzle(input: String) {
        val parsed = parseInput(input)
        println("Part 1: ${part1(parsed)}")
        println("Part 2: ${part2(parsed)}")
    }
}