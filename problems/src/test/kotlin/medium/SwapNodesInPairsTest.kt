package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SwapNodesInPairsTest {

    @Test
    fun test1() {
        val head = ListBuilder.build(1, 2, 3, 4)
        val expected = ListBuilder.build(2, 1, 4, 3)

        assertEquals(expected, SwapNodesInPairs.swapPairs(head))
    }

    @Test
    fun test2() {
        val head = ListBuilder.build()
        val expected = ListBuilder.build()

        assertEquals(expected, SwapNodesInPairs.swapPairs(head))
    }

    @Test
    fun test3() {
        val head = ListBuilder.build(1)
        val expected = ListBuilder.build(1)

        assertEquals(expected, SwapNodesInPairs.swapPairs(head))
    }
}