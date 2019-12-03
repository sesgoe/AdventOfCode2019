package io.sesgoe.advent2019.day2

class Day2(private var program: IntCodeProgram) {

    fun alterInputParameters(noun: Int, verb: Int): Day2 {
        program[1] = noun
        program[2] = verb
        return Day2(program)
    }

    fun executeProgram(): IntCodeProgram {

        var opCodeIndex = 0

        while(program[opCodeIndex] != 99) {
            program = handleOperationAtIndex(opCodeIndex)
            opCodeIndex += 4
        }

        return program

    }

    private fun handleOperationAtIndex(opCodeIndex: Int): IntCodeProgram {
        val opCode = program[opCodeIndex]
        return when(opCode) {
            1 -> add(program[opCodeIndex + 1], program[opCodeIndex + 2], program[opCodeIndex + 3])
            2 -> multiply(program[opCodeIndex + 1], program[opCodeIndex + 2], program[opCodeIndex + 3])
            99 -> program
            else -> throw RuntimeException("Something broke! Opcode received: ${program[opCodeIndex]}")
        }
    }

    private fun add(register1Index: Int, register2Index: Int, resultRegister: Int) : IntCodeProgram{

        val arg1 = program[register1Index]
        val arg2 = program[register2Index]

        program[resultRegister] = arg1 + arg2

        return program

    }

    private fun multiply(register1Index: Int, register2Index: Int, resultRegister: Int): IntCodeProgram {
        val arg1 = program[register1Index]
        val arg2 = program[register2Index]

        program[resultRegister] = arg1 * arg2

        return program
    }

}

fun calculateNounAndVerbForDay2Part2(): Pair<Int, Int> {

    val expectedResult = 19_690_720

    for (i in 0..99) {
        for (j in 0..99) {
            val result = Day2(getFreshDay2InputAsIntCodeProgram()).alterInputParameters(i, j).executeProgram()[0]
            if(result == expectedResult) {
                return Pair(i, j)
            }
        }
    }

    return Pair(-1, -1)

}