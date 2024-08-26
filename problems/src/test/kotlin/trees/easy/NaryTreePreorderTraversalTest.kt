package trees.easy

import data_structures.NaryTreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NaryTreePreorderTraversalTest {
    @Test
    fun test1() {
        val root = NaryTreeBuilder.build(1, null, 3, 2, 4, null, 5, 6)
        val expected = listOf(1, 3, 5, 6, 2, 4)

        assertEquals(expected, NaryTreePreorderTraversal.preorder(root))
    }
    
    @Test
    fun test2() {
        val root = NaryTreeBuilder.build(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14)
        val expected = listOf(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10)

        assertEquals(expected, NaryTreePreorderTraversal.preorder(root))
    }
}