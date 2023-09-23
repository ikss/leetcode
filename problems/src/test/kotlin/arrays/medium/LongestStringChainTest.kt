package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestStringChainTest {
    @Test
    fun test1() {
        val words = arrayOf("a", "b", "ba", "bca", "bda", "bdca")
        val expected = 4

        assertEquals(expected, LongestStringChain.longestStrChain(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("xbc", "pcxbcf", "xb", "cxbc", "pcxbc")
        val expected = 5

        assertEquals(expected, LongestStringChain.longestStrChain(words))
    }

    @Test
    fun test3() {
        val words = arrayOf("abcd", "dbqca")
        val expected = 1

        assertEquals(expected, LongestStringChain.longestStrChain(words))
    }

    @Test
    fun test1my() {
        val words = arrayOf("a", "b", "ba", "bca", "bda", "bdca")
        val expected = 4

        assertEquals(expected, LongestStringChain.longestStrChainMy(words))
    }

    @Test
    fun test2my() {
        val words = arrayOf("xbc", "pcxbcf", "xb", "cxbc", "pcxbc")
        val expected = 5

        assertEquals(expected, LongestStringChain.longestStrChainMy(words))
    }

    @Test
    fun test3my() {
        val words = arrayOf("abcd", "dbqca")
        val expected = 1

        assertEquals(expected, LongestStringChain.longestStrChainMy(words))
    }
}