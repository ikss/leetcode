package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfOperationsToMakeNetworkConnectedTest {
    @Test
    fun test1dfs() {
        val n = 4
        val connections = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2))
        val expected = 1

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnectedDfs(n, connections))
    }

    @Test
    fun test2dfs() {
        val n = 6
        val connections = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
        )
        val expected = 2

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnectedDfs(n, connections))
    }

    @Test
    fun test3dfs() {
        val n = 6
        val connections = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(1, 2))
        val expected = -1

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnectedDfs(n, connections))
    }

    @Test
    fun test1uf() {
        val n = 4
        val connections = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2))
        val expected = 1

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnectedUnionFind(n, connections))
    }

    @Test
    fun test2uf() {
        val n = 6
        val connections = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
        )
        val expected = 2

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnectedUnionFind(n, connections))
    }

    @Test
    fun test3uf() {
        val n = 6
        val connections = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(1, 2))
        val expected = -1

        assertEquals(expected, NumberOfOperationsToMakeNetworkConnected.makeConnectedUnionFind(n, connections))
    }
}