package data_structures.other_data_structures.hard

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VerticalOrderTraversalOfBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = listOf(listOf(9), listOf(3, 15), listOf(20), listOf(7))

        assertEquals(expected, VerticalOrderTraversalOfBinaryTree.verticalTraversal(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6, 7)
        val expected = listOf(listOf(4), listOf(2), listOf(1, 5, 6), listOf(3), listOf(7))

        assertEquals(expected, VerticalOrderTraversalOfBinaryTree.verticalTraversal(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2, 3, 4, 6, 5, 7)
        val expected = listOf(listOf(4), listOf(2), listOf(1, 5, 6), listOf(3), listOf(7))

        assertEquals(expected, VerticalOrderTraversalOfBinaryTree.verticalTraversal(root))
    }
}
