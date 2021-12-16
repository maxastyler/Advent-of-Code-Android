package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle


@OptIn(kotlin.ExperimentalStdlibApi::class)
object day16 : Puzzle<String> {
    private fun <T> Sequence<T>.takeWhileInclusive(
        predicate: (T) -> Boolean
    ): Sequence<T> {
        var shouldContinue = true
        return takeWhile {
            val result = shouldContinue
            shouldContinue = predicate(it)
            result
        }
    }

    sealed class Packet(open val version: Int) {
        data class Literal(override val version: Int, val number: Long) : Packet(version)
        data class Operator(
            override val version: Int,
            val opId: Int,
            val subPackets: List<Packet>
        ) : Packet(version)
    }

    private val packetParser =
        DeepRecursiveFunction<Sequence<Char>, Pair<Packet, Sequence<Char>>?> { cs ->
            val version =
                cs.take(3).joinToString("").toIntOrNull(2) ?: return@DeepRecursiveFunction null
            val typeId =
                cs.drop(3).take(3).joinToString("").toIntOrNull(2)
                    ?: return@DeepRecursiveFunction null
            when {
                typeId == 4 -> {
                    val litSequence =
                        cs.drop(6).chunked(5).takeWhileInclusive { it.firstOrNull() == '1' }
                    val dropNum = 6 + litSequence.count() * 5
                    Pair(
                        Packet.Literal(
                            version,
                            cs.drop(6).chunked(5).takeWhileInclusive { it.firstOrNull() == '1' }
                                .flatMap { it.drop(1) }.joinToString("").toLong(2)
                        ), cs.drop(dropNum)
                    )
                }
                else -> {
                    val opString = cs.drop(6)
                    when (opString.firstOrNull()) {
                        '0' -> {
                            val bitLength = opString.drop(1).take(15).joinToString("").toInt(2)
                            val childPackets = buildList {
                                var chars = opString.drop(16).take(bitLength)
                                do {
                                    val result = callRecursive(chars)
                                    result?.let {
                                        add(it.first)
                                        chars = it.second
                                    }
                                } while (result != null)
                            }
                            Pair(
                                Packet.Operator(version, typeId, childPackets),
                                opString.drop(16 + bitLength)
                            )
                        }
                        '1' -> {
                            val numChildren = opString.drop(1).take(11).joinToString("").toLong(2)
                            var chars = opString.drop(12)
                            val childPackets = buildList {
                                while (this.size < numChildren) {
                                    callRecursive(chars)?.let {
                                        add(it.first)
                                        chars = it.second
                                    } ?: return@DeepRecursiveFunction null
                                }
                            }
                            Pair(Packet.Operator(version, typeId, childPackets), chars)
                        }
                        else -> null
                    }
                }
            }
        }


    override fun parseInput(input: String) =
        input.map { it.digitToInt(16).toString(2).padStart(4, '0') }.joinToString("")

    override fun part1(input: String) = packetParser(input.asSequence())?.let { rootPacket ->
        val vSum = DeepRecursiveFunction<Packet, Int> { p ->
            when (p) {
                is Packet.Literal -> p.version
                is Packet.Operator -> p.version + p.subPackets.map { callRecursive(it) }.sum()
            }
        }
        vSum(rootPacket.first).toString()
    } ?: ""

    override fun part2(input: String) = packetParser(input.asSequence())?.let { (rootPacket, _) ->
        val value = DeepRecursiveFunction<Packet, Long> { p ->
            when (p) {
                is Packet.Literal -> p.number
                is Packet.Operator -> {
                    when (p.opId) {
                        0 -> p.subPackets.sumOf { callRecursive(it) }
                        1 -> p.subPackets.fold(1) { a, v -> a * callRecursive(v) }
                        2 -> p.subPackets.minOf { callRecursive(it) }
                        3 -> p.subPackets.maxOf { callRecursive(it) }
                        5 -> if (callRecursive(p.subPackets.first()) > callRecursive(p.subPackets.last())) 1 else 0
                        6 -> if (callRecursive(p.subPackets.first()) < callRecursive(p.subPackets.last())) 1 else 0
                        else -> if (callRecursive(p.subPackets.first()) == callRecursive(p.subPackets.last())) 1 else 0
                    }
                }
            }
        }
        value(rootPacket).toString()
    } ?: ""

}