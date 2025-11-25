package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedListIITest {
    @Test
    fun test1() {
        val list = ListBuilder.build(1, 2, 3, 3, 4, 4, 5)
        val expected = ListBuilder.build(1, 2, 5)

        assertEquals(expected, RemoveDuplicatesFromSortedListII.deleteDuplicates(list))
    }

    @Test
    fun test2() {
        val list = ListBuilder.build(1, 1, 1, 2, 3)
        val expected = ListBuilder.build(2, 3)

        assertEquals(expected, RemoveDuplicatesFromSortedListII.deleteDuplicates(list))
    }
}