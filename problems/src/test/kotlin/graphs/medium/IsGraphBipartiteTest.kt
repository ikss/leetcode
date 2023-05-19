package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IsGraphBipartiteTest {

    @Test
    fun test1() {
        val graph = arrayOf(intArrayOf(1, 2, 3), intArrayOf(0, 2), intArrayOf(0, 1, 3), intArrayOf(0, 2))
        val expected = false

        assertEquals(expected, IsGraphBipartite.isBipartite(graph))
    }

    @Test
    fun test2() {
        val graph = arrayOf(intArrayOf(1, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(0, 2))
        val expected = true

        assertEquals(expected, IsGraphBipartite.isBipartite(graph))
    }

    @Test
    fun test3() {
        val graph = arrayOf(intArrayOf(1), intArrayOf(0, 3), intArrayOf(3), intArrayOf(1, 2))
        val expected = true

        assertEquals(expected, IsGraphBipartite.isBipartite(graph))
    }
}