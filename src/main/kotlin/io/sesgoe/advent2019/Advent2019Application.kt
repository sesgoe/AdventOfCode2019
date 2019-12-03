package io.sesgoe.advent2019

import io.sesgoe.advent2019.day1.Day1
import io.sesgoe.advent2019.day1.day1InputAsList
import io.sesgoe.advent2019.day2.Day2
import io.sesgoe.advent2019.day2.calculateNounAndVerbForDay2Part2
import io.sesgoe.advent2019.day2.getFreshDay2InputAsIntCodeProgram

fun main() {

	println("Day 1 [Part 1] Answer: ${Day1().calculateFuelPart1ForListOfMasses(day1InputAsList)}")
	println("Day 1 [Part 2] Answer: ${Day1().calculateTotalFuelPart2ForListOfMasses(day1InputAsList)}")

	println("Day 2 [Part 1] Answer: ${Day2(getFreshDay2InputAsIntCodeProgram()).alterInputParameters(12,2).executeProgram()[0]}")
	val day2Part2NounAndVerb = calculateNounAndVerbForDay2Part2()
	println("Day 2 [Part 2] Answer: ${day2Part2NounAndVerb.first * 100 + day2Part2NounAndVerb.second}")
}
