package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumRemovalsToBalanceArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 5)
        val k = 2
        val expected = 1

        assertEquals(expected, MinimumRemovalsToBalanceArray.minRemoval(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 6, 2, 9)
        val k = 3
        val expected = 2

        assertEquals(expected, MinimumRemovalsToBalanceArray.minRemoval(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(4, 6)
        val k = 2
        val expected = 0

        assertEquals(expected, MinimumRemovalsToBalanceArray.minRemoval(nums, k))
    }
}