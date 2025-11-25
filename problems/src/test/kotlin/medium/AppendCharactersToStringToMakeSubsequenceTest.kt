package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AppendCharactersToStringToMakeSubsequenceTest {
    @Test
    fun test1() {
        val s = "coaching"
        val t = "coding"
        val expected = 4

        assertEquals(expected, AppendCharactersToStringToMakeSubsequence.appendCharacters(s, t))
    }
    
    @Test
    fun test2() {
        val s = "abcde"
        val t = "a"
        val expected = 0

        assertEquals(expected, AppendCharactersToStringToMakeSubsequence.appendCharacters(s, t))
    }
    
    @Test
    fun test3() {
        val s = "z"
        val t = "abcde"
        val expected = 5

        assertEquals(expected, AppendCharactersToStringToMakeSubsequence.appendCharacters(s, t))
    }
}