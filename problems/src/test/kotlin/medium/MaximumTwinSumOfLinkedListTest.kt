package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumTwinSumOfLinkedListTest {
    @Test
    fun test1recursive() {
        val head = ListBuilder.build(5, 4, 2, 1)
        val expected = 6

        assertEquals(expected, MaximumTwinSumOfLinkedList.pairSumRecursive(head))
    }

    @Test
    fun test2recursive() {
        val head = ListBuilder.build(4, 2, 2, 3)
        val expected = 7

        assertEquals(expected, MaximumTwinSumOfLinkedList.pairSumRecursive(head))
    }

    @Test
    fun test3recursive() {
        val head = ListBuilder.build(1, 100_000)
        val expected = 100_001

        assertEquals(expected, MaximumTwinSumOfLinkedList.pairSumRecursive(head))
    }

    @Test
    fun test1reverseHalf() {
        val head = ListBuilder.build(5, 4, 2, 1)
        val expected = 6

        assertEquals(expected, MaximumTwinSumOfLinkedList.pairSumReverseHalf(head))
    }

    @Test
    fun test2reverseHalf() {
        val head = ListBuilder.build(4, 2, 2, 3)
        val expected = 7

        assertEquals(expected, MaximumTwinSumOfLinkedList.pairSumReverseHalf(head))
    }

    @Test
    fun test3reverseHalf() {
        val head = ListBuilder.build(1, 100_000)
        val expected = 100_001

        assertEquals(expected, MaximumTwinSumOfLinkedList.pairSumReverseHalf(head))
    }
}