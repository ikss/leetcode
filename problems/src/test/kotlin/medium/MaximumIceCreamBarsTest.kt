package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumIceCreamBarsTest {
    @Test
    fun test1() {
        val costs = intArrayOf(1, 3, 2, 4, 1)
        val coins = 7
        val expected = 4

        assertEquals(expected, MaximumIceCreamBars.maxIceCream(costs, coins))
    }

    @Test
    fun test2() {
        val costs = intArrayOf(10, 6, 8, 7, 7, 8)
        val coins = 5
        val expected = 0

        assertEquals(expected, MaximumIceCreamBars.maxIceCream(costs, coins))
    }

    @Test
    fun test3() {
        val costs = intArrayOf(1, 6, 3, 1, 2, 5)
        val coins = 20
        val expected = 6

        assertEquals(expected, MaximumIceCreamBars.maxIceCream(costs, coins))
    }
}