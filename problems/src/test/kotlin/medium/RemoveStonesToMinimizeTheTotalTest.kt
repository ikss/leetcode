package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveStonesToMinimizeTheTotalTest {
    @Test
    fun test1() {
        val piles = intArrayOf(5, 4, 9)
        val k = 2
        val expected = 12

        assertEquals(expected, RemoveStonesToMinimizeTheTotal.minStoneSum(piles, k))
    }

    @Test
    fun test2() {
        val piles = intArrayOf(4, 3, 6, 7)
        val k = 3
        val expected = 12

        assertEquals(expected, RemoveStonesToMinimizeTheTotal.minStoneSum(piles, k))
    }
}