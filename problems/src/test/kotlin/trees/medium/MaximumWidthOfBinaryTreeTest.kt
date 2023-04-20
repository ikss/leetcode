package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumWidthOfBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 3, 2, 5, 3, null, 9)
        val expected = 4

        assertEquals(expected, MaximumWidthOfBinaryTree.widthOfBinaryTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 3, 2, 5)
        val expected = 2

        assertEquals(expected, MaximumWidthOfBinaryTree.widthOfBinaryTree(root))
    }
}