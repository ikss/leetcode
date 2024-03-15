package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ProductOfArrayExceptSelfTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(24, 12, 8, 6)

        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, 1, 0, -3, 3)
        val expected = intArrayOf(0, 0, 9, 0, 0)

        assertArrayEquals(expected, ProductOfArrayExceptSelf.productExceptSelf(nums))
    }
}