package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubstringsWithKFrequencyCharactersITest {
    @Test
    fun test1() {
        val s = "abacb"
        val k = 2
        val expected = 4

        assertEquals(expected, CountSubstringsWithKFrequencyCharactersI.numberOfSubstrings(s, k))
    }

    @Test
    fun test2() {
        val s = "abcde"
        val k = 1
        val expected = 15

        assertEquals(expected, CountSubstringsWithKFrequencyCharactersI.numberOfSubstrings(s, k))
    }
    
    @Test
    fun test3() {
        val s = "ajsrhoebe"
        val k = 2
        val expected = 7

        assertEquals(expected, CountSubstringsWithKFrequencyCharactersI.numberOfSubstrings(s, k))
    }
}