package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CousinsInBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4)
        val x = 4
        val y = 3
        val expected = false

        assertEquals(expected, CousinsInBinaryTree.isCousins(root, x, y))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3, null, 4, null, 5)
        val x = 5
        val y = 4
        val expected = true

        assertEquals(expected, CousinsInBinaryTree.isCousins(root, x, y))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2, 3, null, 4)
        val x = 2
        val y = 3
        val expected = false

        assertEquals(expected, CousinsInBinaryTree.isCousins(root, x, y))
    }
}