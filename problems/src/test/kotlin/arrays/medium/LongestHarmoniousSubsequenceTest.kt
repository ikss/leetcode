package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestHarmoniousSubsequenceTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)
        val expected = 5

        assertEquals(expected, LongestHarmoniousSubsequence.findLHS(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 2

        assertEquals(expected, LongestHarmoniousSubsequence.findLHS(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 1, 1)
        val expected = 0

        assertEquals(expected, LongestHarmoniousSubsequence.findLHS(nums))
    }
}