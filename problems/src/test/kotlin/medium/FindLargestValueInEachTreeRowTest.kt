package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindLargestValueInEachTreeRowTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 3, 2, 5, 3, null, 9)
        val expected = listOf(1, 3, 9)

        assertEquals(expected, FindLargestValueInEachTreeRow.largestValues(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3)
        val expected = listOf(1, 3)

        assertEquals(expected, FindLargestValueInEachTreeRow.largestValues(root))
    }
}