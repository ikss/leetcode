package strings.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {

    @Test
    fun test1() {
        val strs = arrayOf("flower", "flow", "flight")
        val excepted = "fl"
        assertEquals(excepted, LongestCommonPrefix.longestCommonPrefix(strs))
    }

    @Test
    fun test2() {
        val strs = arrayOf("dog", "racecar", "car")
        val excepted = ""
        assertEquals(excepted, LongestCommonPrefix.longestCommonPrefix(strs))
    }

    @Test
    fun test3() {
        val strs = arrayOf("flower", "", "flight")
        val excepted = ""
        assertEquals(excepted, LongestCommonPrefix.longestCommonPrefix(strs))
    }
}
