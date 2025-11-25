package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximumXORForEachQueryTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 1, 3)
        val maximumBit = 2
        val expected = intArrayOf(0, 3, 2, 3)

        assertArrayEquals(expected, MaximumXORForEachQuery.getMaximumXor(nums, maximumBit))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4, 7)
        val maximumBit = 3
        val expected = intArrayOf(5, 2, 6, 5)

        assertArrayEquals(expected, MaximumXORForEachQuery.getMaximumXor(nums, maximumBit))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 1, 2, 2, 5, 7)
        val maximumBit = 3
        val expected = intArrayOf(4, 3, 6, 4, 6, 7)

        assertArrayEquals(expected, MaximumXORForEachQuery.getMaximumXor(nums, maximumBit))
    }
}