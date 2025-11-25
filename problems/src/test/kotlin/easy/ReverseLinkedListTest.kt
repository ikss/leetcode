package easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseLinkedListTest {
    private val initial = ListBuilder.build(1, 2, 3, 4)
    private val expected = ListBuilder.build(4, 3, 2, 1)

    @Test
    fun testReverseLoop() {

        assertEquals(expected, ReverseLinkedList.reverseLoop(initial))
    }

    @Test
    fun testReverseRecursive() {

        assertEquals(expected, ReverseLinkedList.reverseRecursive(initial))
    }
}
