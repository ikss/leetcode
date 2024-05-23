package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheNumberOfBeautifulSubsetsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 4, 6)
        val k = 2
        val expected = 4

        assertEquals(expected, TheNumberOfBeautifulSubsets.beautifulSubsets(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1)
        val k = 1
        val expected = 1

        assertEquals(expected, TheNumberOfBeautifulSubsets.beautifulSubsets(nums, k))
    }
}