package collections.linked_lists.easy

import data_structures.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DeleteNodeInLinkedListTest {

    @Test
    fun test1() {
        val initial = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
        val expected = ListNode(1, ListNode(2, ListNode(4)))
        val toDelete = initial.next!!.next
        DeleteNodeInLinkedList.deleteNode(toDelete)
        assertEquals(expected, initial)
    }

}
