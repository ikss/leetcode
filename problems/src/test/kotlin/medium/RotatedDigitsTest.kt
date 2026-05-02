package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RotatedDigitsTest {
    @Test
    fun test1() {
        val n = 10
        val expected = 4

        assertEquals(expected, RotatedDigits.rotatedDigits(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 0

        assertEquals(expected, RotatedDigits.rotatedDigits(n))
    }

    @Test
    fun test3() {
        val n = 2
        val expected = 1

        assertEquals(expected, RotatedDigits.rotatedDigits(n))
    }
}