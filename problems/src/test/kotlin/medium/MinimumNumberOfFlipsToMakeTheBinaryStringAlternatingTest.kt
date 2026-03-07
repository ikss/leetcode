package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfFlipsToMakeTheBinaryStringAlternatingTest {
    @Test
    fun test1() {
        val s = "111000"
        val expected = 2

        assertEquals(expected, MinimumNumberOfFlipsToMakeTheBinaryStringAlternating.minFlips(s))
    }

    @Test
    fun test2() {
        val s = "010"
        val expected = 0

        assertEquals(expected, MinimumNumberOfFlipsToMakeTheBinaryStringAlternating.minFlips(s))
    }
}