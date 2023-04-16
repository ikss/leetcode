package strings.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfWaysToFormTargetStringGivenDictionaryTest {

    @Test
    fun test1() {
        val words = arrayOf("acca", "bbbb", "caca")
        val target = "aba"
        val expected = 6

        assertEquals(expected, NumberOfWaysToFormTargetStringGivenDictionary.numWays(words, target))
    }

    @Test
    fun test2() {
        val words = arrayOf("abba","baab")
        val target = "bab"
        val expected = 4

        assertEquals(expected, NumberOfWaysToFormTargetStringGivenDictionary.numWays(words, target))
    }
}