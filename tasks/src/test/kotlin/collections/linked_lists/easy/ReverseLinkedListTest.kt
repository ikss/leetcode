package collections.linked_lists.easy

import data_structures.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseLinkedListTest {
    private val initial = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    private val expected = ListNode(4, ListNode(3, ListNode(2, ListNode(1))))

    @Test
    fun testReverseLoop() {
        assertEquals(expected, ReverseLinkedList.reverseLoop(initial))
    }

    @Test
    fun testReverseRecursive() {
        assertEquals(expected, ReverseLinkedList.reverseRecursive(initial))
    }
}
