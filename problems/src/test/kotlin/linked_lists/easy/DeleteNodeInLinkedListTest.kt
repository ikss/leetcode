package linked_lists.easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteNodeInLinkedListTest {

    @Test
    fun test1() {
        val initial = ListBuilder.build(1, 2, 3, 4)
        val expected = ListBuilder.build(1, 2, 4)
        val toDelete = initial.next!!.next
        DeleteNodeInLinkedList.deleteNode(toDelete)

        assertEquals(expected, initial)
    }

}
