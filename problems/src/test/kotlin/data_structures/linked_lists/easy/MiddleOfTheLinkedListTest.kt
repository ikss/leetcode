package data_structures.linked_lists.easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MiddleOfTheLinkedListTest {

    @Test
    fun test1() {
        val head = ListBuilder.build(1, 2, 3, 4, 5)
        val expected = ListBuilder.build(3, 4, 5)

        assertEquals(expected, MiddleOfTheLinkedList.middleNode(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 2, 3, 4, 5, 6)
        val expected = ListBuilder.build(4, 5, 6)

        assertEquals(expected, MiddleOfTheLinkedList.middleNode(head))
    }
}
