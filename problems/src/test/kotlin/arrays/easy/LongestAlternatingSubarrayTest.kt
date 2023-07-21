package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestAlternatingSubarrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 4, 3, 4)
        val expected = 4

        assertEquals(expected, LongestAlternatingSubarray.alternatingSubarray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 5, 6)
        val expected = 2

        assertEquals(expected, LongestAlternatingSubarray.alternatingSubarray(nums))
    }

}