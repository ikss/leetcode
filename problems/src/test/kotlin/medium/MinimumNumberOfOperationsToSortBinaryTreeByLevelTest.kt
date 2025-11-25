package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfOperationsToSortBinaryTreeByLevelTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 4, 3, 7, 6, 8, 5, null, null, null, null, 9, null, 10)
        val expected = 3

        assertEquals(expected, MinimumNumberOfOperationsToSortBinaryTreeByLevel.minimumOperations(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 3, 2, 7, 6, 5, 4)
        val expected = 3

        assertEquals(expected, MinimumNumberOfOperationsToSortBinaryTreeByLevel.minimumOperations(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6)
        val expected = 0

        assertEquals(expected, MinimumNumberOfOperationsToSortBinaryTreeByLevel.minimumOperations(root))
    }
}