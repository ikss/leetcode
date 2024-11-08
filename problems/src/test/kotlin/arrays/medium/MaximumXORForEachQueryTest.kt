package arrays.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MaximumXORForEachQueryTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 1, 3)
        val maximumBit = 2
        val expected = intArrayOf(3, 3, 3, 3, 7)

        assertArrayEquals(expected, MaximumXORForEachQuery.getMaximumXor(nums, maximumBit))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4, 7)
        val maximumBit = 3
        val expected = intArrayOf(5, 2, 3, 4, 7)

        assertArrayEquals(expected, MaximumXORForEachQuery.getMaximumXor(nums, maximumBit))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 1, 2, 2, 5, 7)
        val maximumBit = 3
        val expected = intArrayOf(7, 5, 2, 2, 5, 7, 7)

        assertArrayEquals(expected, MaximumXORForEachQuery.getMaximumXor(nums, maximumBit))
    }
}