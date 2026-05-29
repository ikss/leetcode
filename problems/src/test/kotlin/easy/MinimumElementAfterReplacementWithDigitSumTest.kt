package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumElementAfterReplacementWithDigitSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(10, 12, 13, 14)
        val expected = 1

        assertEquals(expected, MinimumElementAfterReplacementWithDigitSum.minElement(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 1

        assertEquals(expected, MinimumElementAfterReplacementWithDigitSum.minElement(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(999, 19, 199)
        val expected = 10

        assertEquals(expected, MinimumElementAfterReplacementWithDigitSum.minElement(nums))
    }
}