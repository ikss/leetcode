package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GreatestCommonDivisorOfStringsTest {

    @Test
    fun test1() {
        val str1 = "ABCABC"
        val str2 = "ABC"
        val expected = "ABC"

        assertEquals(expected, GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2))
    }

    @Test
    fun test2() {
        val str1 = "ABABAB"
        val str2 = "ABAB"
        val expected = "AB"

        assertEquals(expected, GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2))
    }

    @Test
    fun test3() {
        val str1 = "LEET"
        val str2 = "CODE"
        val expected = ""

        assertEquals(expected, GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2))
    }
}