package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubarraySumsDivisibleByKTest {
    @Test
    fun test1naive() {
        val nums = intArrayOf(4, 5, 0, -2, -3, 1)
        val k = 5
        val expected = 7

        assertEquals(expected, SubarraySumsDivisibleByK.subarraysDivByKNaive(nums, k))
    }

    @Test
    fun test2naive() {
        val nums = intArrayOf(5)
        val k = 9
        val expected = 0

        assertEquals(expected, SubarraySumsDivisibleByK.subarraysDivByKNaive(nums, k))
    }

    @Test
    fun test1prefixSum() {
        val nums = intArrayOf(4, 5, 0, -2, -3, 1)
        val k = 5
        val expected = 7

        assertEquals(expected, SubarraySumsDivisibleByK.subarraysDivByKPrefixSum(nums, k))
    }

    @Test
    fun test2prefixSum() {
        val nums = intArrayOf(5)
        val k = 9
        val expected = 0

        assertEquals(expected, SubarraySumsDivisibleByK.subarraysDivByKPrefixSum(nums, k))
    }
}