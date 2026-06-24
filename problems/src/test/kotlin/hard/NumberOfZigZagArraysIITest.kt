package hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfZigZagArraysIITest {
    @Test
    fun test1() {
        val n = 3
        val l = 4
        val r = 5
        val expected = 2

        assertEquals(expected, NumberOfZigZagArraysII.zigZagArrays(n, l, r))
    }

    @Test
    fun test2() {
        val n = 3
        val l = 1
        val r = 3
        val expected = 10

        assertEquals(expected, NumberOfZigZagArraysII.zigZagArrays(n, l, r))
    }

    @Test
    fun test3() {
        val n = 89226042
        val l = 23
        val r = 49
        val expected = 901491272

        assertEquals(expected, NumberOfZigZagArraysII.zigZagArrays(n, l, r))
    }
}