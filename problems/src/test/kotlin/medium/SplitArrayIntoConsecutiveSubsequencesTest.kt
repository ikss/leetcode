package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SplitArrayIntoConsecutiveSubsequencesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 3, 4, 5)
        val expected = true

        assertEquals(expected, SplitArrayIntoConsecutiveSubsequences.isPossible(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 3, 4, 4, 5, 5)
        val expected = true

        assertEquals(expected, SplitArrayIntoConsecutiveSubsequences.isPossible(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 4, 4, 5)
        val expected = false

        assertEquals(expected, SplitArrayIntoConsecutiveSubsequences.isPossible(nums))
    }
}
