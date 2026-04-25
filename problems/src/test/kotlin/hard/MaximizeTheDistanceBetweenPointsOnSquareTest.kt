package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeTheDistanceBetweenPointsOnSquareTest {
    @Test
    fun test1() {
        val side = 2
        val points = arrayOf(intArrayOf(0, 2), intArrayOf(2, 0), intArrayOf(2, 2), intArrayOf(0, 0))
        val k = 4
        val expected = 2

        assertEquals(expected, MaximizeTheDistanceBetweenPointsOnSquare.maxDistance(side, points, k))
    }

    @Test
    fun test2() {
        val side = 2
        val points = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 2),
            intArrayOf(2, 0),
            intArrayOf(2, 2),
            intArrayOf(2, 1),
        )
        val k = 4
        val expected = 1

        assertEquals(expected, MaximizeTheDistanceBetweenPointsOnSquare.maxDistance(side, points, k))
    }

    @Test
    fun test3() {
        val side = 2
        val points = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 2),
            intArrayOf(2, 0),
            intArrayOf(2, 2),
            intArrayOf(2, 1),
        )
        val k = 5
        val expected = 1

        assertEquals(expected, MaximizeTheDistanceBetweenPointsOnSquare.maxDistance(side, points, k))
    }
}