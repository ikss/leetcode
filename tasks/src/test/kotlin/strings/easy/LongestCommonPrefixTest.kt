package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    @Test
    fun test1() {
        val strs = arrayOf("flower", "flow", "flight")
        val expected = "fl"
        assertEquals(expected, LongestCommonPrefix.longestCommonPrefix(strs))
    }

    @Test
    fun test2() {
        val strs = arrayOf("dog", "racecar", "car")
        val expected = ""
        assertEquals(expected, LongestCommonPrefix.longestCommonPrefix(strs))
    }

    @Test
    fun test3() {
        val strs = arrayOf("flower", "", "flight")
        val expected = ""
        assertEquals(expected, LongestCommonPrefix.longestCommonPrefix(strs))
    }
}
