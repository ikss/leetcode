package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InorderTraversalTest {
    @Test
    fun test1recursive() {
        val tree = TreeBuilder.build(1, null, 2, 3)
        val expected = listOf(1, 3, 2)

        assertEquals(expected, InorderTraversal.inorderTraversalRecursive(tree))
    }

    @Test
    fun test2recursive() {
        val tree = TreeBuilder.build()
        val expected = listOf<Int>()

        assertEquals(expected, InorderTraversal.inorderTraversalRecursive(tree))
    }

    @Test
    fun test3recursive() {
        val tree = TreeBuilder.build(1)
        val expected = listOf(1)

        assertEquals(expected, InorderTraversal.inorderTraversalRecursive(tree))
    }

    @Test
    fun test1stack() {
        val tree = TreeBuilder.build(1, null, 2, 3)
        val expected = listOf(1, 3, 2)

        assertEquals(expected, InorderTraversal.inorderTraversalStack(tree))
    }

    @Test
    fun test2stack() {
        val tree = TreeBuilder.build()
        val expected = listOf<Int>()

        assertEquals(expected, InorderTraversal.inorderTraversalStack(tree))
    }

    @Test
    fun test3stack() {
        val tree = TreeBuilder.build(1)
        val expected = listOf(1)

        assertEquals(expected, InorderTraversal.inorderTraversalStack(tree))
    }
}