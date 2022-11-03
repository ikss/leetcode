package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestPalindromeByConcatenatingTwoLetterWordsTest {

    @Test
    fun test1() {
        val words = arrayOf("lc", "cl", "gg")
        val expected = 6

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("ab", "ty", "yt", "lc", "cl", "ab")
        val expected = 8

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(words))
    }

    @Test
    fun test3() {
        val words = arrayOf("cc", "ll", "xx")
        val expected = 2

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(words))
    }

    @Test
    fun test4() {
        val words = arrayOf("gg", "gg", "gg")
        val expected = 6

        assertEquals(expected, LongestPalindromeByConcatenatingTwoLetterWords.longestPalindrome(words))
    }
}