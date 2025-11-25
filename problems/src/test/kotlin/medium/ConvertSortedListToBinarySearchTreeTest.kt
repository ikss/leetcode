package medium

import data_structures.ListBuilder
import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConvertSortedListToBinarySearchTreeTest {

    @Test
    fun test1() {
        val head = ListBuilder.build(-10, -3, 0, 5, 9)
        val expected = TreeBuilder.build(0, -3, 9, -10, null, 5, null)

        assertEquals(expected, ConvertSortedListToBinarySearchTree.sortedListToBST(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build()
        val expected = TreeBuilder.build()

        assertEquals(expected, ConvertSortedListToBinarySearchTree.sortedListToBST(head))
    }
}