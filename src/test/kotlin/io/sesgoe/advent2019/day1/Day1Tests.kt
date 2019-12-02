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
    fun `For mass of 1969, the fuel required is 654`() {
        Assertions.assertEquals(654, Day1().calculateFuel(1969))
    }

    @Test
    fun `For mass of 100_756, the fuel required is 33_583`() {
        Assertions.assertEquals(33_583, Day1().calculateFuel(100_756))
    }

    @Test
    fun `For mass list of (12, 14), the fuel required is (2 + 2 = 4)`() {
        val listOfMasses = listOf<Int>(12, 14)
        Assertions.assertEquals(4, Day1().calculateTotalFuelForListOfMasses(listOfMasses))
    }

    @Test
    fun `For mass list of (12, 14, 1969), the fuel required is (2 + 2 + 654 = 658)`() {
        val listOfMasses = listOf<Int>(12, 14, 1969)
        Assertions.assertEquals(658, Day1().calculateTotalFuelForListOfMasses(listOfMasses))
    }

}