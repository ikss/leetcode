package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDepthOfBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = 2

        assertEquals(expected, MinimumDepthOfBinaryTree.minDepth(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, null, 3, null, 4, null, 5, null, 6)
        val expected = 5

        assertEquals(expected, MinimumDepthOfBinaryTree.minDepth(root))
    }
}