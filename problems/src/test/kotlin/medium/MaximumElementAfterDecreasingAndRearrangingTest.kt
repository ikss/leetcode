package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumElementAfterDecreasingAndRearrangingTest {
    @Test
    fun test1() {
        val arr = intArrayOf(2, 2, 1, 2, 1)
        val expected = 2

        assertEquals(
            expected,
            MaximumElementAfterDecreasingAndRearranging.maximumElementAfterDecrementingAndRearranging(arr)
        )
    }

    @Test
    fun test2() {
        val arr = intArrayOf(100, 1, 1000)
        val expected = 3

        assertEquals(
            expected,
            MaximumElementAfterDecreasingAndRearranging.maximumElementAfterDecrementingAndRearranging(arr)
        )
    }

    @Test
    fun test3() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val expected = 5

        assertEquals(
            expected,
            MaximumElementAfterDecreasingAndRearranging.maximumElementAfterDecrementingAndRearranging(arr)
        )
    }
}