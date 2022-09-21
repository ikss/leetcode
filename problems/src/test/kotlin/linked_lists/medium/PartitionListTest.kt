package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PartitionListTest {

    @Test
    fun test1() {
        val head = ListBuilder.build(1, 4, 3, 2, 5, 2)
        val x = 3
        val expected = ListBuilder.build(1, 2, 2, 4, 3, 5)

        assertEquals(expected, PartitionList.partition(head, x))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(2, 1)
        val x = 2
        val expected = ListBuilder.build(1, 2)

        assertEquals(expected, PartitionList.partition(head, x))
    }
}
