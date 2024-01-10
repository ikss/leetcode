package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindModeInBinarySearchTreeTest {
    @Test
    fun test1Morris() {
        val root = TreeBuilder.build(1, null, 2, 2)
        val expected = intArrayOf(2)

        assertArrayEquals(expected, FindModeInBinarySearchTree.findModeMorrisInorder(root))
    }

    @Test
    fun test2Morris() {
        val root = TreeBuilder.build(0)
        val expected = intArrayOf(0)

        assertArrayEquals(expected, FindModeInBinarySearchTree.findModeMorrisInorder(root))
    }

    @Test
    fun test3Morris() {
        val root = TreeBuilder.build(1, 0, 1, 0, 0, 1, 1, 0)
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, FindModeInBinarySearchTree.findModeMorrisInorder(root))
    }
}