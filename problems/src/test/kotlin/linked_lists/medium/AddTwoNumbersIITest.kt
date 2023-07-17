package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddTwoNumbersIITest {

    @Test
    fun test1() {
        val l1 = ListBuilder.build(7, 2, 4, 3)
        val l2 = ListBuilder.build(5, 6, 4)
        val expected = ListBuilder.build(7, 8, 0, 7)

        assertEquals(expected, AddTwoNumbersII.addTwoNumbers(l1, l2))
    }

    @Test
    fun test2() {
        val l1 = ListBuilder.build(2, 4, 3)
        val l2 = ListBuilder.build(5, 6, 4)
        val expected = ListBuilder.build(8, 0, 7)

        assertEquals(expected, AddTwoNumbersII.addTwoNumbers(l1, l2))
    }

    @Test
    fun test3() {
        val l1 = ListBuilder.build(0)
        val l2 = ListBuilder.build(0)
        val expected = ListBuilder.build(0)

        assertEquals(expected, AddTwoNumbersII.addTwoNumbers(l1, l2))
    }
}