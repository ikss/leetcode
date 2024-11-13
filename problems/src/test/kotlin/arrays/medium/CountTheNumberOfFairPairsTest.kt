package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfFairPairsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 7, 4, 4, 5)
        val lower = 3
        val upper = 6
        val output = 6L

        assertEquals(output, CountTheNumberOfFairPairs.countFairPairs(nums, lower, upper))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 7, 9, 2, 5)
        val lower = 11
        val upper = 11
        val output = 1L

        assertEquals(output, CountTheNumberOfFairPairs.countFairPairs(nums, lower, upper))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 0, 0, 0, 0, 0)
        val lower = -10
        val upper = 10
        val output = 15L

        assertEquals(output, CountTheNumberOfFairPairs.countFairPairs(nums, lower, upper))
    }
}