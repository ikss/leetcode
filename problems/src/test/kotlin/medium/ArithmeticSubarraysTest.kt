package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArithmeticSubarraysTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 6, 5, 9, 3, 7)
        val l = intArrayOf(0, 0, 2)
        val r = intArrayOf(2, 3, 5)
        val expected = listOf(true, false, true)

        assertEquals(expected, ArithmeticSubarrays.checkArithmeticSubarrays(nums, l, r))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10)
        val l = intArrayOf(0, 1, 6, 4, 8, 7)
        val r = intArrayOf(4, 4, 9, 7, 9, 10)
        val expected = listOf(false, true, false, false, true, true)

        assertEquals(expected, ArithmeticSubarrays.checkArithmeticSubarrays(nums, l, r))
    }
}