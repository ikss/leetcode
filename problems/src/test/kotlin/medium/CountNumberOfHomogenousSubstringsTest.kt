package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfHomogenousSubstringsTest {
    @Test
    fun test1() {
        val s = "abbcccaa"
        val expected = 13

        assertEquals(expected, CountNumberOfHomogenousSubstrings.countHomogenous(s))
    }

    @Test
    fun test2() {
        val s = "xy"
        val expected = 2

        assertEquals(expected, CountNumberOfHomogenousSubstrings.countHomogenous(s))
    }

    @Test
    fun test3() {
        val s = "zzzzz"
        val expected = 15

        assertEquals(expected, CountNumberOfHomogenousSubstrings.countHomogenous(s))
    }
}