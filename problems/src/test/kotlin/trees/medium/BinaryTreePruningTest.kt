package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreePruningTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, null, 0, null, null, 0, 1)
        val expected = TreeBuilder.build(1, null, 0, null, null, null, 1)

        assertEquals(expected, BinaryTreePruning.pruneTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 0, 1, 0, 0, 0, 1)
        val expected = TreeBuilder.build(1, null, 1, null, null, null, 1)

        assertEquals(expected, BinaryTreePruning.pruneTree(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 1, 0, 1, 1, 0, 1, 0)
        val expected = TreeBuilder.build(1, 1, 0, 1, 1, null, 1)

        assertEquals(expected, BinaryTreePruning.pruneTree(root))
    }
}
