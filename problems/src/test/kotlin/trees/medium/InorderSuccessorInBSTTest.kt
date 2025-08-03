package trees.medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InorderSuccessorInBSTTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(2, 1, 3)
        val p = TreeNode(1)
        val expected = root

        assertEquals(expected, InorderSuccessorInBST.inorderSuccessor(root, p))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(5, 3, 6, 2, 4, null, null, 1)
        val p = TreeNode(6)
        val expected = null

        assertEquals(expected, InorderSuccessorInBST.inorderSuccessor(root, p))
    }
}