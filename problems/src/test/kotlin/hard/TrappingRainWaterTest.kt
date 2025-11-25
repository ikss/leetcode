package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrappingRainWaterTest {

    @Test
    fun test1() {
        val height = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        val expected = 6

        assertEquals(expected, TrappingRainWater.trap(height))
    }

    @Test
    fun test2() {
        val height = intArrayOf(4, 2, 0, 3, 2, 5)
        val expected = 9

        assertEquals(expected, TrappingRainWater.trap(height))
    }

    @Test
    fun test3() {
        val height = intArrayOf(4, 0, 0, 0, 0, 0)
        val expected = 0

        assertEquals(expected, TrappingRainWater.trap(height))
    }

    @Test
    fun test1twoPointers() {
        val height = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        val expected = 6

        assertEquals(expected, TrappingRainWater.trapTwoPointers(height))
    }

    @Test
    fun test2twoPointers() {
        val height = intArrayOf(4, 2, 0, 3, 2, 5)
        val expected = 9

        assertEquals(expected, TrappingRainWater.trapTwoPointers(height))
    }

    @Test
    fun test3twoPointers() {
        val height = intArrayOf(4, 0, 0, 0, 0, 0)
        val expected = 0

        assertEquals(expected, TrappingRainWater.trapTwoPointers(height))
    }
}