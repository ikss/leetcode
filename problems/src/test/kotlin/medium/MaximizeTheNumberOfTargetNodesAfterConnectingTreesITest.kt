package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximizeTheNumberOfTargetNodesAfterConnectingTreesITest {
    @Test
    fun test1() {
        val edges1 = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(2, 4))
        val edges2 = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(2, 7),
            intArrayOf(1, 4),
            intArrayOf(4, 5),
            intArrayOf(4, 6),
        )
        val k = 2

        val expected = intArrayOf(9, 7, 9, 8, 8)
        assertArrayEquals(
            expected,
            MaximizeTheNumberOfTargetNodesAfterConnectingTreesI.maxTargetNodes(edges1, edges2, k)
        )
    }

    @Test
    fun test2() {
        val edges1 = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(0, 4))
        val edges2 = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3))
        val k = 1

        val expected = intArrayOf(6, 3, 3, 3, 3)
        assertArrayEquals(
            expected,
            MaximizeTheNumberOfTargetNodesAfterConnectingTreesI.maxTargetNodes(edges1, edges2, k)
        )
    }
}