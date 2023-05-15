package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseLinkedListIITest {

    @Test
    fun test1Recursive() {
        val initial = ListBuilder.build(1, 2, 3, 4, 5)
        val start = 2
        val end = 4
        val expected = ListBuilder.build(1, 4, 3, 2, 5)

        assertEquals(expected, ReverseLinkedListII.reverseBetweenRecursive(initial, start, end))
    }

    @Test
    fun test2Recursive() {
        val initial = ListBuilder.build(2, 1)
        val start = 1
        val end = 2
        val expected = ListBuilder.build(1, 2)

        assertEquals(initial, ReverseLinkedListII.reverseBetweenLoop(expected, start, end))
    }

    @Test
    fun test1Loop() {
        val initial = ListBuilder.build(1, 2, 3, 4, 5)
        val start = 2
        val end = 4
        val expected = ListBuilder.build(1, 4, 3, 2, 5)

        assertEquals(expected, ReverseLinkedListII.reverseBetweenRecursive(initial, start, end))
    }

    @Test
    fun test2Loop() {
        val initial = ListBuilder.build(2, 1)
        val start = 1
        val end = 2
        val expected = ListBuilder.build(1, 2)

        assertEquals(initial, ReverseLinkedListII.reverseBetweenLoop(expected, start, end))
    }
}
