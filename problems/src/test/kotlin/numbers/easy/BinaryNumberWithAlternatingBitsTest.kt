package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryNumberWithAlternatingBitsTest {
    @Test
    fun test1() {
        val input = 5
        val expected = true

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBits(input))
    }

    @Test
    fun test2() {
        val input = 7
        val expected = false

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBits(input))
    }

    @Test
    fun test3() {
        val input = 11
        val expected = false

        assertEquals(expected, BinaryNumberWithAlternatingBits.hasAlternatingBits(input))
    }
}