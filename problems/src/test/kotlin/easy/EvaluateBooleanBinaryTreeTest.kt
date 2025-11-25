package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvaluateBooleanBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(2, 1, 3, null, null, 0, 1)!!
        val expected = true

        assertEquals(expected, EvaluateBooleanBinaryTree.evaluateTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(0)!!
        val expected = false

        assertEquals(expected, EvaluateBooleanBinaryTree.evaluateTree(root))
    }
}