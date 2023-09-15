package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinCostToConnectAllPointsTest {
    @Test
    fun test1() {
        val points = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(2, 2),
            intArrayOf(3, 10),
            intArrayOf(5, 2),
            intArrayOf(7, 0),
        )
        val expected = 20

        assertEquals(expected, MinCostToConnectAllPoints.minCostConnectPoints(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(
            intArrayOf(3, 12),
            intArrayOf(-2, 5),
            intArrayOf(-4, 1),
        )
        val expected = 18

        assertEquals(expected, MinCostToConnectAllPoints.minCostConnectPoints(points))
    }
}