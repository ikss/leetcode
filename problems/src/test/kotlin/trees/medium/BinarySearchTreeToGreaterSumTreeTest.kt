package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTreeToGreaterSumTreeTest {
    @Test
    fun test1() {
        val tree = TreeBuilder.build(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8)
        val expected = TreeBuilder.build(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8)

        assertEquals(expected, BinarySearchTreeToGreaterSumTree.bstToGst(tree))
    }

    @Test
    fun test2() {
        val tree = TreeBuilder.build(0, null, 1)
        val expected = TreeBuilder.build(1, null, 1)

        assertEquals(expected, BinarySearchTreeToGreaterSumTree.bstToGst(tree))
    }

}