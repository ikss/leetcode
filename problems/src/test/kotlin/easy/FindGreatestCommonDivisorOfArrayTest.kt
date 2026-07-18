package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindGreatestCommonDivisorOfArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 5, 6, 9, 10)
        val expected = 2

        assertEquals(expected, FindGreatestCommonDivisorOfArray.findGCD(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(7, 5, 6, 8, 3)
        val expected = 1

        assertEquals(expected, FindGreatestCommonDivisorOfArray.findGCD(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 3)
        val expected = 3

        assertEquals(expected, FindGreatestCommonDivisorOfArray.findGCD(nums))
    }
}