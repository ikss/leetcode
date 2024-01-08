package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RangeSumOfBSTTest {

    @Test
    fun test1stack() {
        val root = TreeBuilder.build(10, 5, 15, 3, 7, null, 18)
        val low = 7
        val high = 15
        val expected = 32

        assertEquals(expected, RangeSumOfBST.rangeSumBSTStack(root, low, high))
    }

    @Test
    fun test2stack() {
        val root = TreeBuilder.build(10, 5, 15, 3, 7, 13, 18, 1, null, 6)
        val low = 6
        val high = 10
        val expected = 23

        assertEquals(expected, RangeSumOfBST.rangeSumBSTStack(root, low, high))
    }

    @Test
    fun test1recursive() {
        val root = TreeBuilder.build(10, 5, 15, 3, 7, null, 18)
        val low = 7
        val high = 15
        val expected = 32

        assertEquals(expected, RangeSumOfBST.rangeSumBSTRecursive(root, low, high))
    }

    @Test
    fun test2recursive() {
        val root = TreeBuilder.build(10, 5, 15, 3, 7, 13, 18, 1, null, 6)
        val low = 6
        val high = 10
        val expected = 23

        assertEquals(expected, RangeSumOfBST.rangeSumBSTRecursive(root, low, high))
    }
}