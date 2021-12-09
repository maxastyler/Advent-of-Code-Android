package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

data class Clue(val signals: List<Set<Char>>, val output: List<Set<Char>>) {
    fun solve(): List<Int> {
        val mapping: MutableMap<Int, Set<Char>> = mutableMapOf()
        mapping[1] = this.signals.find { it.size == 2 }!!
        mapping[4] = this.signals.find { it.size == 4 }!!
        mapping[7] = this.signals.find { it.size == 3 }!!
        mapping[8] = this.signals.find { it.size == 7 }!!
        mapping[6] =
            this.signals.find { ((it - mapping[1]!!).size == 5) and !(it in mapping.values) }!!
        mapping[5] = this.signals.find {
            (it.intersect(mapping[8]!! - mapping[6]!!).isEmpty()) and !(it in mapping.values)
        }!!
        mapping[9] =
            this.signals.find { (it.intersect(mapping[4]!!).size == 4) and !(it in mapping.values) }!!
        mapping[2] =
            this.signals.find { (it.intersect(mapping[4]!!).size == 2) and !(it in mapping.values) }!!
        mapping[3] =
            this.signals.find { (it.intersect(mapping[8]!!).size == 5) and !(it in mapping.values) }!!
        println(this.signals.count { !(it in mapping.values) })
        mapping[0] = this.signals.find { !(it in mapping.values) }!!
        return this.output.mapNotNull { digit -> mapping.firstNotNullOfOrNull { if (it.value == digit) it.key else null } }
    }

}

object day08 : Puzzle<List<Clue>> {
    override fun parseInput(input: String) = input.split("\n").map {
        val (signal, output) = it.split("|")
        val r = Regex("(\\w+)")
        Clue(
            r.findAll(signal).map { it.value.toSet() }.toList(),
            r.findAll(output).map { it.value.toSet() }.toList()
        )
    }

    override fun part1(input: List<Clue>) = input.fold(0) { count, clue ->
        count + clue.output.count { it.size in listOf(2, 3, 4, 7) }
    }.toString()

    override fun part2(input: List<Clue>) =
        input.fold(0) { acc, clue -> clue.solve().joinToString("").toInt().plus(acc) }
            .toString()
}