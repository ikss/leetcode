package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountElementsWithMaximumFrequencyTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2, 3, 1, 4)
        val expected = 4

        assertEquals(expected, CountElementsWithMaximumFrequency.maxFrequencyElements(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = 5

        assertEquals(expected, CountElementsWithMaximumFrequency.maxFrequencyElements(nums))
    }
}