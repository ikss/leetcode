package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMostFrequentVowelAndConsonantTest {
    @Test
    fun test1() {
        val s = "successes"
        val expected = 6

        assertEquals(expected, FindMostFrequentVowelAndConsonant.maxFreqSum(s))
    }

    @Test
    fun test2() {
        val s = "aeiaeia"
        val expected = 3

        assertEquals(expected, FindMostFrequentVowelAndConsonant.maxFreqSum(s))
    }
}