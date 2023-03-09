package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LinkedListCycleIITest {

    @Test
    fun test1() {
        val head = ListBuilder.buildCycled(3, 2, 0, -4)
        head.last().next = head.next

        val expected = head.next

        assertEquals(expected, LinkedListCycleII.detectCycleNaive(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.buildCycled(1, 2)
        head.last().next = head
        val expected = head

        assertEquals(expected, LinkedListCycleII.detectCycleNaive(head))
    }

    @Test
    fun test3() {
        val head = ListBuilder.buildCycled(1)
        val expected = null

        assertEquals(expected, LinkedListCycleII.detectCycleNaive(head))
    }
}