package data_structures.arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumUnitsOnTruckTest {
    @Test
    fun test1() {
        val boxTypes = arrayOf(intArrayOf(1, 3), intArrayOf(2, 2), intArrayOf(3, 1))
        val truckSize = 4
        val expected = 8

        assertEquals(expected, MaximumUnitsOnTruck.maximumUnits(boxTypes, truckSize))
    }

    @Test
    fun test2() {
        val boxTypes = arrayOf(intArrayOf(5, 10), intArrayOf(2, 5), intArrayOf(4, 7), intArrayOf(3, 9))
        val truckSize = 10
        val expected = 91

        assertEquals(expected, MaximumUnitsOnTruck.maximumUnits(boxTypes, truckSize))
    }
}
