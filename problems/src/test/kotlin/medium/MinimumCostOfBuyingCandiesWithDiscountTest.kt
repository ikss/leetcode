package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostOfBuyingCandiesWithDiscountTest {
    @Test
    fun test1() {
        val cost = intArrayOf(1, 2, 3)
        val expected = 5

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCost(cost))
    }

    @Test
    fun test2() {
        val cost = intArrayOf(6, 5, 7, 9, 2, 2)
        val expected = 23

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCost(cost))
    }

    @Test
    fun test3() {
        val cost = intArrayOf(5, 5)
        val expected = 10

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCost(cost))
    }
}