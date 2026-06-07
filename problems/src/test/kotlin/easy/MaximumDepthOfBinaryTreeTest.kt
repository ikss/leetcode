package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDepthOfBinaryTreeTest {

    @Test
    fun test1recursion() {
        val root = TreeBuilder.build(4, 2, 3, 1)
        val expected = 3

        assertEquals(expected, MaximumDepthOfBinaryTree.maxDepthRecursion(root))
    }

    @Test
    fun test2recursion() {
        val root = TreeBuilder.build(1)
        val expected = 1

        assertEquals(expected, MaximumDepthOfBinaryTree.maxDepthRecursion(root))
    }

    @Test
    fun test1queue() {
        val root = TreeBuilder.build(4, 2, 3, 1)
        val expected = 3

        assertEquals(expected, MaximumDepthOfBinaryTree.maxDepthQueue(root))
    }

    @Test
    fun test2queue() {
        val root = TreeBuilder.build(1)
        val expected = 1

        assertEquals(expected, MaximumDepthOfBinaryTree.maxDepthQueue(root))
    }
}
