package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PaintFenceTest {
    @Test
    fun test1() {
        val n = 3
        val k = 2
        val expected = 6

        assertEquals(expected, PaintFence.numWays(n, k))
    }

    @Test
    fun test2() {
        val n = 1
        val k = 1
        val expected = 1

        assertEquals(expected, PaintFence.numWays(n, k))
    }

    @Test
    fun test3() {
        val n = 7
        val k = 2
        val expected = 42

        assertEquals(expected, PaintFence.numWays(n, k))
    }
}