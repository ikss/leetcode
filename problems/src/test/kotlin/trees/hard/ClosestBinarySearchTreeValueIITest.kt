package trees.hard

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClosestBinarySearchTreeValueIITest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 2, 5, 1, 3)
        val target = 3.714286
        val k = 2
        val expected = listOf(3, 4)

        assertEquals(expected, ClosestBinarySearchTreeValueII.closestKValues(root, target, k))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val target = 0.000000
        val k = 1
        val expected = listOf(1)

        assertEquals(expected, ClosestBinarySearchTreeValueII.closestKValues(root, target, k))
    }
}