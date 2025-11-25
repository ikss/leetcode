package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueLength3PalindromicSubsequencesTest {
    @Test
    fun test1() {
        val s = "aabca"
        val expected = 3

        assertEquals(expected, UniqueLength3PalindromicSubsequences.countPalindromicSubsequence(s))
    }

    @Test
    fun test2() {
        val s = "adc"
        val expected = 0

        assertEquals(expected, UniqueLength3PalindromicSubsequences.countPalindromicSubsequence(s))
    }

    @Test
    fun test3() {
        val s = "bbcbaba"
        val expected = 4

        assertEquals(expected, UniqueLength3PalindromicSubsequences.countPalindromicSubsequence(s))
    }
}