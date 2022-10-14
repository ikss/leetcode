package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteMiddleNodeOfLinkedListTest {

    @Test
    fun test1() {
        val head = ListBuilder.build(1, 3, 4, 7, 1, 2, 6)
        val expected = ListBuilder.build(1, 3, 4, 1, 2, 6)

        assertEquals(expected, DeleteMiddleNodeOfLinkedList.deleteMiddle(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 2, 3, 4)
        val expected = ListBuilder.build(1, 2, 4)

        assertEquals(expected, DeleteMiddleNodeOfLinkedList.deleteMiddle(head))
    }

    @Test
    fun test3() {
        val head = ListBuilder.build(2, 1)
        val expected = ListBuilder.build(2)

        assertEquals(expected, DeleteMiddleNodeOfLinkedList.deleteMiddle(head))
    }
}