package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindTheLexicographicallySmallestValidSequenceTest {
    @Test
    fun test1() {
        val word1 = "vbcca"
        val word2 = "abc"
        val expected = intArrayOf(0, 1, 2)

        assertArrayEquals(expected, FindTheLexicographicallySmallestValidSequence.validSequence(word1, word2))
    }

    @Test
    fun test2() {
        val word1 = "bacdc"
        val word2 = "abc"
        val expected = intArrayOf(1, 2, 4)

        assertArrayEquals(expected, FindTheLexicographicallySmallestValidSequence.validSequence(word1, word2))
    }

    @Test
    fun test3() {
        val word1 = "aaaaaa"
        val word2 = "aaaabc"
        val expected = intArrayOf()

        assertArrayEquals(expected, FindTheLexicographicallySmallestValidSequence.validSequence(word1, word2))
    }

    @Test
    fun test4() {
        val word1 = "abc"
        val word2 = "ab"
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, FindTheLexicographicallySmallestValidSequence.validSequence(word1, word2))
    }
}