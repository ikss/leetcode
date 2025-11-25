package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAverageSubtreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 6, 1)
        val expected = 6.0

        assertEquals(expected, MaximumAverageSubtree.maximumAverageSubtree(root), 0.0001)
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(0, null, 1)
        val expected = 1.0

        assertEquals(expected, MaximumAverageSubtree.maximumAverageSubtree(root), 0.0001)
    }
}