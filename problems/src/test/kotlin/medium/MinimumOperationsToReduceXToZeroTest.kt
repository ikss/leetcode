package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToReduceXToZeroTest {
    @Test
    fun test1Dp() {
        val nums = intArrayOf(1, 1, 4, 2, 3)
        val x = 5
        val expected = 2

        assertEquals(expected, MinimumOperationsToReduceXToZero.minOperationsDp(nums, x))
    }

    @Test
    fun test2Dp() {
        val nums = intArrayOf(5, 6, 7, 8, 9)
        val x = 4
        val expected = -1

        assertEquals(expected, MinimumOperationsToReduceXToZero.minOperationsDp(nums, x))
    }

    @Test
    fun test3Dp() {
        val nums = intArrayOf(3, 2, 20, 1, 1, 3)
        val x = 10
        val expected = 5

        assertEquals(expected, MinimumOperationsToReduceXToZero.minOperationsDp(nums, x))
    }

    @Test
    fun test1SlidingWindow() {
        val nums = intArrayOf(1, 1, 4, 2, 3)
        val x = 5
        val expected = 2

        assertEquals(expected, MinimumOperationsToReduceXToZero.minOperationsSlidingWindow(nums, x))
    }

    @Test
    fun test2SlidingWindow() {
        val nums = intArrayOf(5, 6, 7, 8, 9)
        val x = 4
        val expected = -1

        assertEquals(expected, MinimumOperationsToReduceXToZero.minOperationsSlidingWindow(nums, x))
    }

    @Test
    fun test3SlidingWindow() {
        val nums = intArrayOf(3, 2, 20, 1, 1, 3)
        val x = 10
        val expected = 5

        assertEquals(expected, MinimumOperationsToReduceXToZero.minOperationsSlidingWindow(nums, x))
    }
}