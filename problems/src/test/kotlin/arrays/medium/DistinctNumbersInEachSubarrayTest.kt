package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DistinctNumbersInEachSubarrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 2, 2, 1, 3)
        val k = 3
        val expected = intArrayOf(3, 2, 2, 2, 3)

        assertArrayEquals(expected, DistinctNumbersInEachSubarray.distinctNumbers(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1, 2, 3, 4)
        val k = 4
        val expected = intArrayOf(1, 2, 3, 4)

        assertArrayEquals(expected, DistinctNumbersInEachSubarray.distinctNumbers(nums, k))
    }
}