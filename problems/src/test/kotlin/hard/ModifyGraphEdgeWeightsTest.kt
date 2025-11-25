package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ModifyGraphEdgeWeightsTest {
    @Test
    fun test1() {
        val n = 5
        val edges = arrayOf(intArrayOf(4, 1, -1), intArrayOf(2, 0, -1), intArrayOf(0, 3, -1), intArrayOf(4, 3, -1))
        val source = 0
        val destination = 1
        val target = 5
        val expected = arrayOf(intArrayOf(4, 1, 1), intArrayOf(2, 0, 1), intArrayOf(0, 3, 1), intArrayOf(4, 3, 3))

        assertArrayEquals(expected, ModifyGraphEdgeWeights.modifiedGraphEdges(n, edges, source, destination, target))
    }

    @Test
    fun test2() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1, -1), intArrayOf(0, 2, 5))
        val source = 0
        val destination = 2
        val target = 6
        val expected = emptyArray<IntArray>()

        assertArrayEquals(expected, ModifyGraphEdgeWeights.modifiedGraphEdges(n, edges, source, destination, target))
    }

    @Test
    fun test3() {
        val n = 4
        val edges = arrayOf(intArrayOf(1, 0, 4), intArrayOf(1, 2, 3), intArrayOf(2, 3, 5), intArrayOf(0, 3, -1))
        val source = 0
        val destination = 2
        val target = 6
        val expected = arrayOf(intArrayOf(1, 0, 4), intArrayOf(1, 2, 3), intArrayOf(2, 3, 5), intArrayOf(0, 3, 1))

        assertArrayEquals(expected, ModifyGraphEdgeWeights.modifiedGraphEdges(n, edges, source, destination, target))
    }
    
}