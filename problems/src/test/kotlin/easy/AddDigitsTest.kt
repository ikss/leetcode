package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddDigitsTest {

    @Test
    fun test1tailrec() {
        val n = 38
        val expected = 2

        assertEquals(expected, AddDigits.addDigitsTailrec(n))
    }

    @Test
    fun test2tailrec() {
        val n = 0
        val expected = 0

        assertEquals(expected, AddDigits.addDigitsTailrec(n))
    }

    @Test
    fun test1math() {
        val n = 38
        val expected = 2

        assertEquals(expected, AddDigits.addDigitsMath(n))
    }

    @Test
    fun test2math() {
        val n = 0
        val expected = 0

        assertEquals(expected, AddDigits.addDigitsMath(n))
    }
}