package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class LongestCommonSuffixQueriesTest {
    @Test
    fun test1() {
        val wordsContainer = arrayOf("abcd", "bcd", "xbcd")
        val wordsQuery = arrayOf("cd", "bcd", "xyz")
        val expected = intArrayOf(1, 1, 1)

        assertArrayEquals(expected, LongestCommonSuffixQueries.stringIndices(wordsContainer, wordsQuery))
    }

    @Test
    fun test2() {
        val wordsContainer = arrayOf("abcdefgh", "poiuygh", "ghghgh")
        val wordsQuery = arrayOf("gh", "acbfgh", "acbfegh")
        val expected = intArrayOf(2, 0, 2)

        assertArrayEquals(expected, LongestCommonSuffixQueries.stringIndices(wordsContainer, wordsQuery))
    }
}