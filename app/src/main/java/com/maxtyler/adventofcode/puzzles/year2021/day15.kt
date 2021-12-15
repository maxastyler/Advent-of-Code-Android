package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle
import java.util.*
import kotlin.math.absoluteValue

object day15 : Puzzle<Map<Pair<Int, Int>, Int>> {
    override fun parseInput(input: String) =
        input.lines().flatMapIndexed { i, l -> l.mapIndexed { j, c -> (i to j) to c.digitToInt() } }
            .toMap()

    fun heuristic(pointA: Pair<Int, Int>, pointB: Pair<Int, Int>) =
        (pointB.first - pointA.first).absoluteValue + (pointB.second - pointA.second).absoluteValue

    val neighbours = listOf(
        -1 to 0,
        1 to 0,
        0 to -1,
        0 to 1
    )

    fun aStar(
        points: Map<Pair<Int, Int>, Int>,
        start: Pair<Int, Int>,
        end: Pair<Int, Int>
    ): List<Pair<Int, Int>>? {
        val scores = mutableMapOf<Pair<Int, Int>, Pair<Int, Pair<Int, Int>?>>(start to (0 to null))
        val queue = PriorityQueue<Pair<Int, Int>>(1) { p1, p2 ->
            compareValues(
                scores[p1]!!.first + heuristic(
                    p1,
                    end
                ), scores[p2]!!.first + heuristic(p2, end)
            )
        }
        queue.add(start)
        while (queue.isNotEmpty()) {
            val current = queue.poll()!!
            if (current == end) {
                val path = mutableListOf(current)
                var cameFrom = current
                while (true) {
                    when (val parent = scores[cameFrom]!!.second) {
                        null -> return path
                        else -> {
                            path.add(parent)
                            cameFrom = parent
                        }
                    }
                }

            }
            neighbours.forEach { (dx, dy) ->
                val neighbour = current.first + dx to current.second + dy
                points[neighbour]?.let { risk ->
                    val newScore = risk + scores[current]!!.first
                    if (newScore < scores[neighbour]?.first ?: Int.MAX_VALUE) {
                        scores.put(neighbour, newScore to current)
                        if (neighbour !in queue) {
                            queue.add(neighbour)
                        }
                    }
                }
            }
        }
        return null
    }

    override fun part1(input: Map<Pair<Int, Int>, Int>) = aStar(
        input,
        0 to 0,
        input.maxByOrNull { it.key.first + it.key.second }!!.key
    )!!.dropLast(1).map { input[it]!! }.sum().toString()

    override fun part2(input: Map<Pair<Int, Int>, Int>): String {
        val height = input.maxOf { it.key.first } + 1
        val width = input.maxOf { it.key.second } + 1
        val bigger = (0..4).flatMap { m ->
            (0..4).flatMap { n ->
                input.map { (k, v) ->
                    (m * height + k.first to n * width + k.second) to ((v - 1) + m + n).mod(
                        9
                    ) + 1
                }
            }
        }.toMap()
        return aStar(
            bigger, 0 to 0,
            bigger.maxByOrNull { it.key.first + it.key.second }!!.key
        )!!.dropLast(1).map { bigger[it]!! }.sum().toString()
    }

}