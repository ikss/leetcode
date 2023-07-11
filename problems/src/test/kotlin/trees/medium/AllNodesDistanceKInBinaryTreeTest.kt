package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AllNodesDistanceKInBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val target = root!!.left!!
        val k = 2
        val expected = listOf(7, 4, 1)

        assertEquals(expected, AllNodesDistanceKInBinaryTree.distanceK(root, target, k))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val target = root!!
        val k = 3
        val expected = emptyList<Int>()

        assertEquals(expected, AllNodesDistanceKInBinaryTree.distanceK(root, target, k))
    }
}