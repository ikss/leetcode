package collections.linked_lists.easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeTwoSortedListsTest {
    private val list1 = ListBuilder.build(1, 2, 4)
    private val list2 = ListBuilder.build(1, 3, 4)
    private val expected = ListBuilder.build(1, 1, 2, 3, 4, 4)

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
