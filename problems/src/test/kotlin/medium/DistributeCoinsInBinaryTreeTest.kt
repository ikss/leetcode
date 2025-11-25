package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistributeCoinsInBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 0, 0)
        val expected = 2

        assertEquals(expected, DistributeCoinsInBinaryTree.distributeCoins(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(0, 3, 0)
        val expected = 3

        assertEquals(expected, DistributeCoinsInBinaryTree.distributeCoins(root))
    }
}