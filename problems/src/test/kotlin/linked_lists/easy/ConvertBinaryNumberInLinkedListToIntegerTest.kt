package linked_lists.easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConvertBinaryNumberInLinkedListToIntegerTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(1, 0, 1)
        val expected = 5

        assertEquals(expected, ConvertBinaryNumberInLinkedListToInteger.getDecimalValue(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(0)
        val expected = 0

        assertEquals(expected, ConvertBinaryNumberInLinkedListToInteger.getDecimalValue(head))
    }
}