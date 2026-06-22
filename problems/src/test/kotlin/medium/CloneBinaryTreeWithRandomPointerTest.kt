package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import medium.CloneBinaryTreeWithRandomPointer.Node
import medium.CloneBinaryTreeWithRandomPointer.NodeCopy

class CloneBinaryTreeWithRandomPointerTest {
    @Test
    fun test1() {
        val root = Node(1)
        root.right = Node(4)
        root.right!!.left = Node(7).also { it.random = root }
        val expectedRoot = NodeCopy(1)
        expectedRoot.right = NodeCopy(4)
        expectedRoot.right!!.left = NodeCopy(7).also { it.random = expectedRoot }

        assertEquals(expectedRoot, CloneBinaryTreeWithRandomPointer.copyRandomBinaryTree(root))
    }
}