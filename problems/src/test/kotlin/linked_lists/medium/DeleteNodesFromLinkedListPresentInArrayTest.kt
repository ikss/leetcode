package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteNodesFromLinkedListPresentInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val head = ListBuilder.build(1, 2, 3, 4, 5)
        val expected = ListBuilder.build(4, 5)

        assertEquals(expected, DeleteNodesFromLinkedListPresentInArray.modifiedList(nums, head))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1)
        val head = ListBuilder.build(1, 2, 1, 2, 1, 2)
        val expected = ListBuilder.build(2, 2, 2)

        assertEquals(expected, DeleteNodesFromLinkedListPresentInArray.modifiedList(nums, head))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5)
        val head = ListBuilder.build(1, 2, 3, 4)
        val expected = ListBuilder.build(1, 2, 3, 4)

        assertEquals(expected, DeleteNodesFromLinkedListPresentInArray.modifiedList(nums, head))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(5)
        val head = ListBuilder.build(5)
        val expected = null

        assertEquals(expected, DeleteNodesFromLinkedListPresentInArray.modifiedList(nums, head))
    }
}