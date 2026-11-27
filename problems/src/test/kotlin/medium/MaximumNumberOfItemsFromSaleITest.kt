package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfItemsFromSaleITest {
    @Test
    fun test1() {
        val items = arrayOf(intArrayOf(6, 2), intArrayOf(2, 6), intArrayOf(3, 4))
        val budget = 9
        val expected = 4

        assertEquals(expected, MaximumNumberOfItemsFromSaleI.maximumSaleItems(items, budget))
    }

    @Test
    fun test2() {
        val items = arrayOf(intArrayOf(2, 4), intArrayOf(3, 2), intArrayOf(4, 1), intArrayOf(6, 4), intArrayOf(12, 4))
        val budget = 8
        val expected = 10

        assertEquals(expected, MaximumNumberOfItemsFromSaleI.maximumSaleItems(items, budget))
    }
}