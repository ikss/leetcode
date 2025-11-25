package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathSumTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1)
        val targetSum = 22
        val expected = true

        assertEquals(expected, PathSum.hasPathSum(root, targetSum))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3)
        val targetSum = 5
        val expected = false

        assertEquals(expected, PathSum.hasPathSum(root, targetSum))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build()
        val targetSum = 0
        val expected = false

        assertEquals(expected, PathSum.hasPathSum(root, targetSum))
    }
}