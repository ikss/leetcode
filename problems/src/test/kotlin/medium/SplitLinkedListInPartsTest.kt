package medium

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SplitLinkedListInPartsTest {
    @Test
    fun test1() {
        val root = ListBuilder.build(1, 2, 3)
        val k = 5
        val expected = arrayOf(
            ListNode(1),
            ListNode(2),
            ListNode(3),
            null,
            null,
        )

        assertArrayEquals(expected, SplitLinkedListInParts.splitListToPartsStraightforward(root, k))
    }

    @Test
    fun test2() {
        val root = ListBuilder.build(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val k = 3
        val expected = arrayOf(
            ListBuilder.build(1, 2, 3, 4),
            ListBuilder.build(5, 6, 7),
            ListBuilder.build(8, 9, 10),
        )

        assertArrayEquals(expected, SplitLinkedListInParts.splitListToPartsStraightforward(root, k))
    }
}