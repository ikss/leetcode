package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfEnclavesTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(1, 0, 1, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 0, 0),
        )
        val expected = 3

        assertEquals(expected, NumberOfEnclaves.numEnclaves(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0),
        )
        val expected = 0

        assertEquals(expected, NumberOfEnclaves.numEnclaves(grid))
    }
}