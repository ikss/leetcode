package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNodesEqualToSumOfDescendantsTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(10, 3, 4, 2, 1)
        val expected = 2

        assertEquals(expected, CountNodesEqualToSumOfDescendants.equalToDescendants(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, 3, null, 2, null)
        val expected = 0

        assertEquals(expected, CountNodesEqualToSumOfDescendants.equalToDescendants(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(0)
        val expected = 1

        assertEquals(expected, CountNodesEqualToSumOfDescendants.equalToDescendants(root))
    }
}