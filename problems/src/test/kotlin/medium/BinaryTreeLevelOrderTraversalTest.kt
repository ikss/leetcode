package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeLevelOrderTraversalTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = listOf(listOf(3), listOf(9, 20), listOf(15, 7))

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrder(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val expected = listOf(listOf(1))

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrder(root))
    }

    @Test
    fun test3() {
        val root = null
        val expected = emptyList<List<Int>>()

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrder(root))
    }

    @Test
    fun test1simple() {
        val root = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = listOf(listOf(3), listOf(9, 20), listOf(15, 7))

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrderSimple(root))
    }

    @Test
    fun test2simple() {
        val root = TreeBuilder.build(1)
        val expected = listOf(listOf(1))

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrderSimple(root))
    }

    @Test
    fun test3simple() {
        val root = null
        val expected = emptyList<List<Int>>()

        assertEquals(expected, BinaryTreeLevelOrderTraversal.levelOrderSimple(root))
    }
}
