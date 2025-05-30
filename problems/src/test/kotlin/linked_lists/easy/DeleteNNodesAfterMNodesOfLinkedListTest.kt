package linked_lists.easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteNNodesAfterMNodesOfLinkedListTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
        val m = 2
        val n = 3
        val expected = ListBuilder.build(1, 2, 6, 7, 11, 12)


        assertEquals(expected, DeleteNNodesAfterMNodesOfLinkedList.deleteNodes(head, m, n))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
        val m = 1
        val n = 3
        val expected = ListBuilder.build(1, 5, 9)

        assertEquals(expected, DeleteNNodesAfterMNodesOfLinkedList.deleteNodes(head, m, n))
    }
}