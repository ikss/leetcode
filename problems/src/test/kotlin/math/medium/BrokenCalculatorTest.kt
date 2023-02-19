package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BrokenCalculatorTest {

    @Test
    fun test1() {
        val startValue = 2
        val target = 3
        val expected = 2

        assertEquals(expected, BrokenCalculator.brokenCalc(startValue, target))
    }

    @Test
    fun test2() {
        val startValue = 5
        val target = 8
        val expected = 2

        assertEquals(expected, BrokenCalculator.brokenCalc(startValue, target))
    }

    @Test
    fun test3() {
        val startValue = 3
        val target = 10
        val expected = 3

        assertEquals(expected, BrokenCalculator.brokenCalc(startValue, target))
    }
}