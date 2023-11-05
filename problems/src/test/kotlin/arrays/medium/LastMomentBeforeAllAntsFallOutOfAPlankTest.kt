package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LastMomentBeforeAllAntsFallOutOfAPlankTest {
    @Test
    fun test1() {
        val n = 4
        val left = intArrayOf(4, 3)
        val right = intArrayOf(0, 1)
        val expected = 4

        assertEquals(expected, LastMomentBeforeAllAntsFallOutOfAPlank.getLastMoment(n, left, right))
    }

    @Test
    fun test2() {
        val n = 7
        val left = intArrayOf()
        val right = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
        val expected = 7

        assertEquals(expected, LastMomentBeforeAllAntsFallOutOfAPlank.getLastMoment(n, left, right))
    }

    @Test
    fun test3() {
        val n = 7
        val left = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
        val right = intArrayOf()
        val expected = 7

        assertEquals(expected, LastMomentBeforeAllAntsFallOutOfAPlank.getLastMoment(n, left, right))
    }

    @Test
    fun test4() {
        val n = 14
        val left = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
        val right = intArrayOf(8, 9, 10, 11, 12, 13, 14)
        val expected = 7

        assertEquals(expected, LastMomentBeforeAllAntsFallOutOfAPlank.getLastMoment(n, left, right))
    }
}