package arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LongestSubsequenceWithLimitedSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 5, 2, 1)
        val queries = intArrayOf(3, 10, 21)
        val expected = intArrayOf(2, 3, 4)

        assertTrue(expected.contentEquals(LongestSubsequenceWithLimitedSum.answerQueries(nums, queries)))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4, 5)
        val queries = intArrayOf(1)
        val expected = intArrayOf(0)

        assertTrue(expected.contentEquals(LongestSubsequenceWithLimitedSum.answerQueries(nums, queries)))
    }
}