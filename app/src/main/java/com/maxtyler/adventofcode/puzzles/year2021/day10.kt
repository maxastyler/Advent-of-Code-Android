package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import java.util.*

object day10 : Puzzle<List<String>> {
    sealed class ParseError {
        data class Corrupted(val score: Long) : ParseError()
        data class Incomplete(val score: Long) : ParseError()
    }

    val completions = mapOf('(' to ')', '[' to ']', '{' to '}', '<' to '>')
    val scoresCorrupted = mapOf(')' to 3L, ']' to 57, '}' to 1197, '>' to 25137)
    val scoresIncomplete = mapOf(')' to 1, ']' to 2, '}' to 3, '>' to 4)

    override fun parseInput(input: String) = input.lines()

    fun scoreLine(line: String): ParseError {
        val stack = ArrayDeque<Char>()
        for (c in line) {
            when (c) {
                '(', '[', '{', '<' -> stack.push(c)
                ')', ']', '}', '>' -> if (completions[stack.pop()] != c) return ParseError.Corrupted(
                    scoresCorrupted[c]!!
                )
            }
        }
        return ParseError.Incomplete(stack.fold(0) { a, v -> a * 5 + scoresIncomplete[completions[v]!!]!! })
    }

    override fun part1(input: List<String>) =
        input.map(::scoreLine).filterIsInstance<ParseError.Corrupted>()
            .sumOf { it.score }.toString()

    override fun part2(input: List<String>) =
        input.map(::scoreLine).filterIsInstance<ParseError.Incomplete>().map { it.score }.sorted()
            .let { scores -> scores[scores.size / 2] }.toString()
}