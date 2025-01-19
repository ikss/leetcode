package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrappingRainWaterIITest {
    @Test
    fun test1Bfs() {
        val heightMap = arrayOf(
            intArrayOf(1, 4, 3, 1, 3, 2),
            intArrayOf(3, 2, 1, 3, 2, 4),
            intArrayOf(2, 3, 3, 2, 3, 1),
        )
        val expected = 4

        assertEquals(expected, TrappingRainWaterII.trapRainWaterBfs(heightMap))
    }

    @Test
    fun test2Bfs() {
        val heightMap = arrayOf(
            intArrayOf(3, 3, 3, 3, 3),
            intArrayOf(3, 2, 2, 2, 3),
            intArrayOf(3, 2, 1, 2, 3),
            intArrayOf(3, 2, 2, 2, 3),
            intArrayOf(3, 3, 3, 3, 3),
        )
        val expected = 10

        assertEquals(expected, TrappingRainWaterII.trapRainWaterBfs(heightMap))
    }

    @Test
    fun test3Bfs() {
        val heightMap = arrayOf(
            intArrayOf(9, 9, 9, 9, 9, 9, 8, 9, 9, 9, 9),
            intArrayOf(9, 0, 0, 0, 0, 0, 1, 0, 0, 0, 9),
            intArrayOf(9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9),
            intArrayOf(9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9),
            intArrayOf(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9),
        )
        val expected = 215

        assertEquals(expected, TrappingRainWaterII.trapRainWaterBfs(heightMap))
    }


    @Test
    fun test1PriorityQueue() {
        val heightMap = arrayOf(
            intArrayOf(1, 4, 3, 1, 3, 2),
            intArrayOf(3, 2, 1, 3, 2, 4),
            intArrayOf(2, 3, 3, 2, 3, 1),
        )
        val expected = 4

        assertEquals(expected, TrappingRainWaterII.trapRainWaterPriorityQueue(heightMap))
    }

    @Test
    fun test2PriorityQueue() {
        val heightMap = arrayOf(
            intArrayOf(3, 3, 3, 3, 3),
            intArrayOf(3, 2, 2, 2, 3),
            intArrayOf(3, 2, 1, 2, 3),
            intArrayOf(3, 2, 2, 2, 3),
            intArrayOf(3, 3, 3, 3, 3),
        )
        val expected = 10

        assertEquals(expected, TrappingRainWaterII.trapRainWaterPriorityQueue(heightMap))
    }

    @Test
    fun test3PriorityQueue() {
        val heightMap = arrayOf(
            intArrayOf(9, 9, 9, 9, 9, 9, 8, 9, 9, 9, 9),
            intArrayOf(9, 0, 0, 0, 0, 0, 1, 0, 0, 0, 9),
            intArrayOf(9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9),
            intArrayOf(9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9),
            intArrayOf(9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9),
        )
        val expected = 215

        assertEquals(expected, TrappingRainWaterII.trapRainWaterPriorityQueue(heightMap))
    }
}