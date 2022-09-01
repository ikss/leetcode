package data_structures.other_data_structures.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountGoodNodesInBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 1, 4, 3, null, 1, 5)
        val expected = 4

        assertEquals(expected, CountGoodNodesInBinaryTree.goodNodes(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(3, 3, null, 4, 2)
        val expected = 3

        assertEquals(expected, CountGoodNodesInBinaryTree.goodNodes(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1)
        val expected = 1

        assertEquals(expected, CountGoodNodesInBinaryTree.goodNodes(root))
    }
}
