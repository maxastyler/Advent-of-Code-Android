package com.maxtyler.adventofcode.puzzles.year2021

object Year2021 {
    fun runAll() {
        listOf(day01, day02, day03, day04, day05, day06, day07, day08, day09).forEach { day ->
            INPUTS2021[day::class.simpleName]?.let { input ->
                println("${day::class.simpleName}")
                day.runPuzzle(input) }
        }
    }
}