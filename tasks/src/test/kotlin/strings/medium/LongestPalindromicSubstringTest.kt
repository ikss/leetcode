package strings.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestPalindromicSubstringTest {

    @Test
    fun test1() {
        val s = "babad"
        val excepted = "bab"
        assertEquals(excepted, LongestPalindromicSubstring.longestPalindrome(s))
    }

    @Test
    fun test2() {
        val s = "cbbd"
        val excepted = "bb"
        assertEquals(excepted, LongestPalindromicSubstring.longestPalindrome(s))
    }

    @Test
    fun test3() {
        val s = "a"
        val excepted = "a"
        assertEquals(excepted, LongestPalindromicSubstring.longestPalindrome(s))
    }

    @Test
    fun test4() {
        val s = "ac"
        val excepted = "a"
        assertEquals(excepted, LongestPalindromicSubstring.longestPalindrome(s))
    }
}
