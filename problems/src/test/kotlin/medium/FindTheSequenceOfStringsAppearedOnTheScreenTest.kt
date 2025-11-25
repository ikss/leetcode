package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheSequenceOfStringsAppearedOnTheScreenTest {
    @Test
    fun test1() {
        val target = "abc"
        val expected = listOf("a", "aa", "ab", "aba", "abb", "abc")

        assertEquals(expected, FindTheSequenceOfStringsAppearedOnTheScreen.stringSequence(target))
    }

    @Test
    fun test2() {
        val target = "he"
        val expected = listOf("a", "b", "c", "d", "e", "f", "g", "h", "ha", "hb", "hc", "hd", "he")

        assertEquals(expected, FindTheSequenceOfStringsAppearedOnTheScreen.stringSequence(target))
    }
}