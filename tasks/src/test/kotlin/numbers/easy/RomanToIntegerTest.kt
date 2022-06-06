package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanToIntegerTest {

    @Test
    fun test1() {
        val str = "III"
        val expected = 3
        assertEquals(expected, RomanToInteger.romanToInt(str))
    }

    @Test
    fun test2() {
        val str = "IV"
        val expected = 4
        assertEquals(expected, RomanToInteger.romanToInt(str))
    }

    @Test
    fun test3() {
        val str = "IX"
        val expected = 9
        assertEquals(expected, RomanToInteger.romanToInt(str))
    }

    @Test
    fun test4() {
        val str = "LVIII"
        val expected = 58
        assertEquals(expected, RomanToInteger.romanToInt(str))
    }

    @Test
    fun test5() {
        val str = "MCMXCIV"
        val expected = 1994
        assertEquals(expected, RomanToInteger.romanToInt(str))
    }
}
