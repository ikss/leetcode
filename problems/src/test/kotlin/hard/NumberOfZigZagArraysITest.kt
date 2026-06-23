package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfZigZagArraysITest {
    @Test
    fun test1() {
        val n = 3
        val l = 4
        val r = 5
        val expected = 2

        assertEquals(expected, NumberOfZigZagArraysI.zigZagArrays(n, l, r))
    }

    @Test
    fun test2() {
        val n = 3
        val l = 1
        val r = 3
        val expected = 10

        assertEquals(expected, NumberOfZigZagArraysI.zigZagArrays(n, l, r))
    }
}