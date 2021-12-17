package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.*
import org.junit.Test

class day17Test {
    val input = "target area: x=20..30, y=-10..-5"
    @Test
    fun part1Test() {
        assertEquals("45", day17.part1(day17.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("112", day17.part2(day17.parseInput(input)))
    }

}