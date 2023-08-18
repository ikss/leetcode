package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximalNetworkRankTest {
    @Test
    fun test1() {
        val roads = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 3),
            intArrayOf(1, 2),
            intArrayOf(1, 3)
        )
        val expected = 4

        assertEquals(expected, MaximalNetworkRank.maximalNetworkRank(4, roads))
    }

    @Test
    fun test2() {
        val n = 5
        val roads = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 3),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(2, 4),
        )
        val expected = 5

        assertEquals(expected, MaximalNetworkRank.maximalNetworkRank(n, roads))
    }

    @Test
    fun test3() {
        val n = 8
        val roads = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(2, 4),
            intArrayOf(5, 6),
            intArrayOf(5, 7),
        )
        val expected = 5

        assertEquals(expected, MaximalNetworkRank.maximalNetworkRank(n, roads))
    }
}