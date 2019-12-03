package io.sesgoe.advent2019.day1

import kotlin.math.floor

class Day1 {

    fun calculateFuel(mass: Int): Int {
        return (floor((mass / 3).toDouble()) - 2).toInt()
    }

    fun calculateTotalFuelForModule(mass: Int): Int {
        var totalFuel = 0
        var fuelPart = calculateFuel(mass)

        while(fuelPart >= 0) {
            totalFuel += fuelPart
            fuelPart = calculateFuel(fuelPart)
        }

        return totalFuel
    }

    fun calculateFuelPart1ForListOfMasses(listOfMasses: List<Int>): Int {
        return listOfMasses.map { mass -> calculateFuel(mass) }.sum()
    }

    fun calculateTotalFuelPart2ForListOfMasses(listOfMasses: List<Int>): Int {
        return listOfMasses.map { mass -> calculateTotalFuelForModule(mass)}.sum()
    }

}