package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PartitionEqualSubsetSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 5, 11, 5)
        val expected = true

        assertEquals(expected, PartitionEqualSubsetSum.canPartition(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 5)
        val expected = false

        assertEquals(expected, PartitionEqualSubsetSum.canPartition(nums))
    }
}