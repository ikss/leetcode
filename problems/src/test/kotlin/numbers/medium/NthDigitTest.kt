package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NthDigitTest {

    @Test
    fun test1() {
        val n = 3
        val expected = 3

        assertEquals(expected, NthDigit.findNthDigit(n))
    }

    @Test
    fun test2() {
        val n = 11
        val expected = 0

        assertEquals(expected, NthDigit.findNthDigit(n))
    }

    @Test
    fun test3() {
        val n = 1000000000
        val expected = 1

        assertEquals(expected, NthDigit.findNthDigit(n))
    }
}