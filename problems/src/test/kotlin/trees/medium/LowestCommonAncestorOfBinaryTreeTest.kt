package trees.medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LowestCommonAncestorOfBinaryTreeTest {

    @Test
    fun test1recursive() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = TreeBuilder.build(5, 6, 2, null, null, 7, 4)
        val q = TreeBuilder.build(1, 0, 8)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinaryTree.lowestCommonAncestorRecursive(root, p, q))
    }

    @Test
    fun test2recursive() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = TreeBuilder.build(5, 6, 2, null, null, 7, 4)
        val q = TreeNode(4)
        val expected = p

        assertEquals(expected, LowestCommonAncestorOfBinaryTree.lowestCommonAncestorRecursive(root, p, q))
    }

    @Test
    fun test3recursive() {
        val root = TreeBuilder.build(1, 2)
        val p = TreeBuilder.build(1, 2)
        val q = TreeNode(2)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinaryTree.lowestCommonAncestorRecursive(root, p, q))
    }

    @Test
    fun test1iterative() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = TreeBuilder.build(5, 6, 2, null, null, 7, 4)
        val q = TreeBuilder.build(1, 0, 8)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinaryTree.lowestCommonAncestorIterative(root, p, q))
    }

    @Test
    fun test2iterative() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = TreeBuilder.build(5, 6, 2, null, null, 7, 4)
        val q = TreeNode(4)
        val expected = p

        assertEquals(expected, LowestCommonAncestorOfBinaryTree.lowestCommonAncestorIterative(root, p, q))
    }

    @Test
    fun test3iterative() {
        val root = TreeBuilder.build(1, 2)
        val p = TreeBuilder.build(1, 2)
        val q = TreeNode(2)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinaryTree.lowestCommonAncestorIterative(root, p, q))
    }
}
