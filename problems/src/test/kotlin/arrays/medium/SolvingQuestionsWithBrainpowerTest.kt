package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolvingQuestionsWithBrainpowerTest {
    @Test
    fun test1dp() {
        val nums = arrayOf(intArrayOf(3, 2), intArrayOf(4, 3), intArrayOf(4, 4), intArrayOf(2, 5))
        val expected = 5L

        assertEquals(expected, SolvingQuestionsWithBrainpower.mostPointsDp(nums))
    }

    @Test
    fun test2dp() {
        val nums = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3), intArrayOf(4, 4), intArrayOf(5, 5))
        val expected = 7L

        assertEquals(expected, SolvingQuestionsWithBrainpower.mostPointsDp(nums))
    }

    @Test
    fun test1dfs() {
        val nums = arrayOf(intArrayOf(3, 2), intArrayOf(4, 3), intArrayOf(4, 4), intArrayOf(2, 5))
        val expected = 5L

        assertEquals(expected, SolvingQuestionsWithBrainpower.mostPointsDfs(nums))
    }

    @Test
    fun test2dfs() {
        val nums = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3), intArrayOf(4, 4), intArrayOf(5, 5))
        val expected = 7L

        assertEquals(expected, SolvingQuestionsWithBrainpower.mostPointsDfs(nums))
    }
}