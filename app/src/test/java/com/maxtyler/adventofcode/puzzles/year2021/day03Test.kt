package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day03Test {

    val input = """
        00100
        11110
        10110
        10111
        10101
        01111
        00111
        11100
        10000
        11001
        00010
        01010
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("198", day03.part1(day03.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("230", day03.part2(day03.parseInput(input)))
    }
}