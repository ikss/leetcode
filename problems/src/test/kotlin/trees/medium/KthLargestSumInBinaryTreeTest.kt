package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthLargestSumInBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 8, 9, 2, 1, 3, 7, 4, 6)
        val k = 2
        val expected = 13L

        assertEquals(expected, KthLargestSumInBinaryTree.kthLargestLevelSum(root, k))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, null, 3)
        val k = 1
        val expected = 3L

        assertEquals(expected, KthLargestSumInBinaryTree.kthLargestLevelSum(root, k))
    }
}