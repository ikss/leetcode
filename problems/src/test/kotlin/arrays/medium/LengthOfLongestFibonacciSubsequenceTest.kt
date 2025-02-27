package arrays.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LengthOfLongestFibonacciSubsequenceTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        val expected = 5

        assertEquals(expected, LengthOfLongestFibonacciSubsequence.lenLongestFibSubseq(input))
    }
    
    @Test
    fun test2() {
        val input = intArrayOf(1, 3, 7, 11, 12, 14, 18)
        val expected = 3

        assertEquals(expected, LengthOfLongestFibonacciSubsequence.lenLongestFibSubseq(input))
    }
}