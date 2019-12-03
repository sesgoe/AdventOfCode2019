package io.sesgoe.advent2019.day1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day1Tests {

    @Test
    fun `For mass of 12, the fuel required is 2`() {
        Assertions.assertEquals(2, Day1().calculateFuel(12))
    }

    @Test
    fun `For mass of 14, the fuel required is 2`() {
        Assertions.assertEquals(2, Day1().calculateFuel(14))
    }

    @Test
    fun `For mass of 1_969, the fuel required is 654`() {
        Assertions.assertEquals(654, Day1().calculateFuel(1_969))
    }

    @Test
    fun `For mass of 100_756, the fuel required is 33_583`() {
        Assertions.assertEquals(33_583, Day1().calculateFuel(100_756))
    }

    @Test
    fun `For mass list of (12, 14), the fuel required is (2 + 2 = 4)`() {
        val listOfMasses = listOf<Int>(12, 14)
        Assertions.assertEquals(4, Day1().calculateFuelPart1ForListOfMasses(listOfMasses))
    }

    @Test
    fun `For mass list of (12, 14, 1_969), the fuel required is (2 + 2 + 654 = 658)`() {
        val listOfMasses = listOf<Int>(12, 14, 1_969)
        Assertions.assertEquals(658, Day1().calculateFuelPart1ForListOfMasses(listOfMasses))
    }

    @Test
    fun `For mass part 2 of 1_969, the total fuel required is (654 + 216 + 70 + 21 + 5 = 966)`() {
        Assertions.assertEquals(966, Day1().calculateTotalFuelForModule(1_969))
    }

    @Test
    fun `For mass part 2 of 100_756, the total fuel required is 50_346`() {
        Assertions.assertEquals(50_346, Day1().calculateTotalFuelForModule(100_756))
    }

    @Test
    fun `For mass part 2 list of (12, 14, 1_969), the total fuel required is (2 + 2 + 966 = 970)`() {
        val listOfMasses = listOf<Int>(12, 14, 1_969)
        Assertions.assertEquals(970, Day1().calculateTotalFuelPart2ForListOfMasses(listOfMasses))
    }

}