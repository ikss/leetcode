package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestPositiveIntegerThatExistsWithItsNegativeTest {
    @Test
    fun test1() {
        val nums = intArrayOf(-1, 2, -3, 3)
        val expected = 3

        assertEquals(expected, LargestPositiveIntegerThatExistsWithItsNegative.findMaxKSet(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, 10, 6, 7, -7, 1)
        val expected = 7

        assertEquals(expected, LargestPositiveIntegerThatExistsWithItsNegative.findMaxKSet(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-10, 8, 6, 7, -2, -3)
        val expected = -1

        assertEquals(expected, LargestPositiveIntegerThatExistsWithItsNegative.findMaxKSet(nums))
    }
}