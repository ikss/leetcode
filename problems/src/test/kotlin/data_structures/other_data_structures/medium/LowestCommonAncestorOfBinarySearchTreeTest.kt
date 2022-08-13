package data_structures.other_data_structures.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LowestCommonAncestorOfBinarySearchTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5)
        val p = TreeBuilder.build(2, 0, 4, null, null, 3, 5)
        val q = TreeBuilder.build(8, 7, 9)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinarySearchTree.lowestCommonAncestor(root, p, q))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5)
        val p = TreeBuilder.build(2, 0, 4, null, null, 3, 5)
        val q = TreeBuilder.build(4, 3, 5)
        val expected = p

        assertEquals(expected, LowestCommonAncestorOfBinarySearchTree.lowestCommonAncestor(root, p, q))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(2,1)
        val p = TreeBuilder.build(2)
        val q = TreeBuilder.build(1)
        val expected = root

        assertEquals(expected, LowestCommonAncestorOfBinarySearchTree.lowestCommonAncestor(root, p, q))
    }
}
