package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StrangePrinterTest {
    @Test
    fun test1() {
        val input = "aaabbb"
        val expected = 2

        assertEquals(expected, StrangePrinter.strangePrinter(input))
    }

    @Test
    fun test2() {
        val input = "aba"
        val expected = 2

        assertEquals(expected, StrangePrinter.strangePrinter(input))
    }
}