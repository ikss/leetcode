package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindDistanceInBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = 5
        val q = 0
        val expected = 3

        assertEquals(expected, FindDistanceInBinaryTree.findDistance(root, p, q))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = 5
        val q = 7
        val expected = 2

        assertEquals(expected, FindDistanceInBinaryTree.findDistance(root, p, q))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val p = 5
        val q = 5
        val expected = 0

        assertEquals(expected, FindDistanceInBinaryTree.findDistance(root, p, q))
    }
}