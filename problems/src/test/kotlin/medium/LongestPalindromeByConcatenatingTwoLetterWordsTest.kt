package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPalindromeByConcatenatingTwoLetterWordsTest {

    @Test
    fun test1Old() {
        val words = arrayOf("lc", "cl", "gg")
        val expected = 6

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeOld(words))
    }

    @Test
    fun test2Old() {
        val words = arrayOf("ab", "ty", "yt", "lc", "cl", "ab")
        val expected = 8

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeOld(words))
    }

    @Test
    fun test3Old() {
        val words = arrayOf("cc", "ll", "xx")
        val expected = 2

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeOld(words))
    }

    @Test
    fun test4Old() {
        val words = arrayOf("gg", "gg", "gg")
        val expected = 6

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeOld(words))
    }

    @Test
    fun test1SimpleMap() {
        val words = arrayOf("lc", "cl", "gg")
        val expected = 6

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeSimpleMap(words))
    }

    @Test
    fun test2SimpleMap() {
        val words = arrayOf("ab", "ty", "yt", "lc", "cl", "ab")
        val expected = 8

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeSimpleMap(words))
    }

    @Test
    fun test3SimpleMap() {
        val words = arrayOf("cc", "ll", "xx")
        val expected = 2

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeSimpleMap(words))
    }

    @Test
    fun test4SimpleMap() {
        val words = arrayOf("gg", "gg", "gg")
        val expected = 6

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindromeSimpleMap(words))
    }
}