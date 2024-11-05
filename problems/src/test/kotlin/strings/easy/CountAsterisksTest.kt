package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountAsterisksTest {
    @Test
    fun test1() {
        val s = "l|*e*et|c**o|*de|"
        val expected = 2

        assertEquals(expected, CountAsterisks.countAsterisks(s))
    }

    @Test
    fun test2() {
        val s = "iamprogrammer"
        val expected = 0

        assertEquals(expected, CountAsterisks.countAsterisks(s))
    }

    @Test
    fun test3() {
        val s = "yo|uar|e**|b|e***au|tifu|l"
        val expected = 5

        assertEquals(expected, CountAsterisks.countAsterisks(s))
    }
}