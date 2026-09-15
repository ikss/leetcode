package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class BuildingsWithAnOceanViewTest {
    @Test
    fun test1() {
        val heights = intArrayOf(4, 2, 3, 1)
        val expected = intArrayOf(0, 2, 3)

        assertArrayEquals(expected, BuildingsWithAnOceanView.findBuildings(heights))
    }

    @Test
    fun test2() {
        val heights = intArrayOf(4, 3, 2, 1)
        val expected = intArrayOf(0, 1, 2, 3)

        assertArrayEquals(expected, BuildingsWithAnOceanView.findBuildings(heights))
    }

    @Test
    fun test3() {
        val heights = intArrayOf(1, 3, 2, 4)
        val expected = intArrayOf(3)

        assertArrayEquals(expected, BuildingsWithAnOceanView.findBuildings(heights))
    }
}