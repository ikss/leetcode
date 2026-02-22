package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RearrangeStringKDistanceApartTest {
    @Test
    fun test1() {
        val s = "aabbcc"
        val k = 3
        val expected = "abcabc"

        assertEquals(expected, RearrangeStringKDistanceApart.rearrangeString(s, k))
    }

    @Test
    fun test2() {
        val s = "aaabc"
        val k = 3
        val expected = ""

        assertEquals(expected, RearrangeStringKDistanceApart.rearrangeString(s, k))
    }

    @Test
    fun test3() {
        val s = "aaadbbcc"
        val k = 2
        val expected = "abacabcd"

        assertEquals(expected, RearrangeStringKDistanceApart.rearrangeString(s, k))
    }
}