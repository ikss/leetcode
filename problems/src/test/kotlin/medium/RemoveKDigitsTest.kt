package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveKDigitsTest {
    @Test
    fun test1() {
        val num = "1432219"
        val k = 3
        val expected = "1219"

        assertEquals(expected, RemoveKDigits.removeKdigits(num, k))
    }

    @Test
    fun test2() {
        val num = "10200"
        val k = 1
        val expected = "200"

        assertEquals(expected, RemoveKDigits.removeKdigits(num, k))
    }

    @Test
    fun test3() {
        val num = "10"
        val k = 2
        val expected = "0"

        assertEquals(expected, RemoveKDigits.removeKdigits(num, k))
    }

    @Test
    fun test4() {
        val num = "9"
        val k = 1
        val expected = "0"

        assertEquals(expected, RemoveKDigits.removeKdigits(num, k))
    }

    @Test
    fun test5() {
        val num = "11111"
        val k = 3
        val expected = "11"

        assertEquals(expected, RemoveKDigits.removeKdigits(num, k))
    }
}