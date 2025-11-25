package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProductDifferenceBetweenTwoPairsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 6, 2, 7, 4)
        val expected = 34

        assertEquals(expected, MaximumProductDifferenceBetweenTwoPairs.maxProductDifference(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 2, 5, 9, 7, 4, 8)
        val expected = 64

        assertEquals(expected, MaximumProductDifferenceBetweenTwoPairs.maxProductDifference(nums))
    }
}