package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NonDecreasingSubsequencesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 6, 7, 7)
        val expected = listOf(
            listOf(4, 6),
            listOf(4, 6, 7),
            listOf(4, 6, 7, 7),
            listOf(4, 7),
            listOf(4, 7, 7),
            listOf(6, 7),
            listOf(6, 7, 7),
            listOf(7, 7),
        )

        assertEquals(expected, NonDecreasingSubsequences.findSubsequences(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 4, 3, 2, 1)
        val expected = listOf(
            listOf(4, 4),
        )

        assertEquals(expected, NonDecreasingSubsequences.findSubsequences(nums))
    }
}