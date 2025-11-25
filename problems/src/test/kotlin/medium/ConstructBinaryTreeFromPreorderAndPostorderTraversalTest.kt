package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructBinaryTreeFromPreorderAndPostorderTraversalTest {
    @Test
    fun test1() {
        val preorder = intArrayOf(1, 2, 4, 5, 3, 6, 7)
        val postorder = intArrayOf(4, 5, 2, 6, 7, 3, 1)
        val expected = TreeBuilder.build(1, 2, 3, 4, 5, 6, 7)

        assertEquals(expected, ConstructBinaryTreeFromPreorderAndPostorderTraversal.constructFromPrePost(preorder, postorder))
    }

    @Test
    fun test2() {
        val preorder = intArrayOf(1, 2, 3)
        val postorder = intArrayOf(2, 3, 1)
        val expected = TreeBuilder.build(1, 2, 3)

        assertEquals(expected, ConstructBinaryTreeFromPreorderAndPostorderTraversal.constructFromPrePost(preorder, postorder))
    }
}