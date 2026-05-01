package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RotateFunctionTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 3, 2, 6)
        val expected = 26

        assertEquals(expected, RotateFunction.maxRotateFunction(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(100)
        val expected = 0

        assertEquals(expected, RotateFunction.maxRotateFunction(nums))
    }
}