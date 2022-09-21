package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PseudoPalindromicPathsInBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(2, 3, 1, 3, 1, null, 1)
        val expected = 2

        assertEquals(expected, PseudoPalindromicPathsInBinaryTree.pseudoPalindromicPaths(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, 1, 1, 1, 3, null, null, null, null, null, 1)
        val expected = 1

        assertEquals(expected, PseudoPalindromicPathsInBinaryTree.pseudoPalindromicPaths(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(9)
        val expected = 1

        assertEquals(expected, PseudoPalindromicPathsInBinaryTree.pseudoPalindromicPaths(root))
    }
}