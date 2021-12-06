package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import kotlin.math.sign

data class Line(val start: Pair<Int, Int>, val end: Pair<Int, Int>) {
    fun isBasic() = (start.first == end.first) or (start.second == end.second)
    fun points(): List<Pair<Int, Int>> {
        val dx = (end.first - start.first).sign
        val dy = (end.second - start.second).sign
        return generateSequence(start.first to start.second) { (x, y) ->
            if ((x == end.first) and (y == end.second)) null else (x + dx to y + dy)
        }.toList()
    }
}

object day05 : Puzzle<List<Line>> {
    override fun parseInput(input: String): List<Line> =
        Regex("(\\d+),(\\d+) -> (\\d+),(\\d+)").findAll(input).map {
            val (x1, y1, x2, y2) = it.destructured
            Line(x1.toInt() to y1.toInt(), x2.toInt() to y2.toInt())
        }.toList()

    override fun part1(input: List<Line>) =
        input.filter { it.isBasic() }.flatMap { it.points() }.groupingBy { it }.eachCount()
            .count { (_, v) -> v > 1 }.toString()

    override fun part2(input: List<Line>) =
        input.flatMap { it.points() }.groupingBy { it }.eachCount().count { (_, v) -> v > 1 }
            .toString()
}