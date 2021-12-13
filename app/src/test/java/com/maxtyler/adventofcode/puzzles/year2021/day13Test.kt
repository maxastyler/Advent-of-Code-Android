package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day13Test {
    val input = """
        6,10
        0,14
        9,10
        0,3
        10,4
        4,11
        6,0
        6,12
        4,1
        0,13
        10,12
        3,4
        3,0
        8,4
        1,10
        2,14
        8,10
        9,0

        fold along y=7
        fold along x=5
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("17", day13.part1(day13.parseInput(input)))
    }
}