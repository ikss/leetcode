package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeVisitingAllPointsTest {
    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0))
        val expected = 7

        assertEquals(expected, MinimumTimeVisitingAllPoints.minTimeToVisitAllPoints(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(3, 2), intArrayOf(-2, 2))
        val expected = 5

        assertEquals(expected, MinimumTimeVisitingAllPoints.minTimeToVisitAllPoints(points))
    }
}