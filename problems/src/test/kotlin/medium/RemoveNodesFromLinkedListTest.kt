package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveNodesFromLinkedListTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(5, 2, 13, 3, 8)
        val expected = ListBuilder.build(13, 8)

        assertEquals(expected, RemoveNodesFromLinkedList.removeNodes(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 1, 1, 1, 1)
        val expected = ListBuilder.build(1, 1, 1, 1, 1)

        assertEquals(expected, RemoveNodesFromLinkedList.removeNodes(head))
    }
}