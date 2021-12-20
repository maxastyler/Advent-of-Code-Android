package com.maxtyler.adventofcode.puzzles.year2021

object Year2021 {
    fun runAll() {
        listOf(
            day01,
            day02,
            day03,
            day04,
            day05,
            day06,
            day07,
            day08,
            day09,
            day10,
            day11,
            day12,
            day13,
            day14,
            day15,
            day16,
            day17,
            day18,
            day19
        ).forEach { day ->
            INPUTS2021[day::class.simpleName]?.let { input ->
                println("${day::class.simpleName}")
                day.runPuzzle(input)
            }
        }
    }
}