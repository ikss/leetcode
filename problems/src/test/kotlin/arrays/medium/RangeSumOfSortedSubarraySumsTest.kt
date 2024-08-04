package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RangeSumOfSortedSubarraySumsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val n = 4
        val left = 1
        val right = 5
        val expected = 13

        assertEquals(expected, RangeSumOfSortedSubarraySums.rangeSum(nums, n, left, right))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val n = 4
        val left = 3
        val right = 4
        val expected = 6

        assertEquals(expected, RangeSumOfSortedSubarraySums.rangeSum(nums, n, left, right))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 4)
        val n = 4
        val left = 1
        val right = 10
        val expected = 50

        assertEquals(expected, RangeSumOfSortedSubarraySums.rangeSum(nums, n, left, right))
    }
}