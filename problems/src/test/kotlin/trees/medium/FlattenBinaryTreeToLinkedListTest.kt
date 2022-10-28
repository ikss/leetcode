package trees.medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlattenBinaryTreeToLinkedListTest {

    @Test
    fun test1recursive() {
        val root = TreeBuilder.build(1, 2, 5, 3, 4, null, 6)

        FlattenBinaryTreeToLinkedList.flattenRecursive(root)
        val expected = TreeNode(
            1,
            right = TreeNode(2, right = TreeNode(3, right = TreeNode(4, right = TreeNode(5, right = TreeNode(6)))))
        )

        assertEquals(expected, root)
    }

    @Test
    fun test2recursive() {
        val root: TreeNode? = null

        FlattenBinaryTreeToLinkedList.flattenRecursive(root)
        val expected: TreeNode? = null

        assertEquals(expected, root)
    }

    @Test
    fun test3recursive() {
        val root = TreeNode(0)

        FlattenBinaryTreeToLinkedList.flattenRecursive(root)
        val expected = TreeNode(0)

        assertEquals(expected, root)
    }

    @Test
    fun test1stack() {
        val root = TreeBuilder.build(1, 2, 5, 3, 4, null, 6)

        FlattenBinaryTreeToLinkedList.flattenStack(root)
        val expected = TreeNode(
            1,
            right = TreeNode(2, right = TreeNode(3, right = TreeNode(4, right = TreeNode(5, right = TreeNode(6)))))
        )

        assertEquals(expected, root)
    }

    @Test
    fun test2stack() {
        val root: TreeNode? = null

        FlattenBinaryTreeToLinkedList.flattenStack(root)
        val expected: TreeNode? = null

        assertEquals(expected, root)
    }

    @Test
    fun test3stack() {
        val root = TreeNode(0)

        FlattenBinaryTreeToLinkedList.flattenStack(root)
        val expected = TreeNode(0)

        assertEquals(expected, root)
    }
}
