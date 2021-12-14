package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

@OptIn(kotlin.ExperimentalStdlibApi::class)
object day14 : Puzzle<day14.Polymer> {

    data class Polymer(val start: String, val rules: Map<Pair<Char, Char>, Char>) {

        fun foldingCounts() = generateSequence(start.zipWithNext().groupingBy { it }.eachCount()
            .mapValues { it.value.toLong() }) {
            buildMap {
                it.forEach { (outerPair, count) ->
                    val middle = rules[outerPair]!!
                    merge(outerPair.first to middle, count, Long::plus)
                    merge(middle to outerPair.second, count, Long::plus)
                }
            }
        }.map {
            buildMap<Char, Long> {
                it.forEach { (k, v) ->
                    merge(k.first, v, Long::plus)
                    merge(k.second, v, Long::plus)
                }
                computeIfPresent(start.first()) { _, v -> v.inc() }
                computeIfPresent(start.last()) { _, v -> v.inc() }
            }.mapValues { (_, v) -> v / 2 }
        }
    }

    override fun parseInput(input: String): Polymer {
        val (start, rules) = input.split("\n\n")
        return Polymer(start, Regex("([A-Z])([A-Z]) -> ([A-Z])").findAll(rules).associate {
            val (p1, p2, r) = it.destructured
            (p1.first() to p2.first()) to r.first()
        })
    }

    override fun part1(input: Polymer) =
        input.foldingCounts().elementAt(10).let { it.maxOf { it.value } - it.minOf { it.value } }
            .toString()

    override fun part2(input: Polymer) =
        input.foldingCounts().elementAt(40).let { it.maxOf { it.value } - it.minOf { it.value } }
            .toString()


}