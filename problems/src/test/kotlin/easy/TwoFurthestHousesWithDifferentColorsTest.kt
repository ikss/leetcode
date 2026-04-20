package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoFurthestHousesWithDifferentColorsTest {
    @Test
    fun test1Squared() {
        val colors = intArrayOf(1, 1, 1, 6, 1, 1, 1)
        val expected = 3

        assertEquals(expected, TwoFurthestHousesWithDifferentColors.maxDistanceSquared(colors))
    }

    @Test
    fun test2Squared() {
        val colors = intArrayOf(1, 8, 3, 8, 3)
        val expected = 4

        assertEquals(expected, TwoFurthestHousesWithDifferentColors.maxDistanceSquared(colors))
    }

    @Test
    fun test3Squared() {
        val colors = intArrayOf(0, 1)
        val expected = 1

        assertEquals(expected, TwoFurthestHousesWithDifferentColors.maxDistanceSquared(colors))
    }

    @Test
    fun test1Linear() {
        val colors = intArrayOf(1, 1, 1, 6, 1, 1, 1)
        val expected = 3

        assertEquals(expected, TwoFurthestHousesWithDifferentColors.maxDistanceLinear(colors))
    }

    @Test
    fun test2Linear() {
        val colors = intArrayOf(1, 8, 3, 8, 3)
        val expected = 4

        assertEquals(expected, TwoFurthestHousesWithDifferentColors.maxDistanceLinear(colors))
    }

    @Test
    fun test3Linear() {
        val colors = intArrayOf(0, 1)
        val expected = 1

        assertEquals(expected, TwoFurthestHousesWithDifferentColors.maxDistanceLinear(colors))
    }
}