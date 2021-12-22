package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.*
import org.junit.Test

class day21Test {
    val input = """
    Player 1 starting position: 4
    Player 2 starting position: 8
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("739785", day21.part1(day21.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("444356092776315", day21.part2(day21.parseInput(input)))
    }

}