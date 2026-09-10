package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNodesEqualToAverageOfSubtreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 8, 5, 0, 1, null, 6)
        val expected = 5

        assertEquals(expected, CountNodesEqualToAverageOfSubtree.averageOfSubtree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val expected = 1

        assertEquals(expected, CountNodesEqualToAverageOfSubtree.averageOfSubtree(root))
    }
}