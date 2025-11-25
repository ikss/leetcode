package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfArrowsToBurstBalloonsTest {

    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(10, 16), intArrayOf(2, 8), intArrayOf(1, 6), intArrayOf(7, 12))
        val expected = 2

        assertEquals(expected, MinimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6), intArrayOf(7, 8))
        val expected = 4

        assertEquals(expected, MinimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points))
    }

    @Test
    fun test3() {
        val points = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5))
        val expected = 2

        assertEquals(expected, MinimumNumberOfArrowsToBurstBalloons.findMinArrowShots(points))
    }
}