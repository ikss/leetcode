package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindSubsequenceOfLengthKWithTheLargestSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 3, 3)
        val k = 2
        val expected = intArrayOf(3, 3)

        assertArrayEquals(expected, FindSubsequenceOfLengthKWithTheLargestSum.maxSubsequence(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, -2, 3, 4)
        val k = 3
        val expected = intArrayOf(-1, 3, 4)

        assertArrayEquals(expected, FindSubsequenceOfLengthKWithTheLargestSum.maxSubsequence(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 4, 3, 3)
        val k = 2
        val expected = intArrayOf(3, 4)

        assertArrayEquals(expected, FindSubsequenceOfLengthKWithTheLargestSum.maxSubsequence(nums, k))
    }

}