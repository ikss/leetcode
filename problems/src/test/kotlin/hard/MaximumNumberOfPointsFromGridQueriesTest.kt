package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfPointsFromGridQueriesTest {
    @Test
    fun test1SimpleDfs() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(2, 5, 7),
            intArrayOf(3, 5, 1),
        )
        val queries = intArrayOf(5, 6, 2)
        val expected = intArrayOf(5, 8, 1)

        assertArrayEquals(expected, MaximumNumberOfPointsFromGridQueries.maxPointsSimpleDfs(grid, queries))
    }

    @Test
    fun test2SimpleDfs() {
        val grid = arrayOf(
            intArrayOf(5, 2, 1),
            intArrayOf(1, 1, 2),
        )
        val queries = intArrayOf(3)
        val expected = intArrayOf(0)

        assertArrayEquals(expected, MaximumNumberOfPointsFromGridQueries.maxPointsSimpleDfs(grid, queries))
    }

    @Test
    fun test1PriorityQueue() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(2, 5, 7),
            intArrayOf(3, 5, 1),
        )
        val queries = intArrayOf(5, 6, 2)
        val expected = intArrayOf(5, 8, 1)

        assertArrayEquals(expected, MaximumNumberOfPointsFromGridQueries.maxPointsPriorityQueue(grid, queries))
    }

    @Test
    fun test2PriorityQueue() {
        val grid = arrayOf(
            intArrayOf(5, 2, 1),
            intArrayOf(1, 1, 2),
        )
        val queries = intArrayOf(3)
        val expected = intArrayOf(0)

        assertArrayEquals(expected, MaximumNumberOfPointsFromGridQueries.maxPointsPriorityQueue(grid, queries))
    }
}