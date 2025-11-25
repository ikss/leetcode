package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `3SumSmallerTest` {
    @Test
    fun test1() {
        val nums = intArrayOf(-2, 0, 1, 3)
        val target = 2
        val expected = 2

        assertEquals(expected, `3SumSmaller`.threeSumSmaller(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf()
        val target = 0
        val expected = 0

        assertEquals(expected, `3SumSmaller`.threeSumSmaller(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0)
        val target = 0
        val expected = 0

        assertEquals(expected, `3SumSmaller`.threeSumSmaller(nums, target))
    }
}