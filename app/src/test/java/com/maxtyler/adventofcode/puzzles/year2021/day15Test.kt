package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day15Test {
    val input = """
        1163751742
        1381373672
        2136511328
        3694931569
        7463417111
        1319128137
        1359912421
        3125421639
        1293138521
        2311944581
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("40", day15.part1(day15.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("315", day15.part2(day15.parseInput(input)))
    }
}