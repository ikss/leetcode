package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SlidingPuzzleTest {
    @Test
    fun test1() {
        val board = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 5))
        val expected = 1

        assertEquals(expected, SlidingPuzzle.slidingPuzzle(board))
    }

    @Test
    fun test2() {
        val board = arrayOf(intArrayOf(1, 2, 3), intArrayOf(5, 4, 0))
        val expected = -1

        assertEquals(expected, SlidingPuzzle.slidingPuzzle(board))
    }

    @Test
    fun test3() {
        val board = arrayOf(intArrayOf(4, 1, 2), intArrayOf(5, 0, 3))
        val expected = 5

        assertEquals(expected, SlidingPuzzle.slidingPuzzle(board))
    }
}