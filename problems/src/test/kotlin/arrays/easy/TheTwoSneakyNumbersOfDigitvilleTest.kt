package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TheTwoSneakyNumbersOfDigitvilleTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 1, 0)
        val expected = intArrayOf(1, 0)

        assertArrayEquals(expected, TheTwoSneakyNumbersOfDigitville.getSneakyNumbers(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 3, 2, 1, 3, 2)
        val expected = intArrayOf(3, 2)

        assertArrayEquals(expected, TheTwoSneakyNumbersOfDigitville.getSneakyNumbers(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2)
        val expected = intArrayOf(4, 5)

        assertArrayEquals(expected, TheTwoSneakyNumbersOfDigitville.getSneakyNumbers(nums))
    }
}