package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestDivisibleDigitProductIITest {
    @Test
    fun test1() {
        val n = "1234"
        val t = 256L
        val expected = "1488"

        assertEquals(expected, SmallestDivisibleDigitProductII.smallestNumber(n, t))
    }

    @Test
    fun test2() {
        val n = "12355"
        val t = 50L
        val expected = "12355"

        assertEquals(expected, SmallestDivisibleDigitProductII.smallestNumber(n, t))
    }
}