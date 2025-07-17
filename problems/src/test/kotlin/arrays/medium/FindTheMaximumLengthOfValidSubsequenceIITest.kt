package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheMaximumLengthOfValidSubsequenceIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 2
        val expected = 5

        assertEquals(expected, FindTheMaximumLengthOfValidSubsequenceII.maximumLength(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 3
        val expected = 4

        assertEquals(expected, FindTheMaximumLengthOfValidSubsequenceII.maximumLength(nums, k))
    }
}