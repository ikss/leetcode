package data_structures.linked_lists.medium

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveNthNodeTest {

    @Test
    fun test1recursive() {
        val before = ListBuilder.build(listOf(1, 2, 3, 4, 5))
        val expected = ListBuilder.build(listOf(1, 2, 3, 5))
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 2)

        assertEquals(actual, expected)
    }

    @Test
    fun test2recursive() {
        val before = ListNode(1)
        val expected: ListNode? = null
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun test3recursive() {
        val before: ListNode? = null
        val expected: ListNode? = null
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun test1cycle() {
        val before = ListBuilder.build(listOf(1, 2, 3, 4, 5))
        val expected = ListBuilder.build(listOf(1, 2, 3, 5))
        val actual = RemoveNthNode.removeNthFromEndCycle(before, 2)

        assertEquals(actual, expected)
    }

    @Test
    fun test2cycle() {
        val before = ListNode(1)
        val expected: ListNode? = null
        val actual = RemoveNthNode.removeNthFromEndCycle(before, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun test3cycle() {
        val before: ListNode? = null
        val expected: ListNode? = null
        val actual = RemoveNthNode.removeNthFromEndCycle(before, 1)

        assertEquals(expected, actual)
    }
}
