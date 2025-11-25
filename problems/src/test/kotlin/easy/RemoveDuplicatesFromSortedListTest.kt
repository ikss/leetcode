package easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveDuplicatesFromSortedListTest {

    @Test
    fun test1() {
        val root = ListBuilder.build(1, 1, 2)
        val expected = ListBuilder.build(1, 2)

        assertEquals(expected, RemoveDuplicatesFromSortedList.deleteDuplicates(root))
    }

    @Test
    fun test2() {
        val root = ListBuilder.build(1, 1, 2, 3, 3)
        val expected = ListBuilder.build(1, 2, 3)

        assertEquals(expected, RemoveDuplicatesFromSortedList.deleteDuplicates(root))
    }
}