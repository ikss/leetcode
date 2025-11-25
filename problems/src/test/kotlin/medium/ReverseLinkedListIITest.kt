package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseLinkedListIITest {

    @Test
    fun test1Recursive() {
        val head = ListBuilder.build(1, 2, 3, 4, 5)
        val start = 2
        val end = 4
        val expected = ListBuilder.build(1, 4, 3, 2, 5)

        assertEquals(expected, ReverseLinkedListII.reverseBetweenRecursive(head, start, end))
    }

    @Test
    fun test2Recursive() {
        val head = ListBuilder.build(2, 1)
        val start = 1
        val end = 2
        val expected = ListBuilder.build(1, 2)

        assertEquals(expected, ReverseLinkedListII.reverseBetweenLoop(head, start, end))
    }

    @Test
    fun test1Loop() {
        val head = ListBuilder.build(1, 2, 3, 4, 5)
        val start = 2
        val end = 4
        val expected = ListBuilder.build(1, 4, 3, 2, 5)

        assertEquals(expected, ReverseLinkedListII.reverseBetweenRecursive(head, start, end))
    }

    @Test
    fun test2Loop() {
        val head = ListBuilder.build(2, 1)
        val start = 1
        val end = 2
        val expected = ListBuilder.build(1, 2)

        assertEquals(expected, ReverseLinkedListII.reverseBetweenLoop(head, start, end))
    }
}
