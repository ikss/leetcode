package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestBalancedSubarrayITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 5, 4, 3)
        val expected = 4

        assertEquals(expected, LongestBalancedSubarrayI.longestBalanced(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 2, 2, 5, 4)
        val expected = 5

        assertEquals(expected, LongestBalancedSubarrayI.longestBalanced(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 2)
        val expected = 3

        assertEquals(expected, LongestBalancedSubarrayI.longestBalanced(nums))
    }
}