package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeSumDivisibleByPTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 1, 4, 2)
        val p = 6
        val expected = 1

        assertEquals(expected, MakeSumDivisibleByP.minSubarray(nums, p))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(6, 3, 5, 2)
        val p = 9
        val expected = 2

        assertEquals(expected, MakeSumDivisibleByP.minSubarray(nums, p))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val p = 3
        val expected = 0

        assertEquals(expected, MakeSumDivisibleByP.minSubarray(nums, p))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(26, 19, 11, 14, 18, 4, 7, 1, 30, 23, 19, 8, 10, 6, 26, 3)
        val p = 26
        val expected = 3

        assertEquals(expected, MakeSumDivisibleByP.minSubarray(nums, p))
    }
}