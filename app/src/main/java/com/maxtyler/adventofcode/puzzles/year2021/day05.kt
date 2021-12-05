package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import kotlin.math.absoluteValue

data class Line(val start: Pair<Int, Int>, val end: Pair<Int, Int>) {
    fun isBasic() = (start.first == end.first) or (start.second == end.second)
    fun points(): List<Pair<Int, Int>> {
        val dx = (end.first - start.first).absoluteValue
        val dy = -((end.second - start.second).absoluteValue)
        val sx = if (start.first < end.first) 1 else -1
        val sy = if (start.second < end.second) 1 else -1
        val error = dx + dy
        return generateSequence(Triple(start.first, start.second, error)) { (x0, y0, err) ->
            if ((x0 == end.first) and (y0 == end.second)) null else {
                val e2 = err * 2
                var (newX, newY, newE) = Triple(x0, y0, err)
                if (e2 >= dy) {
                    newE += dy
                    newX += sx
                }
                if (e2 <= dx) {
                    newE += dx
                    newY += sy
                }
                Triple(newX, newY, newE)
            }
        }.map { (x, y, _) -> x to y }.toList()
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