package trees.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidateBinaryTreeNodesTest {
    @Test
    fun test1() {
        val n = 4
        val leftChild = intArrayOf(1, -1, 3, -1)
        val rightChild = intArrayOf(2, -1, -1, -1)
        val expected = true

        assertEquals(expected, ValidateBinaryTreeNodes.validateBinaryTreeNodes(n, leftChild, rightChild))
    }

    @Test
    fun test2() {
        val n = 4
        val leftChild = intArrayOf(1, -1, 3, -1)
        val rightChild = intArrayOf(2, 3, -1, -1)
        val expected = false

        assertEquals(expected, ValidateBinaryTreeNodes.validateBinaryTreeNodes(n, leftChild, rightChild))
    }

    @Test
    fun test3() {
        val n = 2
        val leftChild = intArrayOf(1, 0)
        val rightChild = intArrayOf(-1, -1)
        val expected = false

        assertEquals(expected, ValidateBinaryTreeNodes.validateBinaryTreeNodes(n, leftChild, rightChild))
    }
}