package io.sesgoe.advent2019.day1

import kotlin.math.floor

class Day1 {

    fun calculateFuel(mass: Int): Int {
        return (floor((mass / 3).toDouble()) - 2).toInt()
    }

    fun calculateTotalFuelForListOfMasses(listOfMasses: List<Int>): Int {
        return listOfMasses.map { mass -> calculateFuel(mass) }.sum()
    }

}