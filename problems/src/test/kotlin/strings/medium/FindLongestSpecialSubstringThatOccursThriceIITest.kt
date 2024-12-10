package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindLongestSpecialSubstringThatOccursThriceIITest {
    @Test
    fun test1() {
        val s = "aaaa"
        val expected = 2

        assertEquals(expected, FindLongestSpecialSubstringThatOccursThriceII.maximumLength(s))
    }

    @Test
    fun test2() {
        val s = "abcdef"
        val expected = -1

        assertEquals(expected, FindLongestSpecialSubstringThatOccursThriceII.maximumLength(s))
    }

    @Test
    fun test3() {
        val s = "abcaba"
        val expected = 1

        assertEquals(expected, FindLongestSpecialSubstringThatOccursThriceII.maximumLength(s))
    }
}