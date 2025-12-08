package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSquareSumTriplesTest {
    @Test
    fun test1() {
        val n = 5
        val expected = 2

        assertEquals(expected, CountSquareSumTriples.countTriples(n))
    }

    @Test
    fun test2() {
        val n = 10
        val expected = 4

        assertEquals(expected, CountSquareSumTriples.countTriples(n))
    }
}