package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SeparateTheDigitsInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(13, 25, 83, 77)
        val expected = intArrayOf(1, 3, 2, 5, 8, 3, 7, 7)

        assertArrayEquals(expected, SeparateTheDigitsInArray.separateDigits(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(7, 1, 3, 9)
        val expected = intArrayOf(7, 1, 3, 9)

        assertArrayEquals(expected, SeparateTheDigitsInArray.separateDigits(nums))
    }
}