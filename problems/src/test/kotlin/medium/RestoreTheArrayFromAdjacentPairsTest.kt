package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RestoreTheArrayFromAdjacentPairsTest {
    @Test
    fun test1() {
        val adjacentPairs = arrayOf(
            intArrayOf(2, 1),
            intArrayOf(3, 4),
            intArrayOf(3, 2),
        )
        val expected = intArrayOf(1, 2, 3, 4)

        assertArrayEquals(expected, RestoreTheArrayFromAdjacentPairs.restoreArray(adjacentPairs))
    }

    @Test
    fun test2() {
        val adjacentPairs = arrayOf(
            intArrayOf(4, -2),
            intArrayOf(1, 4),
            intArrayOf(-3, 1),
        )
        val expected = intArrayOf(-2, 4, 1, -3)

        assertArrayEquals(expected, RestoreTheArrayFromAdjacentPairs.restoreArray(adjacentPairs))
    }

    @Test
    fun test3() {
        val adjacentPairs = arrayOf(
            intArrayOf(100000, -100000),
        )
        val expected = intArrayOf(100000, -100000)

        assertArrayEquals(expected, RestoreTheArrayFromAdjacentPairs.restoreArray(adjacentPairs))
    }
}