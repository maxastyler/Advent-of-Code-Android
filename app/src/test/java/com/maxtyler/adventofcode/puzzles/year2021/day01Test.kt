package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day01Test {

    @Test
    fun part1Test() {
        val input = """199
200
208
210
200
207
240
269
260
263"""
        assertEquals("7", day01.part1(day01.parseInput(input)))
    }

    @Test
    fun part2Test() {
        val input = """199
200
208
210
200
207
240
269
260
263"""
        assertEquals("5", day01.part2(day01.parseInput(input)))
    }
}