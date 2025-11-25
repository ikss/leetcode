package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfVowelsInSubstringOfGivenLengthTest {

    @Test
    fun test1() {
        val s = "abciiidef"
        val k = 3
        val expected = 3

        assertEquals(expected, MaximumNumberOfVowelsInSubstringOfGivenLength.maxVowels(s, k))
    }

    @Test
    fun test2() {
        val s = "aeiou"
        val k = 2
        val expected = 2

        assertEquals(expected, MaximumNumberOfVowelsInSubstringOfGivenLength.maxVowels(s, k))
    }

    @Test
    fun test3() {
        val s = "leetcode"
        val k = 3
        val expected = 2

        assertEquals(expected, MaximumNumberOfVowelsInSubstringOfGivenLength.maxVowels(s, k))
    }
}