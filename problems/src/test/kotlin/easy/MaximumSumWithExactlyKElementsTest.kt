package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumSumWithExactlyKElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 3
        val expected = 18

        assertEquals(expected, MaximumSumWithExactlyKElements.maximizeSum(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 5, 5)
        val k = 2
        val expected = 11

        assertEquals(expected, MaximumSumWithExactlyKElements.maximizeSum(nums, k))
    }
}