package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubstringOfAllVowelsInOrderTest {

    @Test
    fun test1() {
        val word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
        val expected = 13

        assertEquals(expected, LongestSubstringOfAllVowelsInOrder.longestBeautifulSubstring(word))
    }

    @Test
    fun test2() {
        val word = "aeeeiiiioooauuuaeiou"
        val expected = 5

        assertEquals(expected, LongestSubstringOfAllVowelsInOrder.longestBeautifulSubstring(word))
    }

    @Test
    fun test3() {
        val word = "a"
        val expected = 0

        assertEquals(expected, LongestSubstringOfAllVowelsInOrder.longestBeautifulSubstring(word))
    }
}