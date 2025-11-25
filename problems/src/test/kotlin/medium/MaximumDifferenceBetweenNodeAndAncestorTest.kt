package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDifferenceBetweenNodeAndAncestorTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13)
        val expected = 7

        assertEquals(expected, MaximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, null, 2, null, 0, 3)
        val expected = 3

        assertEquals(expected, MaximumDifferenceBetweenNodeAndAncestor.maxAncestorDiff(root))
    }
}