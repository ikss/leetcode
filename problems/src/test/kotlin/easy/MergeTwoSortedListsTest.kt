package easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeTwoSortedListsTest {
    private val list1 = ListBuilder.build(1, 2, 4)
    private val list2 = ListBuilder.build(1, 3, 4)
    private val expected = ListBuilder.build(1, 1, 2, 3, 4, 4)

    @Test
    fun test1mergeLists() {

        assertEquals(expected, MergeTwoSortedLists.mergeTwoLists(list1, list2))
    }

    @Test
    fun test2mergeLists() {

        assertEquals(list1, MergeTwoSortedLists.mergeTwoLists(list1, null))
    }

    @Test
    fun test3mergeLists() {

        assertEquals(list2, MergeTwoSortedLists.mergeTwoLists(null, list2))
    }

    @Test
    fun test1mergeListsRecursive() {

        assertEquals(expected, MergeTwoSortedLists.mergeTwoListsRecursive(list1, list2))
    }

    @Test
    fun test2mergeListsRecursive() {

        assertEquals(list1, MergeTwoSortedLists.mergeTwoLists(list1, null))
    }

    @Test
    fun test3mergeListsRecursive() {

        assertEquals(list2, MergeTwoSortedLists.mergeTwoLists(null, list2))
    }
}
