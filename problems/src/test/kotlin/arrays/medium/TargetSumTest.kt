package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TargetSumTest {
    @Test
    fun test1Dfs() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val target = 3
        val expected = 5

        assertEquals(expected, TargetSum.findTargetSumWaysDfs(nums, target))
    }

    @Test
    fun test2Dfs() {
        val nums = intArrayOf(1)
        val target = 1
        val expected = 1

        assertEquals(expected, TargetSum.findTargetSumWaysDfs(nums, target))
    }

    @Test
    fun test3Dfs() {
        val nums = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 1)
        val target = 1
        val expected = 256

        assertEquals(expected, TargetSum.findTargetSumWaysDfs(nums, target))
    }

    @Test
    fun test1Dp() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val target = 3
        val expected = 5

        assertEquals(expected, TargetSum.findTargetSumWaysDp(nums, target))
    }

    @Test
    fun test2Dp() {
        val nums = intArrayOf(1)
        val target = 1
        val expected = 1

        assertEquals(expected, TargetSum.findTargetSumWaysDp(nums, target))
    }

    @Test
    fun test3Dp() {
        val nums = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 1)
        val target = 1
        val expected = 256

        assertEquals(expected, TargetSum.findTargetSumWaysDp(nums, target))
    }
}