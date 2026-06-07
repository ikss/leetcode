package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RearrangeStringKDistanceApartTest {
    @Test
    fun test1() {
        val input = "aaabc"
        val k = 3
        val expected = ""

        assertEquals(expected, RearrangeStringKDistanceApart.rearrangeString(input, k))
    }

    @Test
    fun test2() {
        val input = "aaaabbbccd"
        val k = 3
        val expected = "abcabcabda"

        assertEquals(expected, RearrangeStringKDistanceApart.rearrangeString(input, k))
    }
}