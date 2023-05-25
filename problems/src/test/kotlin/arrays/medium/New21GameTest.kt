package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class New21GameTest {
    @Test
    fun test1dp() {
        val n = 10
        val k = 1
        val maxPts = 10
        val expected = 1.0

        assertEquals(expected, New21Game.new21GameDp(n, k, maxPts), 0.00001)
    }

    @Test
    fun test2dp() {
        val n = 6
        val k = 1
        val maxPts = 10
        val expected = 0.6

        assertEquals(expected, New21Game.new21GameDp(n, k, maxPts), 0.00001)

    }

    @Test
    fun test3dp() {
        val n = 21
        val k = 17
        val maxPts = 10
        val expected = 0.73278

        assertEquals(expected, New21Game.new21GameDp(n, k, maxPts), 0.00001)
    }

    @Test
    fun test1dpOptimized() {
        val n = 10
        val k = 1
        val maxPts = 10
        val expected = 1.0

        assertEquals(expected, New21Game.new21GameDpOptimized(n, k, maxPts), 0.00001)
    }

    @Test
    fun test2dpOptimized() {
        val n = 6
        val k = 1
        val maxPts = 10
        val expected = 0.6

        assertEquals(expected, New21Game.new21GameDpOptimized(n, k, maxPts), 0.00001)

    }

    @Test
    fun test3dpOptimized() {
        val n = 21
        val k = 17
        val maxPts = 10
        val expected = 0.73278

        assertEquals(expected, New21Game.new21GameDpOptimized(n, k, maxPts), 0.00001)
    }
}