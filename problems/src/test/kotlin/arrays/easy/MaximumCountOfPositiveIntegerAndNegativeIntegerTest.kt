package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumCountOfPositiveIntegerAndNegativeIntegerTest {
    @Test
    fun test1() {
        val nums = intArrayOf(-2, -1, -1, 1, 2, 3)
        val expected = 3

        assertEquals(expected, MaximumCountOfPositiveIntegerAndNegativeInteger.maximumCount(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-3, -2, -1, 0, 0, 1, 2)
        val expected = 3

        assertEquals(expected, MaximumCountOfPositiveIntegerAndNegativeInteger.maximumCount(nums))
    }
    
    @Test
    fun test3() {
        val nums = intArrayOf(5, 20, 66, 1314)
        val expected = 4

        assertEquals(expected, MaximumCountOfPositiveIntegerAndNegativeInteger.maximumCount(nums))
    }
}