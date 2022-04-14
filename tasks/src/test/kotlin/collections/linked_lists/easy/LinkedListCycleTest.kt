package collections.linked_lists.easy

import data_structures.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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
        val list = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
        assertFalse(LinkedListCycle.hasCycle(list))
    }
}
