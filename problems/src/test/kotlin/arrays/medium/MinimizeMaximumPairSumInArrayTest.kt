package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeMaximumPairSumInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 5, 2, 3)
        val expected = 7

        assertEquals(expected, MinimizeMaximumPairSumInArray.minPairSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 5, 4, 2, 4, 6)
        val expected = 8

        assertEquals(expected, MinimizeMaximumPairSumInArray.minPairSum(nums))
    }
}