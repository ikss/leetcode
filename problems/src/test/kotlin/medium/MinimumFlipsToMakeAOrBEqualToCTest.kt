package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumFlipsToMakeAOrBEqualToCTest {

    @Test
    fun test1() {
        val a = 2
        val b = 6
        val c = 5
        val expected = 3

        assertEquals(expected, MinimumFlipsToMakeAOrBEqualToC.minFlips(a, b, c))
    }

    @Test
    fun test2() {
        val a = 4
        val b = 2
        val c = 7
        val expected = 1

        assertEquals(expected, MinimumFlipsToMakeAOrBEqualToC.minFlips(a, b, c))
    }

    @Test
    fun test3() {
        val a = 1
        val b = 2
        val c = 3
        val expected = 0

        assertEquals(expected, MinimumFlipsToMakeAOrBEqualToC.minFlips(a, b, c))
    }
}