package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonSubsequenceBetweenSortedArraysTest {
    @Test
    fun test1() {
        val arrays = arrayOf(
            intArrayOf(1, 3, 4),
            intArrayOf(1, 4, 7, 9),
        )
        val expected = listOf(1, 4)

        assertEquals(expected, LongestCommonSubsequenceBetweenSortedArrays.longestCommonSubsequence(arrays))
    }

    @Test
    fun test2() {
        val arrays = arrayOf(
            intArrayOf(2, 3, 6, 8),
            intArrayOf(1, 2, 3, 5, 6, 7, 10),
            intArrayOf(2, 3, 4, 6, 9),
        )
        val expected = listOf(2, 3, 6)

        assertEquals(expected, LongestCommonSubsequenceBetweenSortedArrays.longestCommonSubsequence(arrays))
    }

    @Test
    fun test3() {
        val arrays = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(6, 7, 8),
        )
        val expected = emptyList<Int>()

        assertEquals(expected, LongestCommonSubsequenceBetweenSortedArrays.longestCommonSubsequence(arrays))
    }
}