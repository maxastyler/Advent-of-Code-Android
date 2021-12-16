package com.maxtyler.adventofcode.puzzles.year2021

import org.junit.Assert.assertEquals
import org.junit.Test

class day16Test {
    val p1Inputs = mapOf(
        "8A004A801A8002F478" to "16",
        "620080001611562C8802118E34" to "12",
        "C0015000016115A2E0802F182340" to "23",
        "A0016C880162017C3686B18A3D4780" to "31"
    )

    val p2Inputs = mapOf(
        "C200B40A82" to "3",
        "04005AC33890" to "54",
        "880086C3E88112" to "7",
        "CE00C43D881120" to "9",
        "D8005AC2A8F0" to "1",
        "F600BC2D8F" to "0",
        "9C005AC2F8F0" to "0",
        "9C0141080250320F1802104A08" to "1"
    )

    @Test
    fun part1Test() {
        p1Inputs.forEach { (input, result) ->
            assertEquals(
                result,
                day16.part1(day16.parseInput(input))
            )
        }
    }

    @Test
    fun part2Test() {
        p2Inputs.forEach { (input, result) ->
            assertEquals(result, day16.part2(day16.parseInput(input)))
        }
    }
}