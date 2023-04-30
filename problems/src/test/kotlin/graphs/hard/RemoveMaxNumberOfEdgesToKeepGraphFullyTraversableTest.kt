package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversableTest {

    @Test
    fun test1() {
        val n = 4
        val edges = arrayOf(
            intArrayOf(3, 1, 2),
            intArrayOf(3, 2, 3),
            intArrayOf(1, 1, 3),
            intArrayOf(1, 2, 4),
            intArrayOf(1, 1, 2),
            intArrayOf(2, 3, 4),
        )
        val expected = 2

        assertEquals(expected, RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable.maxNumEdgesToRemove(n, edges))
    }

    @Test
    fun test2() {
        val n = 4
        val edges = arrayOf(intArrayOf(3, 1, 2), intArrayOf(3, 2, 3), intArrayOf(1, 1, 4), intArrayOf(2, 1, 4))
        val expected = 0

        assertEquals(expected, RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable.maxNumEdgesToRemove(n, edges))
    }

    @Test
    fun test3() {
        val n = 4
        val edges = arrayOf(intArrayOf(3, 2, 3), intArrayOf(1, 1, 2), intArrayOf(2, 3, 4))
        val expected = -1

        assertEquals(expected, RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable.maxNumEdgesToRemove(n, edges))
    }
}