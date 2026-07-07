package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConcatenateNonZeroDigitsAndMultiplyBySumITest {
    @Test
    fun test1() {
        val n = 10203004
        val expected = 12340L

        assertEquals(expected, ConcatenateNonZeroDigitsAndMultiplyBySumI.sumAndMultiply(n))
    }

    @Test
    fun test2() {
        val n = 1000
        val expected = 1L

        assertEquals(expected, ConcatenateNonZeroDigitsAndMultiplyBySumI.sumAndMultiply(n))
    }
}