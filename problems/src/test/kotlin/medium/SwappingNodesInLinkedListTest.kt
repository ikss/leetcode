package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SwappingNodesInLinkedListTest {

    @Test
    fun test1() {
        val head = ListBuilder.build(1, 2, 3, 4, 5)
        val k = 2
        val expected = ListBuilder.build(1, 4, 3, 2, 5)

        assertEquals(expected, SwappingNodesInLinkedList.swapNodes(head, k))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(7, 9, 6, 6, 7, 8, 3, 0, 9, 5)
        val k = 5
        val expected = ListBuilder.build(7, 9, 6, 6, 8, 7, 3, 0, 9, 5)

        assertEquals(expected, SwappingNodesInLinkedList.swapNodes(head, k))
    }
}