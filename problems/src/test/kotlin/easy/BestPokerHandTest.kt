package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BestPokerHandTest {
    @Test
    fun test1() {
        val ranks = intArrayOf(13, 2, 3, 1, 9)
        val suits = charArrayOf('a', 'a', 'a', 'a', 'a')
        val expected = "Flush"

        assertEquals(expected, BestPokerHand.bestHand(ranks, suits))
    }

    @Test
    fun test2() {
        val ranks = intArrayOf(4, 4, 2, 4, 4)
        val suits = charArrayOf('d', 'a', 'a', 'b', 'c')
        val expected = "Three of a Kind"

        assertEquals(expected, BestPokerHand.bestHand(ranks, suits))
    }

    @Test
    fun test3() {
        val ranks = intArrayOf(10, 10, 2, 12, 9)
        val suits = charArrayOf('a', 'b', 'c', 'a', 'd')
        val expected = "Pair"

        assertEquals(expected, BestPokerHand.bestHand(ranks, suits))
    }
}