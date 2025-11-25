package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestDivisibleSubsetTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = listOf(1, 2)

        assertEquals(expected, LargestDivisibleSubset.largestDivisibleSubset(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 4, 8)
        val expected = listOf(1, 2, 4, 8)

        assertEquals(expected, LargestDivisibleSubset.largestDivisibleSubset(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1)
        val expected = listOf(1)

        assertEquals(expected, LargestDivisibleSubset.largestDivisibleSubset(nums))
    }
}