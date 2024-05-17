package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteLeavesWithGivenValueTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, 2, null, 2, 4)
        val target = 2
        val expected = TreeBuilder.build(1, null, 3, null, 4)

        assertEquals(expected, DeleteLeavesWithGivenValue.removeLeafNodes(root, target))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 3, 3, 3, 2)
        val target = 3
        val expected = TreeBuilder.build(1, 3, null, null, 2)

        assertEquals(expected, DeleteLeavesWithGivenValue.removeLeafNodes(root, target))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2, null, 2, null, 2)
        val target = 2
        val expected = TreeBuilder.build(1)

        assertEquals(expected, DeleteLeavesWithGivenValue.removeLeafNodes(root, target))
    }
}