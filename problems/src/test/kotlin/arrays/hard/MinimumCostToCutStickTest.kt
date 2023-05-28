package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToCutStickTest {
    @Test
    fun test1dpTopDown() {
        val n = 7
        val cuts = intArrayOf(1, 3, 4, 5)
        val expected = 16

        assertEquals(expected, MinimumCostToCutStick.minCostDpTopDown(n, cuts))
    }

    @Test
    fun test2dpTopDown() {
        val n = 9
        val cuts = intArrayOf(5, 6, 1, 4, 2)
        val expected = 22

        assertEquals(expected, MinimumCostToCutStick.minCostDpTopDown(n, cuts))
    }

    @Test
    fun test1dpBottomUp() {
        val n = 7
        val cuts = intArrayOf(1, 3, 4, 5)
        val expected = 16

        assertEquals(expected, MinimumCostToCutStick.minCostDpBottomUp(n, cuts))
    }

    @Test
    fun test2dpBottomUp() {
        val n = 9
        val cuts = intArrayOf(5, 6, 1, 4, 2)
        val expected = 22

        assertEquals(expected, MinimumCostToCutStick.minCostDpBottomUp(n, cuts))
    }
}