package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToReachCityWithDiscountsTest {
    @Test
    fun test1() {
        val n = 5
        val highways = arrayOf(
            intArrayOf(0, 1, 4),
            intArrayOf(2, 1, 3),
            intArrayOf(1, 4, 11),
            intArrayOf(3, 2, 3),
            intArrayOf(3, 4, 2),
        )
        val discounts = 1
        val expected = 9

        assertEquals(expected, MinimumCostToReachCityWithDiscounts.minimumCost(n, highways, discounts))
    }

    @Test
    fun test2() {
        val n = 4
        val highways = arrayOf(
            intArrayOf(1, 3, 17),
            intArrayOf(1, 2, 7),
            intArrayOf(3, 2, 5),
            intArrayOf(0, 1, 6),
            intArrayOf(3, 0, 20),
        )
        val discounts = 20
        val expected = 8

        assertEquals(expected, MinimumCostToReachCityWithDiscounts.minimumCost(n, highways, discounts))
    }
    
    @Test
    fun test3() {
        val n = 4
        val highways = arrayOf(
            intArrayOf(0, 1, 3),
            intArrayOf(2, 3, 2),
        )
        val discounts = 0
        val expected = -1

        assertEquals(expected, MinimumCostToReachCityWithDiscounts.minimumCost(n, highways, discounts))
    }
}