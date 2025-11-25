package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OddEvenLinkedListTest {

    @Test
    fun test1() {
        val l1 = ListBuilder.build(1, 2, 3, 4, 5)
        val expected = ListBuilder.build(1, 3, 5, 2, 4)

        val actual = OddEvenLinkedList.oddEvenList(l1)

        assertEquals(actual, expected)
    }

    @Test
    fun test2() {
        val l1 = ListBuilder.build(2, 1, 3, 5, 6, 4, 7)
        val expected = ListBuilder.build(2, 3, 6, 7, 1, 5, 4)

        val actual = OddEvenLinkedList.oddEvenList(l1)

        assertEquals(actual, expected)
    }
}
