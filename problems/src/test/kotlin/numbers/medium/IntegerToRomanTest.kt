package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class IntegerToRomanTest {

    @Test
    fun test1() {
        val num = 3
        val expected = "III"

        assertEquals(expected, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test2() {
        val num = 4
        val expected = "IV"

        assertEquals(expected, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test3() {
        val num = 9
        val expected = "IX"

        assertEquals(expected, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test4() {
        val num = 58
        val expected = "LVIII"

        assertEquals(expected, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test5() {
        val num = 1994
        val expected = "MCMXCIV"

        assertEquals(expected, IntegerToRoman.intToRoman(num))
    }
}
