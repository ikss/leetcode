package medium

import data_structures.ListBuilder
import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LinkedListInBinaryTreeTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(4, 2, 8)
        val root = TreeBuilder.build(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3)
        val expected = true

        assertEquals(expected, LinkedListInBinaryTree.isSubPath(head, root))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 4, 2, 6)
        val root = TreeBuilder.build(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3)
        val expected = true

        assertEquals(expected, LinkedListInBinaryTree.isSubPath(head, root))
    }

    @Test
    fun test3() {
        val head = ListBuilder.build(1, 4, 2, 6, 8)
        val root = TreeBuilder.build(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3)
        val expected = false

        assertEquals(expected, LinkedListInBinaryTree.isSubPath(head, root))
    }
}