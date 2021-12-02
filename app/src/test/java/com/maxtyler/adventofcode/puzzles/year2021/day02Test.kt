package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day02Test {

    val input = """
        forward 5
        down 5
        forward 8
        up 3
        down 8
        forward 2
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("150", day02.part1(day02.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("900", day02.part2(day02.parseInput(input)))
    }
}