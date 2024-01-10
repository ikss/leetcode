package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumProductOfSplittedBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6)
        val expected = 110

        assertEquals(expected, MaximumProductOfSplittedBinaryTree.maxProduct(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, null, 2, 3, 4, null, null, 5, 6)
        val expected = 90

        assertEquals(expected, MaximumProductOfSplittedBinaryTree.maxProduct(root))
    }
}