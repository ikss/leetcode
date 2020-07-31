package collections.linked_lists.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddTwoNumbersTest {

    @Test
    fun `carry over two digits`() {
        val l1 = ListNode(9).apply { next = ListNode(9) }
        val l2 = ListNode(1)
        val expected = ListNode(0).apply { next = ListNode(0).apply { next = ListNode(1) } }
        val actual = AddTwoNumbers().addTwoNumbers(l1, l2)
        assertEquals(actual, expected)
    }

    @Test
    fun `digit overflow`() {
        val l1 = ListNode(5)
        val l2 = ListNode(5)
        val expected = ListNode(0).apply { next = ListNode(1) }
        val actual = AddTwoNumbers().addTwoNumbers(l1, l2)
        assertEquals(actual, expected)
    }

    @Test
    fun `description example`() {
        val l1 = ListNode(2).apply { next = ListNode(4).apply { next = ListNode(3) }}
        val l2 = ListNode(5).apply { next = ListNode(6).apply { next = ListNode(4) }}
        val expected = ListNode(7).apply { next = ListNode(0).apply { next = ListNode(8) } }
        val actual = AddTwoNumbers().addTwoNumbers(l1, l2)
        assertEquals(actual, expected)
    }
}