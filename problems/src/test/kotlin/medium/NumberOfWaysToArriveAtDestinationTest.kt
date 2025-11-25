package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWaysToArriveAtDestinationTest {
    @Test
    fun test1() {
        val n = 7
        val roads = arrayOf(
            intArrayOf(0, 6, 7),
            intArrayOf(0, 1, 2),
            intArrayOf(1, 2, 3),
            intArrayOf(1, 3, 3),
            intArrayOf(6, 3, 3),
            intArrayOf(3, 5, 1),
            intArrayOf(6, 5, 1),
            intArrayOf(2, 5, 1),
            intArrayOf(0, 4, 5),
            intArrayOf(4, 6, 2),
        )
        val expected = 4

        assertEquals(expected, NumberOfWaysToArriveAtDestination.countPaths(n, roads))
    }

    @Test
    fun test2() {
        val n = 2
        val roads = arrayOf(
            intArrayOf(1, 0, 10),
        )
        val expected = 1

        assertEquals(expected, NumberOfWaysToArriveAtDestination.countPaths(n, roads))
    }
}