package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructBinaryTreeInorderPostorderTest {

    @Test
    fun test1() {
        val inorder = intArrayOf(9, 3, 15, 20, 7)
        val postorder = intArrayOf(9, 15, 7, 20, 3)
        val expected = TreeBuilder.build(3, 9, 20, null, null, 15, 7)

        assertEquals(expected, ConstructBinaryTreeInorderPostorder.buildTree(inorder, postorder))
    }

    @Test
    fun test2() {
        val inorder = intArrayOf(-1)
        val postorder = intArrayOf(-1)
        val expected = TreeBuilder.build(-1)

        assertEquals(expected, ConstructBinaryTreeInorderPostorder.buildTree(inorder, postorder))
    }

}