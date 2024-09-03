package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProductOfThreeNumbersTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 6

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProduct(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 24

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProduct(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1, -2, -3)
        val expected = -6

        assertEquals(expected, MaximumProductOfThreeNumbers.maximumProduct(nums))
    }
}