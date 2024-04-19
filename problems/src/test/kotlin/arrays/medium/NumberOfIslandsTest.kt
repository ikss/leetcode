package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfIslandsTest {
    @Test
    fun test1dfs() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
        )
        val expected = 1

        assertEquals(expected, NumberOfIslands.numIslandsDfs(grid))
    }

    @Test
    fun test2dfs() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1'),
        )
        val expected = 3

        assertEquals(expected, NumberOfIslands.numIslandsDfs(grid))
    }

    @Test
    fun test1unionFind() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
        )
        val expected = 1

        assertEquals(expected, NumberOfIslands.numIslandsUnionFind(grid))
    }

    @Test
    fun test2unionFind() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1'),
        )
        val expected = 3

        assertEquals(expected, NumberOfIslands.numIslandsUnionFind(grid))
    }
}
