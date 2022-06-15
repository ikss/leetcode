package data_structures.linked_lists.easy

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LinkedListCycleTest {

    @Test
    fun test1() {
        val node2 = ListNode(2)
        node2.next = ListNode(3, ListNode(4, node2))
        val list = ListNode(1, node2)

        assertTrue(LinkedListCycle.hasCycle(list))
    }

    @Test
    fun test2() {
        val list = ListBuilder.build(1, 2, 3, 4)

        assertFalse(LinkedListCycle.hasCycle(list))
    }
}
