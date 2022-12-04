package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumAverageDifferenceTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 5, 3, 9, 5, 3)
        val expected = 3

        assertEquals(expected, MinimumAverageDifference.minimumAverageDifference(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0)
        val expected = 0

        assertEquals(expected, MinimumAverageDifference.minimumAverageDifference(nums))
    }
}