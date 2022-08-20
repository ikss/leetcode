package data_structures.arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfRefuelingStopsTest {

    @Test
    fun test1dp() {
        val target = 1
        val startFuel = 1
        val stations = emptyArray<IntArray>()
        val expected = 0

        assertEquals(expected, MinimumNumberOfRefuelingStops.minRefuelStopsDp(target, startFuel, stations))
    }

    @Test
    fun test2dp() {
        val target = 100
        val startFuel = 1
        val stations = arrayOf(intArrayOf(10, 100))
        val expected = -1

        assertEquals(expected, MinimumNumberOfRefuelingStops.minRefuelStopsDp(target, startFuel, stations))
    }

    @Test
    fun test3dp() {
        val target = 100
        val startFuel = 10
        val stations = arrayOf(intArrayOf(10, 60), intArrayOf(20, 30), intArrayOf(30, 30), intArrayOf(60, 40))
        val expected = 2

        assertEquals(expected, MinimumNumberOfRefuelingStops.minRefuelStopsDp(target, startFuel, stations))
    }

    @Test
    fun test1heap() {
        val target = 1
        val startFuel = 1
        val stations = emptyArray<IntArray>()
        val expected = 0

        assertEquals(expected, MinimumNumberOfRefuelingStops.minRefuelStopsHeap(target, startFuel, stations))
    }

    @Test
    fun test2heap() {
        val target = 100
        val startFuel = 1
        val stations = arrayOf(intArrayOf(10, 100))
        val expected = -1

        assertEquals(expected, MinimumNumberOfRefuelingStops.minRefuelStopsHeap(target, startFuel, stations))
    }

    @Test
    fun test3heap() {
        val target = 100
        val startFuel = 10
        val stations = arrayOf(intArrayOf(10, 60), intArrayOf(20, 30), intArrayOf(30, 30), intArrayOf(60, 40))
        val expected = 2

        assertEquals(expected, MinimumNumberOfRefuelingStops.minRefuelStopsHeap(target, startFuel, stations))
    }
}
