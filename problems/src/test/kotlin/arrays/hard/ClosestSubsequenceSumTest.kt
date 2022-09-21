package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClosestSubsequenceSumTest {

    @Test
    fun test1() {
        val nums = intArrayOf(5, -7, 3, 5)
        val goal = 6
        val expected = 0

        assertEquals(expected, ClosestSubsequenceSum.minAbsDifference(nums, goal))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(7, -9, 15, -2)
        val goal = -5
        val expected = 1

        assertEquals(expected, ClosestSubsequenceSum.minAbsDifference(nums, goal))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val goal = -7
        val expected = 7

        assertEquals(expected, ClosestSubsequenceSum.minAbsDifference(nums, goal))
    }
}
