package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TotalCostToHireKWorkersTest {
    @Test
    fun test1() {
        val costs = intArrayOf(17, 12, 10, 2, 7, 2, 11, 20, 8)
        val k = 3
        val candidates = 4
        val expected = 11L

        assertEquals(expected, TotalCostToHireKWorkers.totalCost(costs, k, candidates))
    }

    @Test
    fun test2() {
        val costs = intArrayOf(1, 2, 4, 1)
        val k = 3
        val candidates = 3
        val expected = 4L

        assertEquals(expected, TotalCostToHireKWorkers.totalCost(costs, k, candidates))
    }
}