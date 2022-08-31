package data_structures.linked_lists.easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntersectionOfTwoLinkedListsTest {

    @Test
    fun test1() {
        val listA = ListBuilder.build(4, 1)
        val listB = ListBuilder.build(5, 6, 1)

        val tail = ListBuilder.build(8, 4, 5)
        listA!!.next = tail
        listB!!.next = tail

        assertEquals(tail, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB))
    }

    @Test
    fun test2() {
        val listA = ListBuilder.build(1, 9, 1)
        val listB = ListBuilder.build(3)

        val tail = ListBuilder.build(2, 1)
        listA!!.next = tail
        listB!!.next = tail

        assertEquals(tail, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB))
    }

    @Test
    fun test3() {
        val listA = ListBuilder.build(2, 6, 4)
        val listB = ListBuilder.build(1, 5)

        assertEquals(null, IntersectionOfTwoLinkedLists.getIntersectionNode(listA, listB))
    }
}
