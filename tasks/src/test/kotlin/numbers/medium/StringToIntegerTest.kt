package numbers.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringToIntegerTest {

    @Test
    fun test1() {
        val s = "42"
        val expected = 42
        assertEquals(expected, StringToInteger.myAtoi(s))
    }

    @Test
    fun test2() {
        val s = "   -42"
        val expected = -42
        assertEquals(expected, StringToInteger.myAtoi(s))
    }

    @Test
    fun test3() {
        val s = "4193 with words"
        val expected = 4193
        assertEquals(expected, StringToInteger.myAtoi(s))
    }

    @Test
    fun test4() {
        val s = "words and 987"
        val expected = 0
        assertEquals(expected, StringToInteger.myAtoi(s))
    }

    @Test
    fun test5() {
        val s = "-91283472332"
        val expected = -2147483648
        assertEquals(expected, StringToInteger.myAtoi(s))
    }

    @Test
    fun test6() {
        val s = "20000000000000000000"
        val expected = 2147483647
        assertEquals(expected, StringToInteger.myAtoi(s))
    }
}
