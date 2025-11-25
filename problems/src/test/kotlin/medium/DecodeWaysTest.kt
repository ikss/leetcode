package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DecodeWaysTest {

    @Test
    fun test1() {
        val s = "12"
        val expected = 2

        assertEquals(expected, DecodeWays.numDecodingsRecursive(s))
    }

    @Test
    fun test2() {
        val s = "226"
        val expected = 3

        assertEquals(expected, DecodeWays.numDecodingsRecursive(s))
    }

    @Test
    fun test3() {
        val s = "06"
        val expected = 0

        assertEquals(expected, DecodeWays.numDecodingsRecursive(s))
    }

    @Test
    fun test4() {
        val s = "12"
        val expected = 2

        assertEquals(expected, DecodeWays.numDecodingsDp(s))
    }

    @Test
    fun test5() {
        val s = "226"
        val expected = 3

        assertEquals(expected, DecodeWays.numDecodingsDp(s))
    }

    @Test
    fun test6() {
        val s = "06"
        val expected = 0

        assertEquals(expected, DecodeWays.numDecodingsDp(s))
    }
}
