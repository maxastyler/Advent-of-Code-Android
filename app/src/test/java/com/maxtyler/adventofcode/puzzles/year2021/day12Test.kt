package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day12Test {
    val inputs = mapOf(
        """
            start-A
            start-b
            A-c
            A-b
            b-d
            A-end
            b-end
        """.trimIndent() to ("10" to "36"),
        """
            dc-end
            HN-start
            start-kj
            dc-start
            dc-HN
            LN-dc
            HN-end
            kj-sa
            kj-HN
            kj-dc
        """.trimIndent() to ("19" to "103"),
        """
            fs-end
            he-DX
            fs-he
            start-DX
            pj-DX
            end-zg
            zg-sl
            zg-pj
            pj-he
            RW-he
            fs-DX
            pj-RW
            zg-RW
            start-pj
            he-WI
            zg-he
            pj-fs
            start-RW
        """.trimIndent() to ("226" to "3509")
    )

    @Test
    fun part1Test() {
        inputs.forEach { (input, result) ->
            assertEquals(result.first, day12.part1(day12.parseInput(input)))
        }
    }

    @Test
    fun part2Test() {
        inputs.forEach { (input, result) ->
            assertEquals(result.second, day12.part2(day12.parseInput(input)))
        }
    }
}