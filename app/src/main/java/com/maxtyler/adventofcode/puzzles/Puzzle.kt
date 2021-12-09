package com.maxtyler.adventofcode.puzzles

import kotlin.system.measureNanoTime

interface Puzzle<T> {

    fun parseInput(input: String): T
    fun part1(input: T): String
    fun part2(input: T): String

    fun runPuzzle(input: String) {


        var parsed: T?
        var part1Result: String?
        var part2Result: String?
        val parseTime = measureNanoTime { parsed = parseInput(input) }
        val p1Time = measureNanoTime { part1Result = part1(parsed!!) }
        val p2Time = measureNanoTime { part2Result = part2(parsed!!) }

        println("Part 1: ${part1Result}")
        println("Part 2: ${part2Result}")
        println("Parsing time: ${parseTime / 1_000_000.0}ms")
        println("Runtime part 1: ${p1Time / 1_000_000.0}ms")
        println("Runtime part 2: ${p2Time / 1_000_000.0}ms")
        println("Total time: ${(parseTime + p1Time + p2Time) / 1_000_000.0}ms")
    }
}