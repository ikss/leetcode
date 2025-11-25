package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructStringFromBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4)
        val expected = "1(2(4))(3)"

        assertEquals(expected, ConstructStringFromBinaryTree.tree2str(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3, null, 4)
        val expected = "1(2()(4))(3)"

        assertEquals(expected, ConstructStringFromBinaryTree.tree2str(root))
    }

    @Test
    fun test3() {
        val root = null
        val expected = ""

        assertEquals(expected, ConstructStringFromBinaryTree.tree2str(root))
    }
}
