package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    fun test1naive() {
        val tree = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = arrayListOf(arrayListOf(3), arrayListOf(20, 9), arrayListOf(15, 7))

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderNaive(tree))
    }

    @Test
    fun test2naive() {
        val tree = TreeBuilder.build(1)
        val expected = arrayListOf(arrayListOf(1))

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderNaive(tree))
    }

    @Test
    fun test3naive() {
        val tree = TreeBuilder.build()
        val expected = emptyList<ArrayList<Int>>()

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderNaive(tree))
    }

    @Test
    fun test4naive() {
        val tree = TreeBuilder.build(0, 2, 4, 1, null, 3, -1, 5, 1, 6, null, 8)
        val expected = arrayListOf(arrayListOf(0), arrayListOf(4, 2), arrayListOf(1, 3, -1), arrayListOf(8, 6, 1, 5))

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderNaive(tree))
    }

    @Test
    fun test1dfs() {
        val tree = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = arrayListOf(arrayListOf(3), arrayListOf(20, 9), arrayListOf(15, 7))

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderDfs(tree))
    }

    @Test
    fun test2dfs() {
        val tree = TreeBuilder.build(1)
        val expected = arrayListOf(arrayListOf(1))

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderDfs(tree))
    }

    @Test
    fun test3dfs() {
        val tree = TreeBuilder.build()
        val expected = emptyList<ArrayList<Int>>()

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderDfs(tree))
    }

    @Test
    fun test4dfs() {
        val tree = TreeBuilder.build(0, 2, 4, 1, null, 3, -1, 5, 1, 6, null, 8)
        val expected = arrayListOf(arrayListOf(0), arrayListOf(4, 2), arrayListOf(1, 3, -1), arrayListOf(8, 6, 1, 5))

        assertEquals(expected, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrderDfs(tree))
    }
}