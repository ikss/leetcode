package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreePathsTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, null, 5)
        val expected = listOf("1->2->5", "1->3")

        assertEquals(expected, BinaryTreePaths.binaryTreePaths(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val expected = listOf("1")

        assertEquals(expected, BinaryTreePaths.binaryTreePaths(root))
    }
}