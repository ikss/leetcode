package arrays.medium

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindTheHighestAltitudeTest {
    @Test
    fun test1() {
        val grid = intArrayOf(-5, 1, 5, 0, -7)
        val expected = 1

        Assertions.assertEquals(expected, FindTheHighestAltitude.largestAltitude(grid))
    }

    @Test
    fun test2() {
        val grid = intArrayOf(-4, -3, -2, -1, 4, 3, 2)
        val expected = 0

        Assertions.assertEquals(expected, FindTheHighestAltitude.largestAltitude(grid))
    }
}