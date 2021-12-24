package com.maxtyler.adventofcode.puzzles.year2021

import junit.framework.Assert.assertEquals
import org.junit.Test

class day24Test {
    @Test
    fun negationPrograme() {
        val prog = """
            inp x
            mul x -1
        """.trimIndent()
        val program = day24.parseInput(prog)
        assertEquals(
            -20,
            day24.runInstructions(program, day24.Environment(listOf(20)))?.state?.get('x')
        )
        assertEquals(
            300,
            day24.runInstructions(
                program,
                day24.Environment(listOf(-300))
            )?.state?.get('x')
        )
        assertEquals(
            null,
            day24.runInstructions(program, day24.Environment(listOf()))?.state?.get('x')
        )
    }

    @Test
    fun twoInputProgram() {
        val prog = """
            inp z
            inp x
            mul z 3
            eql z x
        """.trimIndent()

        val instructs = day24.parseInput(prog)
        assertEquals(
            1,
            day24.runInstructions(instructs, day24.Environment(listOf(2, 6)))?.state?.get('z')
        )
        assertEquals(
            0,
            day24.runInstructions(instructs, day24.Environment(listOf(2, 7)))?.state?.get('z')
        )
        assertEquals(
            0,
            day24.runInstructions(instructs, day24.Environment(listOf(2, 100)))?.state?.get('z')
        )
    }

    @Test
    fun binDeconProgram() {
        val prog = """
            inp w
            add z w
            mod z 2
            div w 2
            add y w
            mod y 2
            div w 2
            add x w
            mod x 2
            div w 2
            mod w 2
        """.trimIndent()
        val instructs = day24.parseInput(prog)
        assertEquals(15,
            day24.runInstructions(instructs, day24.Environment(listOf(0b1111)))?.let { (_, m) ->
                m.keys.sorted().reversed().mapIndexed { i, c -> m[c]!! shl i }.sum()
            })
        assertEquals(0b0000,
            day24.runInstructions(instructs, day24.Environment(listOf(0b0000)))?.let { (_, m) ->
                m.keys.sorted().reversed().mapIndexed { i, c -> m[c]!! shl i }.sum()
            })
        assertEquals(0b1010,
            day24.runInstructions(instructs, day24.Environment(listOf(0b1010)))?.let { (_, m) ->
                m.keys.sorted().reversed().mapIndexed { i, c -> m[c]!! shl i }.sum()
            })
    }
}