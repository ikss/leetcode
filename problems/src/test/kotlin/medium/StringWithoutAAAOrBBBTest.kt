package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringWithoutAAAOrBBBTest {
    @Test
    fun test1() {
        val a = 1
        val b = 2
        val expected = "bab"

        assertEquals(expected, StringWithoutAAAOrBBB.strWithout3a3b(a, b))
    }

    @Test
    fun test2() {
        val a = 4
        val b = 1
        val expected = "aabaa"

        assertEquals(expected, StringWithoutAAAOrBBB.strWithout3a3b(a, b))
    }
}