package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day05Test {

    val input = """
0,9 -> 5,9
8,0 -> 0,8
9,4 -> 3,4
2,2 -> 2,1
7,0 -> 7,4
6,4 -> 2,0
0,9 -> 2,9
3,4 -> 1,4
0,0 -> 8,8
5,5 -> 8,2
    """

    @Test
    fun part1Test() {
        assertEquals("5", day05.part1(day05.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("12", day05.part2(day05.parseInput(input)))
    }
}