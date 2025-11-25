package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MapOfHighestPeakTest {
    @Test
    fun test1Bfs() {
        val isWater = arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))
        val expected = arrayOf(intArrayOf(1, 0), intArrayOf(2, 1))

        assertArrayEquals(expected, MapOfHighestPeak.highestPeakBfs(isWater))
    }

    @Test
    fun test2Bfs() {
        val isWater = arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 0, 0), intArrayOf(0, 0, 0))
        val expected = arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 1), intArrayOf(1, 2, 2))

        assertArrayEquals(expected, MapOfHighestPeak.highestPeakBfs(isWater))
    }

    @Test
    fun test1Dp() {
        val isWater = arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))
        val expected = arrayOf(intArrayOf(1, 0), intArrayOf(2, 1))

        assertArrayEquals(expected, MapOfHighestPeak.highestPeakDp(isWater))
    }

    @Test
    fun test2Dp() {
        val isWater = arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 0, 0), intArrayOf(0, 0, 0))
        val expected = arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 1), intArrayOf(1, 2, 2))

        assertArrayEquals(expected, MapOfHighestPeak.highestPeakDp(isWater))
    }
}