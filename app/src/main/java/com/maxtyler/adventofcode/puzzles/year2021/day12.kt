package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

@OptIn(kotlin.ExperimentalStdlibApi::class)
object day12 : Puzzle<Map<day12.Node, Set<day12.Node>>> {
    sealed class Node {
        data class Big(val name: String) : Node()
        data class Small(val name: String) : Node()
        object Start : Node()
        object End : Node()
    }

    override fun parseInput(input: String): Map<Node, Set<Node>> =
        input
            .lines()
            .map {
                it.split("-")
                    .map {
                        when {
                            it == "start" -> Node.Start
                            it == "end" -> Node.End
                            it.all { it.isLowerCase() } -> Node.Small(it)
                            else -> Node.Big(it)
                        }
                    }
            }.fold(mapOf<Node, Set<Node>>()) { m, (n1, n2) ->
                m + (n1 to ((m[n1] ?: setOf()) + n2)) + (n2 to ((m[n2] ?: setOf()) + n1))
            }


    val findPathsP1 =
        DeepRecursiveFunction<Pair<Map<Node, Set<Node>>, List<Node>>, List<List<Node>>> { (graph, currentPath) ->
            val currentNode = currentPath.last()
            when (currentNode) {
                Node.End -> listOf(currentPath)
                else -> {
                    graph[currentNode]!!.filter { (it is Node.Big) or (it is Node.End) or ((it is Node.Small) and !(it in currentPath)) }
                        .flatMap { callRecursive(graph to currentPath + it) }
                }
            }
        }

    val findPathsP2 =
        DeepRecursiveFunction<Triple<Map<Node, Set<Node>>, List<Node>, Node?>, List<List<Node>>> { (graph, currentPath, usedTwice) ->
            val currentNode = currentPath.last()
            when (currentNode) {
                Node.End -> listOf(currentPath)
                else -> {
                    graph[currentNode]!!.mapNotNull { n ->
                        when (n) {
                            is Node.Big -> callRecursive(Triple(graph, currentPath + n, usedTwice))
                            is Node.End -> callRecursive(Triple(graph, currentPath + n, usedTwice))
                            is Node.Small -> {
                                val count = currentPath.count { it == n }
                                when {
                                    count == 0 -> callRecursive(
                                        Triple(
                                            graph,
                                            currentPath + n,
                                            usedTwice
                                        )
                                    )
                                    (count == 1) and (usedTwice == null) -> callRecursive(
                                        Triple(
                                            graph,
                                            currentPath + n,
                                            n
                                        )
                                    )
                                    else -> null
                                }
                            }
                            is Node.Start -> null
                        }
                    }.flatten()
                }
            }
        }

    override fun part1(input: Map<Node, Set<Node>>) =
        findPathsP1(input to listOf(Node.Start)).size.toString()


    override fun part2(input: Map<Node, Set<Node>>) =
        findPathsP2(Triple(input, listOf(Node.Start), null)).size.toString()

}