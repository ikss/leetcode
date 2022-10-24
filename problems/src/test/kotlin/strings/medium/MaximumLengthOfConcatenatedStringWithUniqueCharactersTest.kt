package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MaximumLengthOfConcatenatedStringWithUniqueCharactersTest {

    @Test
    fun test1recursion() {
        val arr = listOf("un", "iq", "ue")
        val expected = 4

        assertEquals(expected, MaximumLengthOfConcatenatedStringWithUniqueCharacters.maxLengthRecursion(arr))
    }

    @Test
    fun test2recursion() {
        val arr = listOf("cha", "r", "act", "ers")
        val expected = 6

        assertEquals(expected, MaximumLengthOfConcatenatedStringWithUniqueCharacters.maxLengthRecursion(arr))
    }

    @Test
    fun test3recursion() {
        val arr = listOf("abcdefghijklmnopqrstuvwxyz")
        val expected = 26

        assertEquals(expected, MaximumLengthOfConcatenatedStringWithUniqueCharacters.maxLengthRecursion(arr))
    }

    @Test
    fun test1dp() {
        val arr = listOf("un", "iq", "ue")
        val expected = 4

        assertEquals(expected, MaximumLengthOfConcatenatedStringWithUniqueCharacters.maxLengthDp(arr))
    }

    @Test
    fun test2dp() {
        val arr = listOf("cha", "r", "act", "ers")
        val expected = 6

        assertEquals(expected, MaximumLengthOfConcatenatedStringWithUniqueCharacters.maxLengthDp(arr))
    }

    @Test
    fun test3dp() {
        val arr = listOf("abcdefghijklmnopqrstuvwxyz")
        val expected = 26

        assertEquals(expected, MaximumLengthOfConcatenatedStringWithUniqueCharacters.maxLengthDp(arr))
    }
}