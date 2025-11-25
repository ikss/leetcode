package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToMakeRopeColorfulTest {
    @Test
    fun test1() {
        val colors = "abaac"
        val neededTime = intArrayOf(1, 2, 3, 4, 5)
        val expected = 3

        assertEquals(expected, MinimumTimeToMakeRopeColorful.minCost(colors, neededTime))
    }

    @Test
    fun test2() {
        val colors = "abc"
        val neededTime = intArrayOf(1, 2, 3)
        val expected = 0

        assertEquals(expected, MinimumTimeToMakeRopeColorful.minCost(colors, neededTime))
    }

    @Test
    fun test3() {
        val colors = "aabaa"
        val neededTime = intArrayOf(1, 2, 3, 4, 1)
        val expected = 2

        assertEquals(expected, MinimumTimeToMakeRopeColorful.minCost(colors, neededTime))
    }
}