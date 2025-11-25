package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToCollectAllApplesInTreeTest {

    @Test
    fun test1() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6),
        )
        val hasApple = listOf(false, false, true, false, true, true, false)
        val expected = 8

        assertEquals(expected, MinimumTimeToCollectAllApplesInTree.minTime(n, edges, hasApple))
    }

    @Test
    fun test2() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6),
        )
        val hasApple = listOf(false, false, true, false, false, true, false)
        val expected = 6

        assertEquals(expected, MinimumTimeToCollectAllApplesInTree.minTime(n, edges, hasApple))
    }

    @Test
    fun test3() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6),
        )
        val hasApple = listOf(false, false, false, false, false, false, false)
        val expected = 0

        assertEquals(expected, MinimumTimeToCollectAllApplesInTree.minTime(n, edges, hasApple))
    }
}