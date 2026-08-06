package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestDivisibleDigitProductITest {
    @Test
    fun test1() {
        val n = 10
        val t = 2
        val expected = 10

        assertEquals(expected, SmallestDivisibleDigitProductI.smallestNumber(n, t))
    }

    @Test
    fun test2() {
        val n = 15
        val t = 3
        val expected = 16

        assertEquals(expected, SmallestDivisibleDigitProductI.smallestNumber(n, t))
    }
}