package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeMaximumOfArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 7, 1, 6)
        val expected = 5

        assertEquals(expected, MinimizeMaximumOfArray.minimizeArrayValue(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, 1)
        val expected = 10

        assertEquals(expected, MinimizeMaximumOfArray.minimizeArrayValue(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(6, 9, 3, 8, 14)
        val expected = 8

        assertEquals(expected, MinimizeMaximumOfArray.minimizeArrayValue(nums))
    }
}