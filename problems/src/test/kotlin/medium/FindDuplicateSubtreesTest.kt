package medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindDuplicateSubtreesTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4, null, 2, 4, null, null, 4)
        val expected = listOf(TreeNode(4), TreeNode(2, left = TreeNode(4)))

        assertEquals(expected, FindDuplicateSubtrees.findDuplicateSubtrees(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, 1, 1)
        val expected = listOf(TreeNode(1))

        assertEquals(expected, FindDuplicateSubtrees.findDuplicateSubtrees(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(2, 2, 2, 3, null, 3, null)
        val expected = listOf(TreeNode(3), TreeNode(2, left = TreeNode(3)))

        assertEquals(expected, FindDuplicateSubtrees.findDuplicateSubtrees(root))
    }
}