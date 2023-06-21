package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToMakeArrayEqualTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 5, 2)
        val cost = intArrayOf(2, 3, 1, 14)
        val expected = 8L

        assertEquals(expected, MinimumCostToMakeArrayEqual.minCost(nums, cost))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val cost = intArrayOf(4, 2, 8, 1, 3)
        val expected = 0L

        assertEquals(expected, MinimumCostToMakeArrayEqual.minCost(nums, cost))
    }
}