package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CanPlaceFlowersTest {
    @Test
    fun test1() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 1)
        val n = 1
        val expected = true

        assertEquals(expected, CanPlaceFlowers.canPlaceFlowers(flowerbed, n))
    }

    @Test
    fun test2() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 1)
        val n = 2
        val expected = false

        assertEquals(expected, CanPlaceFlowers.canPlaceFlowers(flowerbed, n))
    }
}