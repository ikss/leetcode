package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CuttingRibbonsTest {
    @Test
    fun test1() {
        val ribbons = intArrayOf(9, 7, 5)
        val k = 3
        val expected = 5

        assertEquals(expected, CuttingRibbons.maxLength(ribbons, k))
    }

    @Test
    fun test2() {
        val ribbons = intArrayOf(7, 5, 9)
        val k = 4
        val expected = 4

        assertEquals(expected, CuttingRibbons.maxLength(ribbons, k))
    }

    @Test
    fun test3() {
        val ribbons = intArrayOf(5, 7, 9)
        val k = 22
        val expected = 0

        assertEquals(expected, CuttingRibbons.maxLength(ribbons, k))
    }
}