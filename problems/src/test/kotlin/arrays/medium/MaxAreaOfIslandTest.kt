package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxAreaOfIslandTest {
    @Test
    fun test1dfs() {
        val grid = arrayOf(
            intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0),
        )
        val expected = 6

        assertEquals(expected, MaxAreaOfIsland.maxAreaOfIslandDfs(grid))
    }

    @Test
    fun test2dfs() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0),
        )
        val expected = 0

        assertEquals(expected, MaxAreaOfIsland.maxAreaOfIslandDfs(grid))
    }

    @Test
    fun test3dfs() {
        val grid = arrayOf(
            intArrayOf(1,1,0,0,0),
            intArrayOf(1,1,0,0,0),
            intArrayOf(0,0,0,1,1),
            intArrayOf(0,0,0,1,1),
        )
        val expected = 4

        assertEquals(expected, MaxAreaOfIsland.maxAreaOfIslandDfs(grid))
    }

    @Test
    fun test1bfs() {
        val grid = arrayOf(
            intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
            intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0),
        )
        val expected = 6

        assertEquals(expected, MaxAreaOfIsland.maxAreaOfIslandBfs(grid))
    }

    @Test
    fun test2bfs() {
        val grid = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0),
        )
        val expected = 0

        assertEquals(expected, MaxAreaOfIsland.maxAreaOfIslandBfs(grid))
    }

    @Test
    fun test3bfs() {
        val grid = arrayOf(
            intArrayOf(1,1,0,0,0),
            intArrayOf(1,1,0,0,0),
            intArrayOf(0,0,0,1,1),
            intArrayOf(0,0,0,1,1),
        )
        val expected = 4

        assertEquals(expected, MaxAreaOfIsland.maxAreaOfIslandBfs(grid))
    }
}
