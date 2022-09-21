package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `3SumTest` {
    @Test
    fun test1() {
        val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))

        assertEquals(expected, `3Sum`.threeSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf()
        val expected = listOf<List<Int>>()

        assertEquals(expected, `3Sum`.threeSum(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0)
        val expected = listOf<List<Int>>()

        assertEquals(expected, `3Sum`.threeSum(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(3, 0, -2, -1, 1, 2)
        val expected = listOf(listOf(-2, -1, 3), listOf(-2, 0, 2), listOf(-1, 0, 1))

        assertEquals(expected, `3Sum`.threeSum(nums))
    }
}
