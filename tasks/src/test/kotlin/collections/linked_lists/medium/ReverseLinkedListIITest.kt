package collections.linked_lists.medium

import collections.linked_lists.util.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseLinkedListIITest {
    private val initial = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    private val excepted = ListNode(1, ListNode(4, ListNode(3, ListNode(2, ListNode(5)))))

    @Test
    fun testReverseRecursive() {
        val start = 2
        val end = 4
        assertEquals(excepted, ReverseLinkedListII.reverseBetweenRecursive(initial, start, end))
    }

    @Test
    fun testReverseLoop() {
        val start = 1
        val end = 2
        assertEquals(ListNode(2, ListNode(1)), ReverseLinkedListII.reverseBetweenLoop(ListNode(1, ListNode(2)), start, end))
    }
}
