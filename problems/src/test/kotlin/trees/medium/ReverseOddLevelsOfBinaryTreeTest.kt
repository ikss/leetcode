package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseOddLevelsOfBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(2, 3, 5, 8, 13, 21, 34)
        val expected = TreeBuilder.build(2, 5, 3, 8, 13, 21, 34)

        assertEquals(expected, ReverseOddLevelsOfBinaryTree.reverseOddLevels(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(7, 13, 11)
        val expected = TreeBuilder.build(7, 11, 13)

        assertEquals(expected, ReverseOddLevelsOfBinaryTree.reverseOddLevels(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2)
        val expected = TreeBuilder.build(0, 2, 1, 0, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 1)

        assertEquals(expected, ReverseOddLevelsOfBinaryTree.reverseOddLevels(root))
    }
}