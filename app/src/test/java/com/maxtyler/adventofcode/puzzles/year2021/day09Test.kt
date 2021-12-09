package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day09Test {
    val input = """
        2199943210
        3987894921
        9856789892
        8767896789
        9899965678
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("15", day09.part1(day09.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("1134", day09.part2(day09.parseInput(input)))
    }
}