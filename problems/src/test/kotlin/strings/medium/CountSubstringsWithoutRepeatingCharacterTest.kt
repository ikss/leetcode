package strings.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountSubstringsWithoutRepeatingCharacterTest {
    @Test
    fun test1() {
        val s = "abcd"
        val expected = 10

        assertEquals(expected, CountSubstringsWithoutRepeatingCharacter.numberOfSpecialSubstrings(s))
    }

    @Test
    fun test2() {
        val s = "ooo"
        val expected = 3

        assertEquals(expected, CountSubstringsWithoutRepeatingCharacter.numberOfSpecialSubstrings(s))
    }

    @Test
    fun test3() {
        val s = "abab"
        val expected = 7

        assertEquals(expected, CountSubstringsWithoutRepeatingCharacter.numberOfSpecialSubstrings(s))
    }
}