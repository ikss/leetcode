package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RepeatedSubstringPatternTest {
    @Test
    fun test1divisors() {
        val s = "abab"
        val expected = true
        assertEquals(expected, RepeatedSubstringPattern.repeatedSubstringPatternDivisors(s))
    }

    @Test
    fun test2divisors() {
        val s = "aba"
        val expected = false
        assertEquals(expected, RepeatedSubstringPattern.repeatedSubstringPatternDivisors(s))
    }

    @Test
    fun test1concatenation() {
        val s = "abab"
        val expected = true
        assertEquals(expected, RepeatedSubstringPattern.repeatedSubstringPatternConcatenation(s))
    }

    @Test
    fun test2concatenation() {
        val s = "aba"
        val expected = false
        assertEquals(expected, RepeatedSubstringPattern.repeatedSubstringPatternConcatenation(s))
    }
}