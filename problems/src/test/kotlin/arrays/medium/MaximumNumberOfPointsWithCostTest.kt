package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfPointsWithCostTest {
    @Test
    fun test1SimpleDp() {
        val points = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(1, 5, 1),
            intArrayOf(3, 1, 1),
        )
        val expected = 9L

        assertEquals(expected, MaximumNumberOfPointsWithCost.maxPointsSimpleDp(points))
    }
    
    @Test
    fun test2SimpleDp() {
        val points = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(4, 2),
        )
        val expected = 11L

        assertEquals(expected, MaximumNumberOfPointsWithCost.maxPointsSimpleDp(points))
    }
    @Test
    fun test1LeftRightMaxDp() {
        val points = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(1, 5, 1),
            intArrayOf(3, 1, 1),
        )
        val expected = 9L

        assertEquals(expected, MaximumNumberOfPointsWithCost.maxPointsLeftRightMaxDp(points))
    }

    @Test
    fun test2LeftRightMaxDp() {
        val points = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(4, 2),
        )
        val expected = 11L

        assertEquals(expected, MaximumNumberOfPointsWithCost.maxPointsLeftRightMaxDp(points))
    }
}