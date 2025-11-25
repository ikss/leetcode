package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OnesAndZeroesTest {
    @Test
    fun test1Backtrack() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 5
        val n = 3
        val expected = 4

        assertEquals(expected, OnesAndZeroes.findMaxFormBacktrack(strs, m, n))
    }

    @Test
    fun test2Backtrack() {
        val strs = arrayOf("10", "0", "1")
        val m = 1
        val n = 1
        val expected = 2

        assertEquals(expected, OnesAndZeroes.findMaxFormBacktrack(strs, m, n))
    }

    @Test
    fun test3Backtrack() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 4
        val n = 3
        val expected = 3

        assertEquals(expected, OnesAndZeroes.findMaxFormBacktrack(strs, m, n))
    }

    @Test
    fun test1BacktrackMemoized() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 5
        val n = 3
        val expected = 4

        assertEquals(expected, OnesAndZeroes.findMaxFormBacktrackMemoized(strs, m, n))
    }

    @Test
    fun test2BacktrackMemoized() {
        val strs = arrayOf("10", "0", "1")
        val m = 1
        val n = 1
        val expected = 2

        assertEquals(expected, OnesAndZeroes.findMaxFormBacktrackMemoized(strs, m, n))
    }

    @Test
    fun test3BacktrackMemoized() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 4
        val n = 3
        val expected = 3

        assertEquals(expected, OnesAndZeroes.findMaxFormBacktrackMemoized(strs, m, n))
    }


    @Test
    fun test1DP() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 5
        val n = 3
        val expected = 4

        assertEquals(expected, OnesAndZeroes.findMaxFormDP(strs, m, n))
    }

    @Test
    fun test2DP() {
        val strs = arrayOf("10", "0", "1")
        val m = 1
        val n = 1
        val expected = 2

        assertEquals(expected, OnesAndZeroes.findMaxFormDP(strs, m, n))
    }

    @Test
    fun test3DP() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 4
        val n = 3
        val expected = 3

        assertEquals(expected, OnesAndZeroes.findMaxFormDP(strs, m, n))
    }
}