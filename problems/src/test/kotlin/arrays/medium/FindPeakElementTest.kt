package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindPeakElementTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 1)
        val expected = 2

        assertEquals(expected, FindPeakElement.findPeakElement(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 1, 3, 5, 6, 4)
        val expected = 1

        assertEquals(expected, FindPeakElement.findPeakElement(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2)
        val expected = 1

        assertEquals(expected, FindPeakElement.findPeakElement(nums))
    }
}
