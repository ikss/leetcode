package data_structures.other_data_structures.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RedundantConnectionTest {

    @Test
    fun test1dfs() {
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
        )
        val expected = intArrayOf(2, 3)

        assertTrue(expected.contentEquals(RedundantConnection.findRedundantConnectionDfs(edges)))
    }

    @Test
    fun test2dfs() {
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 4),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
        )
        val expected = intArrayOf(1, 4)

        assertTrue(expected.contentEquals(RedundantConnection.findRedundantConnectionDfs(edges)))
    }

    @Test
    fun test1dsu() {
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
        )
        val expected = intArrayOf(2, 3)

        assertTrue(expected.contentEquals(RedundantConnection.findRedundantConnectionDsu(edges)))
    }

    @Test
    fun test2dsu() {
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 4),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
        )
        val expected = intArrayOf(1, 4)

        assertTrue(expected.contentEquals(RedundantConnection.findRedundantConnectionDsu(edges)))
    }
}
