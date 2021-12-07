package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.*
import org.junit.Test

class day07Test {
    val input = "16,1,2,0,4,2,7,1,2,14"

    @Test
    fun part1Test() {
        assertEquals("37", day07.part1(day07.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("168", day07.part2(day07.parseInput(input)))
    }
}