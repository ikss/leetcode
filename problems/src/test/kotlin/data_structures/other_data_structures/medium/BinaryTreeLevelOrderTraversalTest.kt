package data_structures.other_data_structures.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeLevelOrderTraversalTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(listOf(3, 9, 20, null, null, 15, 7))
        val expected = listOf(listOf(3), listOf(9, 20), listOf(15, 7))

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrder(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(listOf(1))
        val expected = listOf(listOf(1))

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrder(root))
    }
}
