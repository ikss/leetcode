package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeInBetweenLinkedListsTest {
    @Test
    fun test1() {
        val list1 = ListBuilder.build(10, 1, 13, 6, 9, 5)
        val a = 3
        val b = 4
        val list2 = ListBuilder.build(1000000, 1000001, 1000002)
        val expected = ListBuilder.build(10, 1, 13, 1000000, 1000001, 1000002, 5)

        assertEquals(expected, MergeInBetweenLinkedLists.mergeInBetween(list1, a, b, list2))
    }

    @Test
    fun test2() {
        val list1 = ListBuilder.build(0, 1, 2, 3, 4, 5, 6)
        val a = 2
        val b = 5
        val list2 = ListBuilder.build(1000000, 1000001, 1000002, 1000003, 1000004)
        val expected = ListBuilder.build(0, 1, 1000000, 1000001, 1000002, 1000003, 1000004, 6)

        assertEquals(expected, MergeInBetweenLinkedLists.mergeInBetween(list1, a, b, list2))
    }
}