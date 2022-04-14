package collections.linked_lists.easy

import data_structures.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MergeTwoSortedListsTest {
    private val list1 = ListNode(1, ListNode(2, ListNode(4)))
    private val list2 = ListNode(1, ListNode(3, ListNode(4)))
    private val expected = ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(4))))))

    @Test
    fun testMergeLists1() {
        assertEquals(expected, MergeTwoSortedLists.mergeTwoLists(list1, list2))
    }

    @Test
    fun testMergeLists2() {
        assertEquals(list1, MergeTwoSortedLists.mergeTwoLists(list1, null))
    }

    @Test
    fun testMergeLists3() {
        assertEquals(list2, MergeTwoSortedLists.mergeTwoLists(null, list2))
    }

    @Test
    fun testMergeListsRecursive1() {
        assertEquals(expected, MergeTwoSortedLists.mergeTwoListsRecursive(list1, list2))
    }

    @Test
    fun testMergeListsRecursive2() {
        assertEquals(list1, MergeTwoSortedLists.mergeTwoLists(list1, null))
    }

    @Test
    fun testMergeListsRecursive3() {
        assertEquals(list2, MergeTwoSortedLists.mergeTwoLists(null, list2))
    }
}
