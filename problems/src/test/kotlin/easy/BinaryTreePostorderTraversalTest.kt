package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreePostorderTraversalTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, null, 2, null, 3)
        val expected = listOf(3, 2, 1)

        assertEquals(expected, BinaryTreePostorderTraversal.postorderTraversal(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build()
        val expected = emptyList<Int>()

        assertEquals(expected, BinaryTreePostorderTraversal.postorderTraversal(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1)
        val expected = listOf(1)

        assertEquals(expected, BinaryTreePostorderTraversal.postorderTraversal(root))
    }
}