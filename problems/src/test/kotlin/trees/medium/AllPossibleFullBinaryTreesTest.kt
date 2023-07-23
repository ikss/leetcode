package trees.medium

import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AllPossibleFullBinaryTreesTest {
    @Test
    fun test1() {
        val n = 7
        val smallTree = TreeNode(0, TreeNode(0), TreeNode(0))
        val expected = listOf(
            TreeNode(0, TreeNode(0), TreeNode(0, TreeNode(0), smallTree)),
            TreeNode(0, TreeNode(0), TreeNode(0, smallTree, TreeNode(0))),
            TreeNode(0, smallTree, smallTree),
            TreeNode(0, TreeNode(0, TreeNode(0), smallTree), TreeNode(0)),
            TreeNode(0, TreeNode(0, smallTree, TreeNode(0)), TreeNode(0)),
        )

        assertEquals(expected, AllPossibleFullBinaryTrees.allPossibleFBT(n))
    }

    @Test
    fun test2() {
        val n = 3
        val expected = listOf(TreeNode(0, TreeNode(0), TreeNode(0)))

        assertEquals(expected, AllPossibleFullBinaryTrees.allPossibleFBT(n))
    }
}