package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeMaxDistanceToGasStationTest {
    @Test
    fun test1Heap() {
        val stations = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val k = 9
        val expected = 0.5

        assertEquals(expected, MinimizeMaxDistanceToGasStation.minmaxGasDistHeap(stations, k), 1e-6)
    }

    @Test
    fun test2Heap() {
        val stations = intArrayOf(23, 24, 36, 39, 46, 56, 57, 65, 84, 98)
        val k = 1
        val expected = 14.0

        assertEquals(expected, MinimizeMaxDistanceToGasStation.minmaxGasDistHeap(stations, k), 1e-6)
    }

    @Test
    fun test3Heap() {
        val stations = intArrayOf(10, 19, 25, 27, 56, 63, 70, 87, 96, 97)
        val k = 3
        val expected = 9.666666

        assertEquals(expected, MinimizeMaxDistanceToGasStation.minmaxGasDistHeap(stations, k), 1e-6)
    }

    @Test
    fun test4Heap() {
        val stations = intArrayOf(3, 6, 12, 19, 33, 44, 67, 72, 89, 95)
        val k = 2
        val expected = 14.0

        assertEquals(expected, MinimizeMaxDistanceToGasStation.minmaxGasDistHeap(stations, k), 1e-6)
    }
}