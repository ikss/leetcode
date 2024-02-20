package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MissingNumberTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 0, 1)
        val expected = 2

        assertEquals(expected, MissingNumber.missingNumber(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1)
        val expected = 2

        assertEquals(expected, MissingNumber.missingNumber(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
        val expected = 8

        assertEquals(expected, MissingNumber.missingNumber(nums))
    }

    @Test
    fun test1gauss() {
        val nums = intArrayOf(3, 0, 1)
        val expected = 2

        assertEquals(expected, MissingNumber.missingNumberGauss(nums))
    }

    @Test
    fun test2gauss() {
        val nums = intArrayOf(0, 1)
        val expected = 2

        assertEquals(expected, MissingNumber.missingNumberGauss(nums))
    }

    @Test
    fun test3gauss() {
        val nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
        val expected = 8

        assertEquals(expected, MissingNumber.missingNumberGauss(nums))
    }
}
