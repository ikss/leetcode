package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FourDivisorsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(21, 4, 7)
        val expected = 32

        assertEquals(expected, FourDivisors.sumFourDivisors(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(21, 21)
        val expected = 64

        assertEquals(expected, FourDivisors.sumFourDivisors(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = 0

        assertEquals(expected, FourDivisors.sumFourDivisors(nums))
    }
}