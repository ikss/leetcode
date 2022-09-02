package data_structures.other_data_structures.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class AverageOfLevelsInBinaryTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = doubleArrayOf(3.00000, 14.50000, 11.00000)

        assertTrue(expected.contentEquals(AverageOfLevelsInBinaryTree.averageOfLevels(root)))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(3, 9, 20, 15, 7)
        val expected = doubleArrayOf(3.00000, 14.50000, 11.00000)

        assertTrue(expected.contentEquals(AverageOfLevelsInBinaryTree.averageOfLevels(root)))
    }
}
