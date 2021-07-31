package collections.arrays.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainerWithMostWaterTest {
    @Test
    fun `example 1 test`() {
        val heights = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        val area = 49
        assertEquals(area, ContainerWithMostWater.maxArea(heights))
    }

    @Test
    fun `example 2 test`() {
        val heights = intArrayOf(1, 1)
        val area = 1
        assertEquals(area, ContainerWithMostWater.maxArea(heights))
    }

    @Test
    fun `example 3 test`() {
        val heights = intArrayOf(4, 3, 2, 1, 4)
        val area = 16
        assertEquals(area, ContainerWithMostWater.maxArea(heights))
    }

    @Test
    fun `example 4 test`() {
        val heights = intArrayOf(1, 2, 1)
        val area = 2
        assertEquals(area, ContainerWithMostWater.maxArea(heights))
    }
}
