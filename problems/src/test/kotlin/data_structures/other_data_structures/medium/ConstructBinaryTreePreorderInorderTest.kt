package data_structures.other_data_structures.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructBinaryTreePreorderInorderTest {

    @Test
    fun test1naive() {
        val preorder = intArrayOf(3, 9, 20, 15, 7)
        val inorder = intArrayOf(9, 3, 15, 20, 7)
        val expected = TreeBuilder.build(listOf(3, 9, 20, null, null, 15, 7))

        assertEquals(expected, ConstructBinaryTreePreorderInorder.buildTreeNaive(preorder, inorder))
    }

    @Test
    fun test2naive() {
        val preorder = intArrayOf(-1)
        val inorder = intArrayOf(-1)
        val expected = TreeBuilder.build(listOf(-1))

        assertEquals(expected, ConstructBinaryTreePreorderInorder.buildTreeNaive(preorder, inorder))
    }

    @Test
    fun test1index() {
        val preorder = intArrayOf(3, 9, 20, 15, 7)
        val inorder = intArrayOf(9, 3, 15, 20, 7)
        val expected = TreeBuilder.build(listOf(3, 9, 20, null, null, 15, 7))

        assertEquals(expected, ConstructBinaryTreePreorderInorder.buildTreeWithIndex(preorder, inorder))
    }

    @Test
    fun test2index() {
        val preorder = intArrayOf(-1)
        val inorder = intArrayOf(-1)
        val expected = TreeBuilder.build(listOf(-1))

        assertEquals(expected, ConstructBinaryTreePreorderInorder.buildTreeWithIndex(preorder, inorder))
    }
}
