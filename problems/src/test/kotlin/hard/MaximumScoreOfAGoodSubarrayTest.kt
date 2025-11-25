package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumScoreOfAGoodSubarrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 4, 3, 7, 4, 5)
        val expected = 15

        assertEquals(expected, MaximumScoreOfAGoodSubarray.maximumScore(nums, 3))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 5, 4, 5, 4, 1, 1, 1)
        val expected = 20

        assertEquals(expected, MaximumScoreOfAGoodSubarray.maximumScore(nums, 0))
    }
}