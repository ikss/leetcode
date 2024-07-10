package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubarraySumEqualsKTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 1)
        val k = 2
        val expected = 2

        assertEquals(expected, SubarraySumEqualsK.subarraySum(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3)
        val k = 3
        val expected = 2

        assertEquals(expected, SubarraySumEqualsK.subarraySum(nums, k))
    }
}