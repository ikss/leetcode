package medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteNodesAndReturnForestTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6, 7)
        val to_delete = intArrayOf(3, 5)
        val expected = listOf(
            TreeBuilder.build(1, 2, null, 4),
            TreeBuilder.build(6),
            TreeBuilder.build(7),
        )

        assertEquals(expected, DeleteNodesAndReturnForest.delNodes(root, to_delete))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 4, null, 3)
        val to_delete = intArrayOf(3)
        val expected = listOf(TreeBuilder.build(1, 2, 4))

        assertEquals(expected, DeleteNodesAndReturnForest.delNodes(root, to_delete))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6, 7)
        val to_delete = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val expected = emptyList<TreeNode>()

        assertEquals(expected, DeleteNodesAndReturnForest.delNodes(root, to_delete))
    }
}