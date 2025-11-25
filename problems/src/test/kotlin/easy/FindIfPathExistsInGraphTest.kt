package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindIfPathExistsInGraphTest {

    @Test
    fun test1() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0))
        val source = 0
        val destination = 2
        val expected = true

        assertEquals(expected, FindIfPathExistsInGraph.validPathUnionFind(n, edges, source, destination))
    }

    @Test
    fun test2() {
        val n = 6
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(3, 5), intArrayOf(5, 4), intArrayOf(4, 3))
        val source = 0
        val destination = 5
        val expected = false

        assertEquals(expected, FindIfPathExistsInGraph.validPathUnionFind(n, edges, source, destination))
    }
}