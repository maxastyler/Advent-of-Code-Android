package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day06Test {

    val input = "3,4,3,1,2"

    @Test
    fun part1Test() {
        assertEquals("5934", day06.part1(day06.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("26984457539", day06.part2(day06.parseInput(input)))
    }
}