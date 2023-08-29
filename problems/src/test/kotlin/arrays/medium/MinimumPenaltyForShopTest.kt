package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumPenaltyForShopTest {
    @Test
    fun test1() {
        val customers = "YYNY"
        val expected = 2

        assertEquals(expected, MinimumPenaltyForShop.bestClosingTime(customers))
    }

    @Test
    fun test2() {
        val customers = "NNNN"
        val expected = 0

        assertEquals(expected, MinimumPenaltyForShop.bestClosingTime(customers))
    }

    @Test
    fun test3() {
        val customers = "YYYY"
        val expected = 4

        assertEquals(expected, MinimumPenaltyForShop.bestClosingTime(customers))
    }
}