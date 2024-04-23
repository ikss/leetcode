package trees.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumHeightTreesTest {
    @Test
    fun test1() {
        val n = 4
        val edges = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
        )
        val expected = listOf(1)

        assertEquals(expected, MinimumHeightTrees.findMinHeightTrees(n, edges))
    }

    @Test
    fun test2() {
        val n = 6
        val edges = arrayOf(
            intArrayOf(3, 0),
            intArrayOf(3, 1),
            intArrayOf(3, 2),
            intArrayOf(3, 4),
            intArrayOf(5, 4),
        )
        val expected = listOf(3, 4)

        assertEquals(expected, MinimumHeightTrees.findMinHeightTrees(n, edges))
    }
}