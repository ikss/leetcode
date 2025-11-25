package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VerifyPreorderSequenceInBinarySearchTreeTest {
    @Test
    fun test1() {
        val preorder = intArrayOf(5, 2, 1, 3, 6)
        val expected = true

        assertEquals(expected, VerifyPreorderSequenceInBinarySearchTree.verifyPreorder(preorder))
    }

    @Test
    fun test2() {
        val preorder = intArrayOf(5, 2, 6, 1, 3)
        val expected = false

        assertEquals(expected, VerifyPreorderSequenceInBinarySearchTree.verifyPreorder(preorder))
    }
}