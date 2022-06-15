package data_structures.linked_lists.medium

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    @Test
    fun `carry over two digits`() {
        val l1 = ListBuilder.build(9, 9)
        val l2 = ListNode(1)
        val expected = ListBuilder.build(0, 0, 1)
        val actual = AddTwoNumbers.addTwoNumbers(l1, l2)

        assertEquals(actual, expected)
    }

    @Test
    fun `digit overflow`() {
        val l1 = ListNode(5)
        val l2 = ListNode(5)
        val expected = ListBuilder.build(0, 1)
        val actual = AddTwoNumbers.addTwoNumbers(l1, l2)

        assertEquals(expected, actual)
    }

    @Test
    fun `description example`() {
        val l1 = ListBuilder.build(2, 4, 3)
        val l2 = ListBuilder.build(5, 6, 4)
        val expected = ListBuilder.build(7, 0, 8)
        val actual = AddTwoNumbers.addTwoNumbers(l1, l2)

        assertEquals(expected, actual)
    }
}
