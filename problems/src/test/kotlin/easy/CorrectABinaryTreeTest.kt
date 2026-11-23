package easy

import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CorrectABinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeNode(1)
        val fromNode = TreeNode(2)
        val toNode = TreeNode(3)
        fromNode.right = toNode
        root.left = fromNode
        root.right = toNode

        val expected = TreeNode(1, right = toNode)

        assertEquals(expected, CorrectABinaryTree.correctBinaryTree(root))
    }
}