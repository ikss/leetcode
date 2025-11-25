package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestBSTSubtreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(10, 5, 15, 1, 8, null, 7)
        val expected = 3

        assertEquals(expected, LargestBSTSubtree.largestBSTSubtree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(4, 2, 7, 2, 3, 5, null, 2, null, null, null, null, null, 1)
        val expected = 2

        assertEquals(expected, LargestBSTSubtree.largestBSTSubtree(root))
    }
}