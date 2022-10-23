package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestStringChainTest {

    @Test
    fun test1() {
        val n = arrayOf("a", "b", "ba", "bca", "bda", "bdca")
        val expected = 4

        assertEquals(expected, LongestStringChain.longestStrChain(n))
    }

    @Test
    fun test2() {
        val n = arrayOf("xbc", "pcxbcf", "xb", "cxbc", "pcxbc")
        val expected = 5

        assertEquals(expected, LongestStringChain.longestStrChain(n))
    }

    @Test
    fun test3() {
        val n = arrayOf("abcd", "dbqca")
        val expected = 1

        assertEquals(expected, LongestStringChain.longestStrChain(n))
    }
}
