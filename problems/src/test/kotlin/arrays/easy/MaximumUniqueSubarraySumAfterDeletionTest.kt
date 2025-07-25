package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumUniqueSubarraySumAfterDeletionTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = 15

        assertEquals(expected, MaximumUniqueSubarraySumAfterDeletion.maxSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 0, 1, 1)
        val expected = 1

        assertEquals(expected, MaximumUniqueSubarraySumAfterDeletion.maxSum(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, -1, -2, 1, 0, -1)
        val expected = 3

        assertEquals(expected, MaximumUniqueSubarraySumAfterDeletion.maxSum(nums))
    }
}