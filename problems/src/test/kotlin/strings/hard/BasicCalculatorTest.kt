package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BasicCalculatorTest {

    @Test
    fun test1() {
        val s = "1 + 1"
        val expected = 2

        assertEquals(expected, BasicCalculator.calculate(s))
    }

    @Test
    fun test2() {
        val s = " 2-1 + 2 "
        val expected = 3

        assertEquals(expected, BasicCalculator.calculate(s))
    }

    @Test
    fun test3() {
        val s = "(1+(4+5+2)-3)+(6+8)"
        val expected = 23

        assertEquals(expected, BasicCalculator.calculate(s))
    }
}
