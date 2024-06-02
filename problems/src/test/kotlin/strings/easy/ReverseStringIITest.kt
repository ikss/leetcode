package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseStringIITest {
    @Test
    fun test1() {
        val s = "abcdefg"
        val k = 2
        val expected = "bacdfeg"

        assertEquals(expected, ReverseStringII.reverseStr(s, k))
    }

    @Test
    fun test2() {
        val s = "abcd"
        val k = 2
        val expected = "bacd"

        assertEquals(expected, ReverseStringII.reverseStr(s, k))
    }

    @Test
    fun test3() {
        val s = "a"
        val k = 2
        val expected = "a"

        assertEquals(expected, ReverseStringII.reverseStr(s, k))
    }

    @Test
    fun test4() {
        val s = "abcdefg"
        val k = 8
        val expected = "gfedcba"

        assertEquals(expected, ReverseStringII.reverseStr(s, k))
    }
}