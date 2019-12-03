package io.sesgoe.advent2019.day2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day2Tests {

    @Test
    fun `1+1=2 small program executes successfully`() {

        val program = mutableListOf(1, 0, 0, 0, 99)
        val result = mutableListOf(2, 0, 0, 0, 99)

        Assertions.assertEquals(result, Day2(program).executeProgram())

    }

    @Test
    fun `3*2=6 small program executes successfully`() {
        val program = mutableListOf(2, 3, 0, 3, 99)
        val result = mutableListOf(2, 3, 0, 6, 99)

        Assertions.assertEquals(result, Day2(program).executeProgram())
    }

    @Test
    fun `99*99=9801 small program executes successfully`() {
        val program = mutableListOf(2, 4, 4, 5, 99, 0)
        val result = mutableListOf(2, 4, 4, 5, 99, 9801)

        Assertions.assertEquals(result, Day2(program).executeProgram())
    }

    @Test
    fun `(1,1,1,4,99,5,6,0,99) becomes (30,1,1,4,2,5,6,0,99)`() {
        val program = mutableListOf(1,1,1,4,99,5,6,0,99)
        val result = mutableListOf(30,1,1,4,2,5,6,0,99)

        Assertions.assertEquals(result, Day2(program).executeProgram())
    }

}