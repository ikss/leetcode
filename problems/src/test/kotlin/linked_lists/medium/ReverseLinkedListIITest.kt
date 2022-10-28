package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseLinkedListIITest {
    private val initial = ListBuilder.build(1, 2, 3, 4, 5)
    private val expected = ListBuilder.build(1, 4, 3, 2, 5)

    @Test
    fun testReverseRecursive() {
        val start = 2
        val end = 4

        assertEquals(expected, ReverseLinkedListII.reverseBetweenRecursive(initial, start, end))
    }

    @Test
    fun testReverseLoop() {
        val start = 1
        val end = 2

        assertEquals(
            ListBuilder.build(2, 1),
            ReverseLinkedListII.reverseBetweenLoop(ListBuilder.build(1, 2), start, end)
        )
    }
}
