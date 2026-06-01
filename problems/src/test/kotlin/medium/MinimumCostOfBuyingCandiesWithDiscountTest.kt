package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostOfBuyingCandiesWithDiscountTest {
    @Test
    fun test1SortDescending() {
        val cost = intArrayOf(1, 2, 3)
        val expected = 5

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCostSortDescending(cost))
    }

    @Test
    fun test2SortDescending() {
        val cost = intArrayOf(6, 5, 7, 9, 2, 2)
        val expected = 23

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCostSortDescending(cost))
    }

    @Test
    fun test3SortDescending() {
        val cost = intArrayOf(5, 5)
        val expected = 10

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCostSortDescending(cost))
    }

    @Test
    fun test1CountingSort() {
        val cost = intArrayOf(1, 2, 3)
        val expected = 5

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCostCountingSort(cost))
    }

    @Test
    fun test2CountingSort() {
        val cost = intArrayOf(6, 5, 7, 9, 2, 2)
        val expected = 23

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCostCountingSort(cost))
    }

    @Test
    fun test3CountingSort() {
        val cost = intArrayOf(5, 5)
        val expected = 10

        assertEquals(expected, MinimumCostOfBuyingCandiesWithDiscount.minimumCostCountingSort(cost))
    }
}