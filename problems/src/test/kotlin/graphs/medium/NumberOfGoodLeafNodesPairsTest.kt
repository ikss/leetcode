package graphs.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfGoodLeafNodesPairsTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, null, 4)
        val distance = 3
        val expected = 1

        assertEquals(expected, NumberOfGoodLeafNodesPairs.countPairs(root, distance))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3, 4, 5, 6, 7)
        val distance = 3
        val expected = 2

        assertEquals(expected, NumberOfGoodLeafNodesPairs.countPairs(root, distance))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(7, 1, 4, 6, null, 5, 3, 2, null, null, null, null, null, null, 8)
        val distance = 3
        val expected = 1

        assertEquals(expected, NumberOfGoodLeafNodesPairs.countPairs(root, distance))
    }
}