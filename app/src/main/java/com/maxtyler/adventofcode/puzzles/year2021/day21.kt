package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day21 : Puzzle<Pair<Int, Int>> {

    override fun parseInput(input: String) =
        Regex("Player \\d+ starting position: (\\d+)").findAll(input).let {
            val (p1, p2) = it.toList()
            Pair(p1.destructured.component1().toInt(), p2.destructured.component1().toInt())
        }

    data class GameState(val p1Pos: Int, val p2Pos: Int, val p1Score: Int = 0, val p2Score: Int = 0)

    override fun part1(input: Pair<Int, Int>) = generateSequence(
        (1..100).toList()
    ) { it }
        .flatten()
        .chunked(3)
        .map { it.sum() }
        .scanIndexed(GameState(input.first.dec(), input.second.dec())) { i, gs, m ->
            val (p1, p2, p1s, p2s) = gs
            when {
                i.mod(2) == 0 -> (p1 + m).mod(10)
                    .let { gs.copy(p1Pos = it, p1Score = p1s + it.inc()) }
                else -> (p2 + m).mod(10).let { gs.copy(p2Pos = it, p2Score = p2s + it.inc()) }
            }
        }.withIndex().first { (_, g) -> (g.p1Score >= 1000) || (g.p2Score >= 1000) }
        .let { (i, state) ->
            i * 3 * minOf(state.p1Score, state.p2Score)
        }
        .toString()

    fun filterStates(s: Triple<Long, Long, Map<day21.GameState, Long>>): Triple<Long, Long, Map<day21.GameState, Long>> {
        val newStates = mutableMapOf<day21.GameState, Long>()
        var p1Counts = s.first
        var p2Counts = s.second
        s.third.forEach { (state, count) ->
            when {
                state.p1Score >= 21 -> p1Counts += count
                state.p2Score >= 21 -> p2Counts += count
                else -> newStates.merge(state, count) { a, b -> a + b }
            }
        }
        return Triple(p1Counts, p2Counts, newStates.toMap())
    }

    val movements =
        (1..3).flatMap { a -> (1..3).flatMap { b -> (1..3).map { c -> a + b + c } } }
            .groupingBy { it }
            .eachCount()


    fun evolveGameStates(states: Map<day21.GameState, Long>, p1: Boolean) = if (p1) {
        states.flatMap { (s, n) ->
            movements.map { (d, m) ->
                val newPos = (s.p1Pos + d).mod(10)
                s.copy(p1Pos = newPos, p1Score = s.p1Score + newPos.inc()) to (n * m)
            }
        }
    } else {
        states.flatMap { (s, n) ->
            movements.map { (d, m) ->
                val newPos = (s.p2Pos + d).mod(10)
                s.copy(p2Pos = newPos, p2Score = s.p2Score + newPos.inc()) to (n * m)
            }
        }
    }.groupBy { it.first }.mapValues { it.value.fold(0L) { a, (_, v) -> a + v } }


    override fun part2(input: Pair<Int, Int>): String {
        var gameState = Triple(0L, 0L, mapOf(day21.GameState(input.first.dec(), input.second.dec()) to 1L))
        var p1Turn = true
        while (gameState.third.isNotEmpty()) {
            gameState =
                filterStates(gameState.copy(third = evolveGameStates(gameState.third, p1Turn)))
            p1Turn = !p1Turn
        }
        return maxOf(gameState.first, gameState.second).toString()
    }
}