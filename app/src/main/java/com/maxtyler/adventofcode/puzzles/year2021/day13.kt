package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day13 : Puzzle<day13.Folds> {
    enum class Direction { Up, Left }

    data class Folds(val points: Set<Pair<Int, Int>>, val folds: List<Pair<Direction, Int>>) {
        fun doFolds() = generateSequence(this) { (points, folds) ->
            folds.firstOrNull()?.let { (dir, pos) ->
                Folds(points.map { (x, y) ->
                    when (dir) {
                        Direction.Up -> Pair(x, if (y > pos) pos - (y - pos) else y)
                        Direction.Left -> Pair(if (x > pos) pos - (x - pos) else x, y)
                    }
                }.toSet(), folds.drop(1))
            }
        }.map { it.points }
    }

    override fun parseInput(input: String) = Folds(
        Regex("(\\d+),(\\d+)").findAll(input)
            .map {
                val (x, y) = it.destructured
                Pair(x.toInt(), y.toInt())
            }.toSet(),
        Regex("fold along ([xy])=(\\d+)").findAll(input).map {
            val (dir, pos) = it.destructured
            Pair(if (dir == "x") Direction.Left else Direction.Up, pos.toInt())
        }.toList()
    )

    override fun part1(input: Folds) = input.doFolds().elementAt(1).size.toString()

    override fun part2(input: Folds) = "\n" + input.doFolds().last().let { p ->
        val sizeX = p.maxOf { it.first }
        val sizeY = p.maxOf { it.second }
        (0..sizeY).map { y ->
            (0..sizeX).map { x -> if ((x to y) in p) '#' else '.' }.joinToString("")
        }.joinToString("\n")
    }
}