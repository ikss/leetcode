package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindNumbersWithEvenNumberOfDigitsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(12, 345, 2, 6, 7896)
        val expected = 2

        assertEquals(expected, FindNumbersWithEvenNumberOfDigits.findNumbers(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(555, 901, 482, 1771)
        val expected = 1

        assertEquals(expected, FindNumbersWithEvenNumberOfDigits.findNumbers(nums))
    }
}