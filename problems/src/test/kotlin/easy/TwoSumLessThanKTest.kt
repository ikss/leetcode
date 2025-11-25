package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoSumLessThanKTest {
    @Test
    fun test1() {
        val nums = intArrayOf(34, 23, 1, 24, 75, 33, 54, 8)
        val k = 60
        val expected = 58

        assertEquals(expected, TwoSumLessThanK.twoSumLessThanK(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, 20, 30)
        val k = 15
        val expected = -1

        assertEquals(expected, TwoSumLessThanK.twoSumLessThanK(nums, k))
    }
}