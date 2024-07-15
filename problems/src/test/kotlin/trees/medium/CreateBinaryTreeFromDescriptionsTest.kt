package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CreateBinaryTreeFromDescriptionsTest {
    @Test
    fun test1() {
        val descriptions = arrayOf(
            intArrayOf(20, 15, 1),
            intArrayOf(20, 17, 0),
            intArrayOf(50, 20, 1),
            intArrayOf(50, 80, 0),
            intArrayOf(80, 19, 1),
        )
        val expected = TreeBuilder.build(50, 20, 80, 15, 17, 19)

        assertEquals(expected, CreateBinaryTreeFromDescriptions.createBinaryTree(descriptions))
    }

    @Test
    fun test2() {
        val descriptions = arrayOf(
            intArrayOf(1, 2, 1),
            intArrayOf(2, 3, 0),
            intArrayOf(3, 4, 1),
        )
        val expected = TreeBuilder.build(1, 2, null, null, 3, 4)

        assertEquals(expected, CreateBinaryTreeFromDescriptions.createBinaryTree(descriptions))
    }
}