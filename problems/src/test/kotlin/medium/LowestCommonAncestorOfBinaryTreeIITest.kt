package medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LowestCommonAncestorOfBinaryTreeIITest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = TreeNode(5)
        val q = TreeNode(1)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinaryTreeII.lowestCommonAncestor(root, p, q))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = TreeBuilder.build(5, 6, 2, null, null, 7, 4)
        val q = TreeNode(4)
        val expected = p

        assertEquals(expected, LowestCommonAncestorOfBinaryTreeII.lowestCommonAncestor(root, p, q))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2)
        val p = TreeNode(1)
        val q = TreeNode(2)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinaryTreeII.lowestCommonAncestor(root, p, q))
    }
}