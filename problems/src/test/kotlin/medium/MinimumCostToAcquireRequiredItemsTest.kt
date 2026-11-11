package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToAcquireRequiredItemsTest {
    @Test
    fun test1() {
        val cost1 = 3
        val cost2 = 2
        val costBoth = 1
        val need1 = 3
        val need2 = 2
        val expected = 3L

        assertEquals(expected, MinimumCostToAcquireRequiredItems.minimumCost(cost1, cost2, costBoth, need1, need2))
    }

    @Test
    fun test2() {
        val cost1 = 5
        val cost2 = 4
        val costBoth = 15
        val need1 = 2
        val need2 = 3
        val expected = 22L

        assertEquals(expected, MinimumCostToAcquireRequiredItems.minimumCost(cost1, cost2, costBoth, need1, need2))
    }

    @Test
    fun test3() {
        val cost1 = 5
        val cost2 = 4
        val costBoth = 15
        val need1 = 0
        val need2 = 0
        val expected = 0L

        assertEquals(expected, MinimumCostToAcquireRequiredItems.minimumCost(cost1, cost2, costBoth, need1, need2))
    }

    @Test
    fun test4() {
        val cost1 = 625014
        val cost2 = 207793
        val costBoth = 875334
        val need1 = 554292
        val need2 = 90094
        val expected = 365161162630L

        assertEquals(expected, MinimumCostToAcquireRequiredItems.minimumCost(cost1, cost2, costBoth, need1, need2))
    }
}