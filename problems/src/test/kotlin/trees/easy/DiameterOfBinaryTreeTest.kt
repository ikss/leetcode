package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DiameterOfBinaryTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5)
        val expected = 3

        assertEquals(expected, DiameterOfBinaryTree.diameterOfBinaryTree(root))
    }
    
    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2)
        val expected = 1

        assertEquals(expected, DiameterOfBinaryTree.diameterOfBinaryTree(root))
    }
}