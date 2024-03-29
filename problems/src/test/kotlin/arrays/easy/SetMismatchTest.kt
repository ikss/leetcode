package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SetMismatchTest {
    @Test
    fun test1additionalArray() {
        val nums = intArrayOf(1, 2, 2, 4)
        val expected = intArrayOf(2, 3)

        assertArrayEquals(expected, SetMismatch.findErrorNumsAdditionalArray(nums))
    }

    @Test
    fun test2additionalArray() {
        val nums = intArrayOf(1, 1)
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, SetMismatch.findErrorNumsAdditionalArray(nums))
    }

    @Test
    fun test1findErrorNumsSquareSum() {
        val nums = intArrayOf(1, 2, 2, 4)
        val expected = intArrayOf(2, 3)

        assertArrayEquals(expected, SetMismatch.findErrorNumsSquareSum(nums))
    }

    @Test
    fun test2findErrorNumsSquareSum() {
        val nums = intArrayOf(1, 1)
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, SetMismatch.findErrorNumsSquareSum(nums))
    }
}