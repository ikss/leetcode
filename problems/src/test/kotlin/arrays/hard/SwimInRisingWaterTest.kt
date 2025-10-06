package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SwimInRisingWaterTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 2),
            intArrayOf(1, 3),
        )
        val expected = 3

        assertEquals(expected, SwimInRisingWater.swimInWater(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(0, 1, 2, 3, 4),
            intArrayOf(24, 23, 22, 21, 5),
            intArrayOf(12, 13, 14, 15, 16),
            intArrayOf(11, 17, 18, 19, 20),
            intArrayOf(10, 9, 8, 7, 6),
        )
        val expected = 16

        assertEquals(expected, SwimInRisingWater.swimInWater(grid))
    }
}