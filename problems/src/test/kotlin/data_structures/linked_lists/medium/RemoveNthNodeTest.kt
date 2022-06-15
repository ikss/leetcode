package data_structures.linked_lists.medium

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveNthNodeTest {

    @Test
    fun `test 1 recursive`() {
        val before = ListBuilder.build(listOf(1, 2, 3, 4, 5))
        val expected = ListBuilder.build(listOf(1, 2, 3, 5))
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 2)

        assertEquals(actual, expected)
    }

    @Test
    fun `test 2 recursive`() {
        val before = ListNode(1)
        val expected = null
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun `test 3 recursive`() {
        val before = null
        val expected = null
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun `test 1 cycle`() {
        val before = ListBuilder.build(listOf(1, 2, 3, 4, 5))
        val expected = ListBuilder.build(listOf(1, 2, 3, 5))
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 2)

        assertEquals(actual, expected)
    }

    @Test
    fun `test 2 cycle`() {
        val before = ListNode(1)
        val expected = null
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 1)

        assertEquals(expected, actual)
    }

    @Test
    fun `test 3 cycle`() {
        val before = null
        val expected = null
        val actual = RemoveNthNode.removeNthFromEndRecursive(before, 1)

        assertEquals(expected, actual)
    }
}
