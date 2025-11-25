package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MagneticForceBetweenTwoBallsTest {
    @Test
    fun test1() {
        val position = intArrayOf(1, 2, 3, 4, 7)
        val n = 3
        val expected = 3

        assertEquals(expected, MagneticForceBetweenTwoBalls.maxDistance(position, n))
    }

    @Test
    fun test2() {
        val position = intArrayOf(5, 4, 3, 2, 1, 1000000000)
        val n = 2
        val expected = 999999999

        assertEquals(expected, MagneticForceBetweenTwoBalls.maxDistance(position, n))
    }

    @Test
    fun test3() {
        val position = intArrayOf(79, 74, 57, 22)
        val n = 4
        val expected = 5

        assertEquals(expected, MagneticForceBetweenTwoBalls.maxDistance(position, n))
    }
}