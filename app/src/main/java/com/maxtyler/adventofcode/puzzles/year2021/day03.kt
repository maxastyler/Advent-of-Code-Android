package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day03 : Puzzle<List<List<Int>>> {

    private fun countBits(bits: List<List<Int>>): Pair<List<Int>, List<Int>> =
        bits.fold(List(bits.first().count(), { 0 })) { counts, cs ->
            counts.zip(cs).map { (count, v) -> count + v }
        }.let { counts ->
            Pair(
                counts.map { if (it >= bits.count() / 2.0) 1 else 0 },
                counts.map { if (it >= bits.count() / 2.0) 0 else 1 }
            )
        }

    override fun parseInput(input: String) = input.lines().map { it.map { it.digitToInt() } }

    override fun part1(input: List<List<Int>>): String {
        val (pop, unpop) = countBits(input)
        val gamma = pop.joinToString("").toInt(2)
        val epsilon = unpop.joinToString("").toInt(2)
        return "${gamma * epsilon}"
    }

    override fun part2(input: List<List<Int>>): String {
        val oxygen = generateSequence(input to 0) { (bits, i) ->
            if (bits.count() <= 1) null else {
                bits.filter { it[i] == countBits(bits).first[i] } to i + 1
            }
        }.last().first.first()
        val co2 = generateSequence(input to 0) { (bits, i) ->
            if (bits.count() <= 1) null else {
                bits.filter { it[i] == countBits(bits).second[i] } to i + 1
            }
        }.last().first.first()

        return "${oxygen.joinToString("").toInt(2) * co2.joinToString("").toInt(2)}"
    }
}