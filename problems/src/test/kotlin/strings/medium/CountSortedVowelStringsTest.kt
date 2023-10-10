package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSortedVowelStringsTest {
    @Test
    fun test1() {
        val n = 1
        val expected = 5

        assertEquals(expected, CountSortedVowelStrings.countVowelStrings(n))
    }

    @Test
    fun test2() {
        val n = 2
        val expected = 15

        assertEquals(expected, CountSortedVowelStrings.countVowelStrings(n))
    }

    @Test
    fun test3() {
        val n = 33
        val expected = 66045

        assertEquals(expected, CountSortedVowelStrings.countVowelStrings(n))
    }
}