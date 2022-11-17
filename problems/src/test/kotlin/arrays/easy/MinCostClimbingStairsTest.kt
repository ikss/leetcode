package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinCostClimbingStairsTest {
    @Test
    fun test1() {
        val cost = intArrayOf(10, 15, 20)
        val expected = 15

        assertEquals(expected, MinCostClimbingStairs.minCostClimbingStairs(cost))
    }

    @Test
    fun test2() {
        val cost = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
        val expected = 6

        assertEquals(expected, MinCostClimbingStairs.minCostClimbingStairs(cost))
    }
}
