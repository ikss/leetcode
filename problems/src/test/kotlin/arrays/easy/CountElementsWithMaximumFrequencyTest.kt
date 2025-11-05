package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountElementsWithMaximumFrequencyTest {
    @Test
    fun test1Map() {
        val nums = intArrayOf(1, 2, 2, 3, 1, 4)
        val expected = 4

        assertEquals(expected, CountElementsWithMaximumFrequency.maxFrequencyElementsMap(nums))
    }

    @Test
    fun test2Map() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = 5

        assertEquals(expected, CountElementsWithMaximumFrequency.maxFrequencyElementsMap(nums))
    }

    @Test
    fun test1Array() {
        val nums = intArrayOf(1, 2, 2, 3, 1, 4)
        val expected = 4

        assertEquals(expected, CountElementsWithMaximumFrequency.maxFrequencyElementsArray(nums))
    }

    @Test
    fun test2Array() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = 5

        assertEquals(expected, CountElementsWithMaximumFrequency.maxFrequencyElementsArray(nums))
    }
}