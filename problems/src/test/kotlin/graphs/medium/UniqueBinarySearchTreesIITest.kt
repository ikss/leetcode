package graphs.medium

import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueBinarySearchTreesIITest {
    @Test
    fun test1recursive() {
        val n = 3
        val expected = listOf(
            TreeNode(1, null, TreeNode(2, null, TreeNode(3))),
            TreeNode(1, null, TreeNode(3, TreeNode(2))),
            TreeNode(2, TreeNode(1), TreeNode(3)),
            TreeNode(3, TreeNode(1, null, TreeNode(2))),
            TreeNode(3, TreeNode(2, TreeNode(1), null)),
        )

        assertEquals(expected, UniqueBinarySearchTreesII.generateTreesRecursive(n))
    }

    @Test
    fun test2recursive() {
        val n = 1
        val expected = listOf(
            TreeNode(1)
        )

        assertEquals(expected, UniqueBinarySearchTreesII.generateTreesRecursive(n))
    }

    @Test
    fun test1memo() {
        val n = 3
        val expected = listOf(
            TreeNode(1, null, TreeNode(2, null, TreeNode(3))),
            TreeNode(1, null, TreeNode(3, TreeNode(2))),
            TreeNode(2, TreeNode(1), TreeNode(3)),
            TreeNode(3, TreeNode(1, null, TreeNode(2))),
            TreeNode(3, TreeNode(2, TreeNode(1), null)),
        )

        assertEquals(expected, UniqueBinarySearchTreesII.generateTreesMemo(n))
    }

    @Test
    fun test2memo() {
        val n = 1
        val expected = listOf(
            TreeNode(1)
        )

        assertEquals(expected, UniqueBinarySearchTreesII.generateTreesMemo(n))
    }
}