package graphs.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MinimumCostToBuyApplesTest {
    @Test
    fun test1() {
        val n = 4
        val roads = arrayOf(
            intArrayOf(1, 2, 4),
            intArrayOf(2, 3, 2),
            intArrayOf(2, 4, 5),
            intArrayOf(3, 4, 1),
            intArrayOf(1, 3, 4),
        )
        val appleCost = intArrayOf(56, 42, 102, 301)
        val k = 2
        val expected = longArrayOf(54, 42, 48, 51)

        assertArrayEquals(expected, MinimumCostToBuyApples.minCost(n, roads, appleCost, k))
    }

    @Test
    fun test2() {
        val n = 3
        val roads = arrayOf(
            intArrayOf(1, 2, 5),
            intArrayOf(2, 3, 1),
            intArrayOf(3, 1, 2),
        )
        val appleCost = intArrayOf(2, 3, 1)
        val k = 3
        val expected = longArrayOf(2, 3, 1)

        assertArrayEquals(expected, MinimumCostToBuyApples.minCost(n, roads, appleCost, k))
    }
}