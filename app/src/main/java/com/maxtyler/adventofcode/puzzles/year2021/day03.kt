package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day03 : Puzzle<List<List<Char>>> {

    private fun countBits(chars: List<List<Char>>): List<Int> =
        chars.fold(List(chars.first().count(), { 0 })) { counts, cs ->
            counts.zip(cs.toList()).map { (count, char) ->
                count + if (char == '1') 1 else 0
            }
        }

    override fun parseInput(input: String) = input.lines().map { it.toList() }.toList()

    override fun part1(input: List<List<Char>>): String {
        val counts = countBits(input)
        val gamma =
            String(counts.map { if (it > input.count() / 2) '1' else '0' }.toCharArray()).toInt(2)
        val epsilon =
            String(counts.map { if (it <= input.count() / 2) '1' else '0' }.toCharArray()).toInt(2)
        return "${gamma * epsilon}"
    }

    override fun part2(input: List<List<Char>>): String {
        val bitLength = input.first().count()
        val counts = countBits(input)
        var (oxygen, co2) = input.partition { (counts[0] > input.count() / 2) == (it[0] == '1') }
        var position = 1
        while (position < bitLength) {
            if (oxygen.count() > 1) {
                oxygen = oxygen.filter {
                    countBits(oxygen)[position].let { n ->
                        if (n.toDouble() == oxygen.count() / 2.0) {
                            it[position] == '1'
                        } else {
                            (it[position] == '1') == (n > oxygen.count() / 2.0)
                        }
                    }
                }
            }
            if (co2.count() > 1) {
                co2 =
                    co2.filter {
                        countBits(co2)[position].let { n ->
                            if (n.toDouble() == co2.count() / 2.0) {
                                it[position] == '0'
                            } else {
                                (it[position] == '1') == (n < co2.count() / 2.0)
                            }
                        }
                    }
            }
            position += 1
        }

        return "${
            String(oxygen.first().toCharArray()).toInt(2) * String(
                co2.first().toCharArray()
            ).toInt(2)
        }"
    }
}