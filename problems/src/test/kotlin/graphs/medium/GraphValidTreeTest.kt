package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GraphValidTreeTest {
    @Test
    fun test1() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(1, 4),
        )
        val expected = true

        assertEquals(expected, GraphValidTree.validTree(n, edges))
    }
    
    @Test
    fun test2() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
        )
        val expected = false

        assertEquals(expected, GraphValidTree.validTree(n, edges))
    }
    
    @Test
    fun test3() {
        val n = 1
        val edges = arrayOf<IntArray>()
        val expected = true

        assertEquals(expected, GraphValidTree.validTree(n, edges))
    }
}