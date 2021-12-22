package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day22 : Puzzle<List<day22.Instruction>> {
    data class Instruction(val state: Boolean, val x: IntRange, val y: IntRange, val z: IntRange)

    override fun parseInput(input: String) =
        Regex("(on|off) x=(-?\\d+)..(-?\\d+),y=(-?\\d+)..(-?\\d+),z=(-?\\d+)..(-?\\d+)")
            .findAll(input)
            .map {
                val (state, xMin, xMax, yMin, yMax, zMin, zMax) = it.destructured
                Instruction(
                    state == "on",
                    xMin.toInt()..xMax.toInt(),
                    yMin.toInt()..yMax.toInt(),
                    zMin.toInt()..zMax.toInt()
                )
            }.toList()

    override fun part1(input: List<Instruction>): String {
        val points: MutableMap<Triple<Int, Int, Int>, Boolean> = (-50..50).flatMap { x ->
            (-50..50).flatMap { y ->
                (-50..50).map { z ->
                    Triple(
                        x,
                        y,
                        z
                    ) to false
                }
            }
        }.toMap() as MutableMap<Triple<Int, Int, Int>, Boolean>

        input.forEach { (state, xs, ys, zs) ->
            (maxOf(xs.start, -50)..minOf(xs.last, 50)).forEach { x ->
                (maxOf(ys.start, -50)..minOf(ys.last, 50)).forEach { y ->
                    (maxOf(zs.start, -50)..minOf(zs.last, 50)).forEach { z ->
                        points.put(Triple(x, y, z), state)
                    }
                }
            }
        }
        return points.count { it.value }.toString()
    }

    override fun part2(input: List<Instruction>): String {
        TODO("Not yet implemented")
    }
}