package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumArrayEndTest {
    @Test
    fun test1() {
        val n = 3
        val x = 4
        val expected = 6L

        assertEquals(expected, MinimumArrayEnd.minEnd(n, x))
    }

    @Test
    fun test2() {
        val n = 2
        val x = 7
        val expected = 15L

        assertEquals(expected, MinimumArrayEnd.minEnd(n, x))
    }
}