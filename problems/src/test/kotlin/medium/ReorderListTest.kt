package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReorderListTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(1, 2, 3, 4)
        val expected = ListBuilder.build(1, 4, 2, 3)

        ReorderList.reorderList(head)
        assertEquals(expected, head)
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 2, 3, 4, 5)
        val expected = ListBuilder.build(1, 5, 2, 4, 3)

        ReorderList.reorderList(head)
        assertEquals(expected, head)
    }
}