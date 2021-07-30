package strings.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingTest {

    @Test
    fun test1() {
        val s = "abcabcbb"
        val excepted = 3
        assertEquals(excepted, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test2() {
        val s = "bbbbb"
        val excepted = 1
        assertEquals(excepted, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test3() {
        val s = ""
        val excepted = 0
        assertEquals(excepted, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test4() {
        val s = "pwwkew"
        val excepted = 3
        assertEquals(excepted, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }

    @Test
    fun test5() {
        val s = "aab"
        val excepted = 2
        assertEquals(excepted, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(s))
    }
}
