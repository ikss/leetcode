package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberComplementTest {
    @Test
    fun test1() {
        val n = 5
        val expected = 2

        assertEquals(expected, NumberComplement.findComplement(n))
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 0

        assertEquals(expected, NumberComplement.findComplement(n))
    }

    @Test
    fun test1HighestOneBit() {
        val n = 5
        val expected = 2

        assertEquals(expected, NumberComplement.findComplementHighestOneBit(n))
    }

    @Test
    fun test2HighestOneBit() {
        val n = 1
        val expected = 0

        assertEquals(expected, NumberComplement.findComplementHighestOneBit(n))
    }

    @Test
    fun test1HackerDelight() {
        val n = 5
        val expected = 2

        assertEquals(expected, NumberComplement.findComplementHackerDelight(n))
    }

    @Test
    fun test2HackerDelight() {
        val n = 1
        val expected = 0

        assertEquals(expected, NumberComplement.findComplementHackerDelight(n))
    }
}