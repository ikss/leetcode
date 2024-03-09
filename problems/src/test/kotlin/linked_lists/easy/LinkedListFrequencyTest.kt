package linked_lists.easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LinkedListFrequencyTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(1, 1, 2, 1, 2, 3)
        val expected = ListBuilder.build(1, 2, 3)

        assertEquals(expected, LinkedListFrequency.frequenciesOfElements(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(1, 1, 2, 2, 2)
        val expected = ListBuilder.build(3, 2)

        assertEquals(expected, LinkedListFrequency.frequenciesOfElements(head))
    }

    @Test
    fun test3() {
        val head = ListBuilder.build(6, 5, 4, 3, 2, 1)
        val expected = ListBuilder.build(1, 1, 1, 1, 1, 1)

        assertEquals(expected, LinkedListFrequency.frequenciesOfElements(head))
    }
}