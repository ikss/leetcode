package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProductOfTwoElementsInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 4, 5, 2)
        val expected = 12

        assertEquals(expected, MaximumProductOfTwoElementsInArray.maxProduct(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 5, 4, 5)
        val expected = 16

        assertEquals(expected, MaximumProductOfTwoElementsInArray.maxProduct(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 7)
        val expected = 12

        assertEquals(expected, MaximumProductOfTwoElementsInArray.maxProduct(nums))
    }
}