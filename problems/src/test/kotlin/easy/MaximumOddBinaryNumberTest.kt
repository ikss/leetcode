package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumOddBinaryNumberTest {
    @Test
    fun test1() {
        val input = "010"
        val expected = "001"

        assertEquals(expected, MaximumOddBinaryNumber.maximumOddBinaryNumber(input))
    }

    @Test
    fun test2() {
        val input = "0101"
        val expected = "1001"
        assertEquals(expected, MaximumOddBinaryNumber.maximumOddBinaryNumber(input))
    }
}