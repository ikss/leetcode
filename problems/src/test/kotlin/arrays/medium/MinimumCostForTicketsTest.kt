package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostForTicketsTest {
    @Test
    fun test1() {
        val days = intArrayOf(1, 4, 6, 7, 8, 20)
        val costs = intArrayOf(2, 7, 15)
        val expected = 11

        assertEquals(expected, MinimumCostForTickets.mincostTickets(days, costs))
    }

    @Test
    fun test2() {
        val days = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31)
        val costs = intArrayOf(2, 7, 15)
        val expected = 17

        assertEquals(expected, MinimumCostForTickets.mincostTickets(days, costs))
    }
}