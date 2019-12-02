package io.sesgoe.advent2019

import io.sesgoe.advent2019.day1.Day1
import io.sesgoe.advent2019.day1.day1InputAsList
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class Advent2019Tests {

	@Test
	fun `Returns correct answer for day1 input`() {
		Assertions.assertEquals(3_216_868, Day1().calculateTotalFuelForListOfMasses(day1InputAsList))
	}

}
