package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestBinarySubsequenceLessThanOrEqualToKTest {
    @Test
    fun test1() {
        val s = "1001010"
        val k = 5
        val expected = 5

        assertEquals(expected, LongestBinarySubsequenceLessThanOrEqualToK.longestSubsequence(s, k))
    }

    @Test
    fun test2() {
        val s = "00101001"
        val k = 1
        val expected = 6

        assertEquals(expected, LongestBinarySubsequenceLessThanOrEqualToK.longestSubsequence(s, k))
    }

    @Test
    fun test3() {
        val s = "111100010000011101001110001111000000001011101111111110111000011111011000010101110100110110001111001001011001010011010000011111101001101000000101101001110110000111101011000101"
        val k = 11713332
        val expected = 96

        assertEquals(expected, LongestBinarySubsequenceLessThanOrEqualToK.longestSubsequence(s, k))
    }
}