package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSubarrayWithEqualProductsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 1, 2, 1, 1, 1)
        val expected = 5

        assertEquals(expected, MaximumSubarrayWithEqualProducts.maxLength(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4, 5, 6)
        val expected = 3

        assertEquals(expected, MaximumSubarrayWithEqualProducts.maxLength(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 1, 4, 5, 1)
        val expected = 5

        assertEquals(expected, MaximumSubarrayWithEqualProducts.maxLength(nums))
    }
}