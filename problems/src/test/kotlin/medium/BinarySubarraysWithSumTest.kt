package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySubarraysWithSumTest {
    @Test
    fun test1prefixSum() {
        val nums = intArrayOf(1, 0, 1, 0, 1)
        val goal = 2
        val expected = 4

        assertEquals(expected, BinarySubarraysWithSum.numSubarraysWithSumPrefixSum(nums, goal))
    }

    @Test
    fun test2prefixSum() {
        val nums = intArrayOf(0, 0, 0, 0, 0)
        val goal = 0
        val expected = 15

        assertEquals(expected, BinarySubarraysWithSum.numSubarraysWithSumPrefixSum(nums, goal))
    }

    @Test
    fun test1prefixZeroes() {
        val nums = intArrayOf(1, 0, 1, 0, 1)
        val goal = 2
        val expected = 4

        assertEquals(expected, BinarySubarraysWithSum.numSubarraysWithSumPrefixZeroes(nums, goal))
    }

    @Test
    fun test2prefixZeroes() {
        val nums = intArrayOf(0, 0, 0, 0, 0)
        val goal = 0
        val expected = 15

        assertEquals(expected, BinarySubarraysWithSum.numSubarraysWithSumPrefixZeroes(nums, goal))
    }
}