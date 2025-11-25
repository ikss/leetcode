package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DoubleNumberRepresentedAsLinkedListTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(1, 8, 9)
        val expected = ListBuilder.build(3, 7, 8)

        assertEquals(expected, DoubleNumberRepresentedAsLinkedList.doubleIt(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(9, 9, 9)
        val expected = ListBuilder.build(1, 9, 9, 8)

        assertEquals(expected, DoubleNumberRepresentedAsLinkedList.doubleIt(head))
    }
}