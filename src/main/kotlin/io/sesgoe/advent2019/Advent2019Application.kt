package io.sesgoe.advent2019

import io.sesgoe.advent2019.day1.Day1
import io.sesgoe.advent2019.day1.day1InputAsList

fun main() {

	println("Day 1 [Part 1] Answer: ${Day1().calculateFuelPart1ForListOfMasses(day1InputAsList)}")
	println("Day 1 [Part 2] Answer: ${Day1().calculateTotalFuelPart2ForListOfMasses(day1InputAsList)}")

}
