package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumLevelSumOfBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 7, 0, 7, -8)
        val expected = 2

        assertEquals(expected, MaximumLevelSumOfBinaryTree.maxLevelSum(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(989, null, 10250, null, null, 98693, -89388, null, null, null, -32127)
        val expected = 2

        assertEquals(expected, MaximumLevelSumOfBinaryTree.maxLevelSum(root))
    }
}