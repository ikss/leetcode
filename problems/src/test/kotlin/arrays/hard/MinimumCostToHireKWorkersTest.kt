package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToHireKWorkersTest {
    @Test
    fun test1() {
        val quality = intArrayOf(10, 20, 5)
        val wage = intArrayOf(70, 50, 30)
        val k = 2

        assertEquals(105.0, MinimumCostToHireKWorkers.mincostToHireWorkers(quality, wage, k), 0.00001)
    }
    
    @Test
    fun test2() {
        val quality = intArrayOf(3, 1, 10, 10, 1)
        val wage = intArrayOf(4, 8, 2, 2, 7)
        val k = 3

        assertEquals(30.66667, MinimumCostToHireKWorkers.mincostToHireWorkers(quality, wage, k), 0.00001)
    }
}