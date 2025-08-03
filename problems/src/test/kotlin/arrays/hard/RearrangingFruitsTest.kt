package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RearrangingFruitsTest {
    @Test
    fun test1() {
        val basket1 = intArrayOf(4, 2, 2, 2)
        val basket2 = intArrayOf(1, 4, 1, 2)
        val expected = 1L

        assertEquals(expected, RearrangingFruits.minCost(basket1, basket2))
    }

    @Test
    fun test2() {
        val basket1 = intArrayOf(2, 3, 4, 1)
        val basket2 = intArrayOf(3, 2, 5, 1)
        val expected = -1L

        assertEquals(expected, RearrangingFruits.minCost(basket1, basket2))
    }

}