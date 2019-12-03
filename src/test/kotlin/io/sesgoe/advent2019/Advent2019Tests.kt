package io.sesgoe.advent2019

import io.sesgoe.advent2019.day1.Day1
import io.sesgoe.advent2019.day1.day1InputAsList
import io.sesgoe.advent2019.day2.Day2
import io.sesgoe.advent2019.day2.calculateNounAndVerbForDay2Part2
import io.sesgoe.advent2019.day2.getFreshDay2InputAsIntCodeProgram
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class Advent2019Tests {

	@Test
	fun `Returns correct answer for day1 input (Part 1)`() {
		Assertions.assertEquals(3_216_868, Day1().calculateFuelPart1ForListOfMasses(day1InputAsList))
	}

	@Test
	fun `Returns correct answer for day1 input (Part 2)`() {
		Assertions.assertEquals(4_822_435, Day1().calculateTotalFuelPart2ForListOfMasses(day1InputAsList))
	}

	@Test
	fun `Returns correct answer for day2 input (Part 1)`() {
		Assertions.assertEquals(6_627_023, Day2(getFreshDay2InputAsIntCodeProgram()).alterInputParameters(12,2).executeProgram()[0])
	}

	@Test
	fun `Returns correct answer for day2 input (Part 2)`() {

		val resultPair = calculateNounAndVerbForDay2Part2()
		val result = resultPair.first * 100 + resultPair.second

		Assertions.assertEquals(4019, result)
	}

}
