package medium

import data_structures.NaryTreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NaryTreeLevelOrderTraversalTest {

    @Test
    fun test1() {
        val root = NaryTreeBuilder.build(1, null, 3, 2, 4, null, 5, 6)
        val expected = listOf(listOf(1), listOf(3, 2, 4), listOf(5, 6))

        assertEquals(expected, NaryTreeLevelOrderTraversal.levelOrder(root))
    }

    @Test
    fun test2() {
        val root = NaryTreeBuilder.build(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14)
        val expected = listOf(listOf(1), listOf(2, 3, 4, 5), listOf(6, 7, 8, 9, 10), listOf(11, 12, 13), listOf(14))

        assertEquals(expected, NaryTreeLevelOrderTraversal.levelOrder(root))
    }
}
