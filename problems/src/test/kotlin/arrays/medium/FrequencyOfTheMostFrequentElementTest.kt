package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FrequencyOfTheMostFrequentElementTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 4)
        val k = 5
        val expected = 3

        assertEquals(expected, FrequencyOfTheMostFrequentElement.maxFrequency(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 4, 8, 13)
        val k = 5
        val expected = 2

        assertEquals(expected, FrequencyOfTheMostFrequentElement.maxFrequency(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 9, 6)
        val k = 2
        val expected = 1

        assertEquals(expected, FrequencyOfTheMostFrequentElement.maxFrequency(nums, k))
    }
}