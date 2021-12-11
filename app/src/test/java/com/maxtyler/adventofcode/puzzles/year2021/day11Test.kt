package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day11Test {
    val input = """
        5483143223
        2745854711
        5264556173
        6141336146
        6357385478
        4167524645
        2176841721
        6882881134
        4846848554
        5283751526
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("1656", day11.part1(day11.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("195", day11.part2(day11.parseInput(input)))
    }
}