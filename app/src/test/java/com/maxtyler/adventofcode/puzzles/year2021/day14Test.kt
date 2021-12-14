package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day14Test {
    val input = """
        NNCB

        CH -> B
        HH -> N
        CB -> H
        NH -> C
        HB -> C
        HC -> B
        HN -> C
        NN -> C
        BH -> H
        NC -> B
        NB -> B
        BN -> B
        BB -> N
        BC -> B
        CC -> N
        CN -> C
    """.trimIndent()

    @Test
    fun part1Test() {
        assertEquals("1588", day14.part1(day14.parseInput(input)))
    }

    @Test
    fun part2Test() {
        assertEquals("2188189693529", day14.part2(day14.parseInput(input)))
    }
}