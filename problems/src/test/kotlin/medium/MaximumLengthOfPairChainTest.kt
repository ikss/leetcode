package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumLengthOfPairChainTest {
    @Test
    fun test1() {
        val pairs = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4))
        val expected = 2

        assertEquals(expected, MaximumLengthOfPairChain.findLongestChain(pairs))
    }

    @Test
    fun test2() {
        val pairs = arrayOf(intArrayOf(1, 2), intArrayOf(7, 8), intArrayOf(4, 5))
        val expected = 3

        assertEquals(expected, MaximumLengthOfPairChain.findLongestChain(pairs))
    }
}