package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FractionAdditionAndSubtractionTest {
    @Test
    fun test1() {
        val expression = "-1/2+1/2"
        val expected = "0/1"

        assertEquals(expected, FractionAdditionAndSubtraction.fractionAddition(expression))
    }

    @Test
    fun test2() {
        val expression = "-1/2+1/2+1/3"
        val expected = "1/3"

        assertEquals(expected, FractionAdditionAndSubtraction.fractionAddition(expression))
    }

    @Test
    fun test3() {
        val expression = "1/3-1/2"
        val expected = "-1/6"

        assertEquals(expected, FractionAdditionAndSubtraction.fractionAddition(expression))
    }

    @Test
    fun test4() {
        val expression = "1/3-5/4+3/10"
        val expected = "-37/60"

        assertEquals(expected, FractionAdditionAndSubtraction.fractionAddition(expression))
    }
}