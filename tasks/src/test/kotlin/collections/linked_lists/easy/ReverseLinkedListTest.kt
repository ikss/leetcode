package collections.linked_lists.easy

import collections.linked_lists.util.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseLinkedListTest {
    private val initial = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    private val excepted = ListNode(4, ListNode(3, ListNode(2, ListNode(1))))

    @Test
    fun testReverseLoop() {
        assertEquals(excepted, ReverseLinkedList.reverseLoop(initial))
    }

    @Test
    fun testReverseRecursive() {
        assertEquals(excepted, ReverseLinkedList.reverseRecursive(initial))
    }
}
