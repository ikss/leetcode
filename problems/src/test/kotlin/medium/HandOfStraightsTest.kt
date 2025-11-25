package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HandOfStraightsTest {
    @Test
    fun test1() {
        val hand = intArrayOf(1, 2, 3, 6, 2, 3, 4, 7, 8)
        val groupSize = 3
        val expected = true

        assertEquals(expected, HandOfStraights.isNStraightHand(hand, groupSize))
    }

    @Test
    fun test2() {
        val hand = intArrayOf(1, 2, 3, 4, 5)
        val groupSize = 4
        val expected = false

        assertEquals(expected, HandOfStraights.isNStraightHand(hand, groupSize))
    }
    
    @Test
    fun test3() {
        val hand = intArrayOf(1, 2, 3)
        val groupSize = 1
        val expected = true

        assertEquals(expected, HandOfStraights.isNStraightHand(hand, groupSize))
    }
}