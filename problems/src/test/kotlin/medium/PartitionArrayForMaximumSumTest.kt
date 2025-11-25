package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PartitionArrayForMaximumSumTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 15, 7, 9, 2, 5, 10)
        val k = 3
        val expected = 84

        assertEquals(expected, PartitionArrayForMaximumSum.maxSumAfterPartitioning(arr, k))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3)
        val k = 4
        val expected = 83

        assertEquals(expected, PartitionArrayForMaximumSum.maxSumAfterPartitioning(arr, k))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(1)
        val k = 1
        val expected = 1

        assertEquals(expected, PartitionArrayForMaximumSum.maxSumAfterPartitioning(arr, k))
    }
}