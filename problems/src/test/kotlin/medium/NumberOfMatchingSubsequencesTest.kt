package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfMatchingSubsequencesTest {

    @Test
    fun test1() {
        val s = "abcde"
        val words = arrayOf("a", "bb", "acd", "ace")
        val expected = 3

        assertEquals(expected, NumberOfMatchingSubsequences.numMatchingSubseq(s, words))
    }

    @Test
    fun test2() {
        val s = "dsahjpjauf"
        val words = arrayOf("ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax")
        val expected = 2

        assertEquals(expected, NumberOfMatchingSubsequences.numMatchingSubseq(s, words))
    }
}
