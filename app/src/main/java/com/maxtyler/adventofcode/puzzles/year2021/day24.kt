package com.maxtyler.adventofcode.puzzles.year2021

import com.maxtyler.adventofcode.puzzles.Puzzle

object day24 : Puzzle<List<day24.Instruction>> {
    fun product(ls: List<List<Int>>): Sequence<List<Int>> =
        if (ls.size == 1) ls.first().asSequence().map { listOf(it) }
        else ls.first().asSequence().flatMap { product(ls.subList(1, ls.size)) }

    data class Environment(
        val inputs: List<Int> = listOf(),
        val state: Map<Char, Int> = mapOf('w' to 0, 'x' to 0, 'y' to 0, 'z' to 0)
    )

    sealed class ArgType {
        data class Num(val x: Int) : ArgType() {
            override fun resolve(environment: Environment) = this.x
        }

        data class Pointer(val x: Char) : ArgType() {
            override fun resolve(environment: Environment) = environment.state[x]
        }

        abstract fun resolve(environment: Environment): Int?
    }

    sealed class Instruction {
        abstract fun operate(e: Environment): Environment?
        data class Inp(val a: Char) : Instruction() {
            override fun operate(e: Environment) = e.inputs.firstOrNull()?.let {
                Environment(
                    e.inputs.subList(1, e.inputs.size),
                    e.state + (a to it)
                )
            }
        }

        data class Add(val a: Char, val b: ArgType) : Instruction() {
            override fun operate(e: Environment) =
                e.state[a]?.let { av ->
                    b.resolve(e)?.let { bv -> e.copy(state = e.state + (a to (av + bv))) }
                }
        }

        data class Mul(val a: Char, val b: ArgType) : Instruction() {
            override fun operate(e: Environment) =
                e.state[a]?.let { av ->
                    b.resolve(e)?.let { bv -> e.copy(state = e.state + (a to (av * bv))) }
                }
        }

        data class Div(val a: Char, val b: ArgType) : Instruction() {
            override fun operate(e: Environment) =
                e.state[a]?.let { av ->
                    b.resolve(e)?.let { bv ->
                        if (bv == 0) null else {
                            e.copy(state = e.state + (a to (av.floorDiv(bv))))
                        }
                    }
                }
        }

        data class Mod(val a: Char, val b: ArgType) : Instruction() {
            override fun operate(e: Environment) =
                e.state[a]?.let { av ->
                    if (av < 0) null else {
                        b.resolve(e)?.let { bv ->
                            if (bv <= 0) null else {
                                e.copy(state = e.state + (a to (av.mod(bv))))
                            }
                        }
                    }
                }
        }

        data class Eql(val a: Char, val b: ArgType) : Instruction() {
            override fun operate(e: Environment) =
                e.state[a]?.let { av ->
                    b.resolve(e)
                        ?.let { bv -> e.copy(state = e.state + (a to if (av == bv) 1 else 0)) }
                }

        }
    }

    override fun parseInput(input: String) = input.lines().map {
        when (it.take(3)) {
            "inp" -> Instruction.Inp(it.drop(3).trim().first())
            else -> {
                val (ins, v1, v2) = it.split(" ")
                val a = v1.trim().first()
                val b = v2.trim().toIntOrNull()?.let { ArgType.Num(it) }
                    ?: ArgType.Pointer(v2.trim().first())
                when (ins) {
                    "add" -> Instruction.Add(a, b)
                    "mul" -> Instruction.Mul(a, b)
                    "div" -> Instruction.Div(a, b)
                    "mod" -> Instruction.Mod(a, b)
                    else -> Instruction.Eql(a, b)
                }
            }
        }
    }

    fun runInstructions(input: List<Instruction>, environment: Environment): Environment? {
        var newEnvironment = environment
        input.forEach {
            newEnvironment = it.operate(newEnvironment) ?: return null
        }
        return newEnvironment
    }

    override fun part1(input: List<Instruction>) =
        product(List(14) { (1..9).toList() }).map {
            runInstructions(
                input,
                Environment(it)
            )
        }.first().toString()

    override fun part2(input: List<Instruction>): String {
        TODO("Not yet implemented")
    }
}