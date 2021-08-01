package numbers.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IntegerToRomanTest {

    @Test
    fun test1() {
        val num = 3
        val excepted = "III"
        assertEquals(excepted, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test2() {
        val num = 4
        val excepted = "IV"
        assertEquals(excepted, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test3() {
        val num = 9
        val excepted = "IX"
        assertEquals(excepted, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test4() {
        val num = 58
        val excepted = "LVIII"
        assertEquals(excepted, IntegerToRoman.intToRoman(num))
    }

    @Test
    fun test5() {
        val num = 1994
        val excepted = "MCMXCIV"
        assertEquals(excepted, IntegerToRoman.intToRoman(num))
    }
}
