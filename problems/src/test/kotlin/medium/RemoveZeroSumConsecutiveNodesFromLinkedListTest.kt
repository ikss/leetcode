package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveZeroSumConsecutiveNodesFromLinkedListTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(1, 2, -3, 3, 1)
        val expected = ListBuilder.build(3, 1)

        assertEquals(expected, RemoveZeroSumConsecutiveNodesFromLinkedList.removeZeroSumSublists(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 2, 3, -3, 4)
        val expected = ListBuilder.build(1, 2, 4)

        assertEquals(expected, RemoveZeroSumConsecutiveNodesFromLinkedList.removeZeroSumSublists(head))
    }

    @Test
    fun test3() {
        val head = ListBuilder.build(1, 2, 3, -3, -2)
        val expected = ListBuilder.build(1)

        assertEquals(expected, RemoveZeroSumConsecutiveNodesFromLinkedList.removeZeroSumSublists(head))
    }
}