package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheLongestSubstringContainingVowelsInEvenCountsTest {
    @Test
    fun test1() {
        val s = "eleetminicoworoep"
        val output = 13

        assertEquals(output, FindTheLongestSubstringContainingVowelsInEvenCounts.findTheLongestSubstring(s))
    }

    @Test
    fun test2() {
        val s = "leetcodeisgreat"
        val output = 5

        assertEquals(output, FindTheLongestSubstringContainingVowelsInEvenCounts.findTheLongestSubstring(s))
    }

    @Test
    fun test3() {
        val s = "bcbcbc"
        val output = 6

        assertEquals(output, FindTheLongestSubstringContainingVowelsInEvenCounts.findTheLongestSubstring(s))
    }
}