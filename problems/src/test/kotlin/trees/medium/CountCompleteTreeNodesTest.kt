package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountCompleteTreeNodesTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6)
        val expected = 6

        assertEquals(expected, CountCompleteTreeNodes.countNodes(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build()
        val expected = 0

        assertEquals(expected, CountCompleteTreeNodes.countNodes(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1)
        val expected = 1

        assertEquals(expected, CountCompleteTreeNodes.countNodes(root))
    }
}