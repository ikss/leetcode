package medium

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddTwoNumbersTest {

    @Test
    fun test1() {
        val l1 = ListBuilder.build(9, 9)
        val l2 = ListNode(1)
        val expected = ListBuilder.build(0, 0, 1)

        assertEquals(expected, AddTwoNumbers.addTwoNumbers(l1, l2))
    }

    @Test
    fun test2() {
        val l1 = ListNode(5)
        val l2 = ListNode(5)
        val expected = ListBuilder.build(0, 1)

        assertEquals(expected, AddTwoNumbers.addTwoNumbers(l1, l2))
    }

    @Test
    fun test3() {
        val l1 = ListBuilder.build(2, 4, 3)
        val l2 = ListBuilder.build(5, 6, 4)
        val expected = ListBuilder.build(7, 0, 8)

        assertEquals(expected, AddTwoNumbers.addTwoNumbers(l1, l2))
    }
}
