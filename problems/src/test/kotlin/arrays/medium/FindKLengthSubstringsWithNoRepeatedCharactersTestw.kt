package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindKLengthSubstringsWithNoRepeatedCharactersTest {
    @Test
    fun test1() {
        val s = "havefunonleetcode"
        val k = 5
        val expected = 6

        assertEquals(expected, FindKLengthSubstringsWithNoRepeatedCharacters.numKLenSubstrNoRepeats(s, k))
    }
    
    @Test
    fun test2() {
        val s = "home"
        val k = 5
        val expected = 0

        assertEquals(expected, FindKLengthSubstringsWithNoRepeatedCharacters.numKLenSubstrNoRepeats(s, k))
    }
}