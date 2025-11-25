package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryNumberWithAlternatingBitsTest {
    @Test
    fun test1binaryString() {
        val input = 5
        val expected = true

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBitsBinaryString(input))
    }

    @Test
    fun test2binaryString() {
        val input = 7
        val expected = false

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBitsBinaryString(input))
    }

    @Test
    fun test3binaryString() {
        val input = 11
        val expected = false

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBitsBinaryString(input))
    }

    @Test
    fun test1division() {
        val input = 5
        val expected = true

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBitsDivision(input))
    }

    @Test
    fun test2division() {
        val input = 7
        val expected = false

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBitsDivision(input))
    }

    @Test
    fun test3division() {
        val input = 11
        val expected = false

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBitsDivision(input))
    }
}