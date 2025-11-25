package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InvertBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 2, 7, 1, 3, 6, 9)
        val expected = TreeBuilder.build(4, 7, 2, 9, 6, 3, 1)

        assertEquals(expected, InvertBinaryTree.invertTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, 1, 3)
        val expected = TreeBuilder.build(2, 3, 1)

        assertEquals(expected, InvertBinaryTree.invertTree(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build()
        val expected = TreeBuilder.build()

        assertEquals(expected, InvertBinaryTree.invertTree(root))
    }
}