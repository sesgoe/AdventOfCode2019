package io.sesgoe.advent2019

import io.sesgoe.advent2019.day1.Day1
import io.sesgoe.advent2019.day1.day1InputAsList
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class Advent2019Tests {

	@Test
	fun `Returns correct answer for day1 input part 1`() {
		Assertions.assertEquals(3_216_868, Day1().calculateFuelPart1ForListOfMasses(day1InputAsList))
	}

	@Test
	fun `Returns correct answer for day1 input part 2`() {
		Assertions.assertEquals(4_822_435, Day1().calculateTotalFuelPart2ForListOfMasses(day1InputAsList))
	}

}
