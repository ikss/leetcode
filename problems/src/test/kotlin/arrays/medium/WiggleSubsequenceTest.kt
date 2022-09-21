package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WiggleSubsequenceTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 7, 4, 9, 2, 5)
        val expected = 6

        assertEquals(expected, WiggleSubsequence.wiggleMaxLength(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 17, 5, 10, 13, 15, 10, 5, 16, 8)
        val expected = 7

        assertEquals(expected, WiggleSubsequence.wiggleMaxLength(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val expected = 2

        assertEquals(expected, WiggleSubsequence.wiggleMaxLength(nums))
    }
}
