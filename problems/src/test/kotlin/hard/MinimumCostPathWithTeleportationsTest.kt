package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostPathWithTeleportationsTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 3, 3), intArrayOf(2, 5, 4), intArrayOf(4, 3, 5))
        val k = 2
        val expected = 7

        assertEquals(expected, MinimumCostPathWithTeleportations.minCost(grid, k))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4))
        val k = 1
        val expected = 9

        assertEquals(expected, MinimumCostPathWithTeleportations.minCost(grid, k))
    }
}