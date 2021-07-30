package numbers.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringToIntegerTest {

    @Test
    fun test1() {
        val s = "42"
        val excepted = 42
        assertEquals(excepted, StringToInteger.myAtoi(s))
    }

    @Test
    fun test2() {
        val s = "   -42"
        val excepted = -42
        assertEquals(excepted, StringToInteger.myAtoi(s))
    }

    @Test
    fun test3() {
        val s = "4193 with words"
        val excepted = 4193
        assertEquals(excepted, StringToInteger.myAtoi(s))
    }

    @Test
    fun test4() {
        val s = "words and 987"
        val excepted = 0
        assertEquals(excepted, StringToInteger.myAtoi(s))
    }

    @Test
    fun test5() {
        val s = "-91283472332"
        val excepted = -2147483648
        assertEquals(excepted, StringToInteger.myAtoi(s))
    }

    @Test
    fun test6() {
        val s = "20000000000000000000"
        val excepted = 2147483647
        assertEquals(excepted, StringToInteger.myAtoi(s))
    }
}
