package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WaysToExpressIntegerAsSumOfPowersTest {
    @Test
    fun test1() {
        val n = 10
        val x = 2
        val expected = 1

        assertEquals(expected, WaysToExpressIntegerAsSumOfPowers.numberOfWays(n, x))
    }

    @Test
    fun test2() {
        val n = 4
        val x = 1
        val expected = 2

        assertEquals(expected, WaysToExpressIntegerAsSumOfPowers.numberOfWays(n, x))
    }
}