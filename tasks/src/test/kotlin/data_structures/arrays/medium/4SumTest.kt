package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `4SumTest` {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 0, -1, 0, -2, 2)
        val expected = listOf(listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2), listOf(-1, 0, 0, 1))

        assertEquals(expected, `4Sum`.fourSum(nums, 0))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val expected = listOf(listOf(2, 2, 2, 2))

        assertEquals(expected, `4Sum`.fourSum(nums, 8))
    }

}
