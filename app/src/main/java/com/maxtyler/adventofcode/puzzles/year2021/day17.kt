package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import kotlin.math.absoluteValue

object day17 : Puzzle<Pair<Pair<Int, Int>, Pair<Int, Int>>> {
    val triangularNumbers = generateSequence(0 to 0) { (n, _) -> (n + 1 to (n + 1) * (n + 2) / 2) }

    override fun parseInput(input: String) =
        Regex("x=(-?\\d+)..(-?\\d+), y=(-?\\d+)..(-?\\d+)").find(input)!!.let {
            val (xMin, xMax, yMin, yMax) = it.destructured
            Pair(xMin.toInt() to xMax.toInt(), yMin.toInt() to yMax.toInt())
        }

    override fun part1(input: Pair<Pair<Int, Int>, Pair<Int, Int>>) =
        triangularNumbers.takeWhile { it.first < input.second.first.absoluteValue }
            .map { (_, pos) ->
                triangularNumbers.takeWhile { -it.second >= input.second.first - pos }
                    .any { -it.second <= input.second.second - pos }
            }.mapIndexedNotNull { i, b -> if (b) i to b else null }.last()
            .let { (i, _) -> i * (i + 1) / 2 }.toString()

    override fun part2(input: Pair<Pair<Int, Int>, Pair<Int, Int>>): String {
        val (minX, maxX) = input.first
        val (minY, maxY) = input.second
        return triangularNumbers.takeWhile { it.first <= input.first.second }
            .flatMap { (xVel, xOffset) ->
                triangularNumbers.takeWhile { it.first < input.second.first.absoluteValue }
                    .flatMap { (yVel, yOffset) ->
                        val xs = triangularNumbers.take(xVel + 1).toList().asReversed()
                        val yPosPath = (triangularNumbers.take(yVel + 1).toList().asReversed()
                            .asSequence() + triangularNumbers).map { yOffset - it.second }
                        val yNegPath = triangularNumbers.drop(yVel).map { yOffset - it.second }
                        val velList = mutableListOf<Int>()
                        if ((xs.asSequence() + generateSequence { 0 to 0 }).map { xOffset - it.second }
                                .zip(yPosPath)
                                .takeWhile { (x, y) -> (x <= maxX) and (y >= minY) }
                                .any { (x, y) -> (x >= minX) and (y <= maxY) }
                        ) velList.add(yVel)
                        if ((xs.asSequence() + generateSequence { 0 to 0 }).map { xOffset - it.second }
                                .zip(yNegPath)
                                .takeWhile { (x, y) -> (x <= maxX) and (y >= minY) }
                                .any { (x, y) -> (x >= minX) and (y <= maxY) }
                        ) velList.add(-yVel)
                        velList
                    }.map { xVel to it }
            }.count().toString()
    }
}