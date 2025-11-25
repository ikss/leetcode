package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KnightDialerTest {
    @Test
    fun test1() {
        val n = 1
        val expected = 10

        assertEquals(expected, KnightDialer.knightDialer(n))
    }

    @Test
    fun test2() {
        val n = 2
        val expected = 20

        assertEquals(expected, KnightDialer.knightDialer(n))
    }

    @Test
    fun test3() {
        val n = 3131
        val expected = 136006598

        assertEquals(expected, KnightDialer.knightDialer(n))
    }
}