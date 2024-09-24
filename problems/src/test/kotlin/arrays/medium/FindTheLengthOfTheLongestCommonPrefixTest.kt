package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheLengthOfTheLongestCommonPrefixTest {
    @Test
    fun test1() {
        val arr1 = intArrayOf(1, 10, 100)
        val arr2 = intArrayOf(1000)
        val expected = 3

        assertEquals(expected, FindTheLengthOfTheLongestCommonPrefix.longestCommonPrefix(arr1, arr2))
    }

    @Test
    fun test2() {
        val arr1 = intArrayOf(1, 2, 3)
        val arr2 = intArrayOf(4, 4, 4)
        val expected = 0

        assertEquals(expected, FindTheLengthOfTheLongestCommonPrefix.longestCommonPrefix(arr1, arr2))
    }
}