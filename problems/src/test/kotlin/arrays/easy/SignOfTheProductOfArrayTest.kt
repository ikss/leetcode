package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SignOfTheProductOfArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(-1, -2, -3, -4, 3, 2, 1)
        val expected = 1

        assertEquals(expected, SignOfTheProductOfArray.arraySign(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 5, 0, 2, -3)
        val expected = 0

        assertEquals(expected, SignOfTheProductOfArray.arraySign(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1, 1, -1, 1, -1)
        val expected = -1

        assertEquals(expected, SignOfTheProductOfArray.arraySign(nums))
    }
}