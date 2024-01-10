package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathSumIITest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1)
        val targetSum = 22
        val expected = listOf(listOf(5, 4, 11, 2), listOf(5, 8, 4, 5))

        assertEquals(expected, PathSumII.pathSum(root, targetSum))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3)
        val targetSum = 5
        val expected = emptyList<List<Int>>()

        assertEquals(expected, PathSumII.pathSum(root, targetSum))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2)
        val targetSum = 0
        val expected = emptyList<List<Int>>()

        assertEquals(expected, PathSumII.pathSum(root, targetSum))
    }
}