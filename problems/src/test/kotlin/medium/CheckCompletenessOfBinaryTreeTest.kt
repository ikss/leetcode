package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckCompletenessOfBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6)
        val expected = true

        assertEquals(expected, CheckCompletenessOfBinaryTree.isCompleteTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, null, 7)
        val expected = false

        assertEquals(expected, CheckCompletenessOfBinaryTree.isCompleteTree(root))
    }
}