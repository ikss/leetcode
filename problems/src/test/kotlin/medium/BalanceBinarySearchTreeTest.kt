package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BalanceBinarySearchTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, null, 2, null, 3, null, 4, null, null)
        val expected = TreeBuilder.build(2, 1, 3, null, null, null, 4)

        assertEquals(expected, BalanceBinarySearchTree.balanceBST(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, 1, 3)
        val expected = TreeBuilder.build(2, 1, 3)

        assertEquals(expected, BalanceBinarySearchTree.balanceBST(root))
    }
}