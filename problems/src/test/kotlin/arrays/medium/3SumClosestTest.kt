package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `3SumClosestTest` {
    @Test
    fun test1() {
        val nums = intArrayOf(-1, 2, 1, -4)
        val expected = 2

        assertEquals(expected, `3SumClosest`.threeSumClosest(nums, 1))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, 0, 1, -4, 2, 3)
        val expected = 0

        assertEquals(expected, `3SumClosest`.threeSumClosest(nums, 0))
    }
}
