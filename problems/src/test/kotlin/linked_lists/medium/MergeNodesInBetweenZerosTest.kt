package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeNodesInBetweenZerosTest {

    @Test
    fun test1() {
        val head = ListBuilder.build(0, 3, 1, 0, 4, 5, 2, 0)
        val expected = ListBuilder.build(4, 11)

        assertEquals(expected, MergeNodesInBetweenZeros.mergeNodes(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(0, 1, 0, 3, 0, 2, 2, 0)
        val expected = ListBuilder.build(1, 3, 4)

        assertEquals(expected, MergeNodesInBetweenZeros.mergeNodes(head))
    }
}