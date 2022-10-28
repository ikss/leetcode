package linked_lists.hard

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeKSortedListsTest {
    @Test
    fun test1() {
        val initial = arrayOf(
            ListBuilder.build(1, 4, 5),
            ListBuilder.build(1, 3, 4),
            ListBuilder.build(2, 6)
        )
        val expected = ListBuilder.build(1, 1, 2, 3, 4, 4, 5, 6)

        assertEquals(expected, MergeKSortedLists.mergeKLists(initial))
    }

    @Test
    fun test2() {
        val initial = emptyArray<ListNode?>()
        val expected: ListNode? = null

        assertEquals(expected, MergeKSortedLists.mergeKLists(initial))
    }

    @Test
    fun test3() {
        val initial = arrayOf<ListNode?>(null)
        val expected: ListNode? = null

        assertEquals(expected, MergeKSortedLists.mergeKLists(initial))
    }
}
