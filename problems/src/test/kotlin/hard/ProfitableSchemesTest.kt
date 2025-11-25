package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProfitableSchemesTest {
    @Test
    fun test1mine() {
        val n = 5
        val minProfit = 3
        val group = intArrayOf(2, 2)
        val profit = intArrayOf(2, 3)
        val expected = 2

        assertEquals(expected, ProfitableSchemes.profitableSchemesMine(n, minProfit, group, profit))
    }

    @Test
    fun test2mine() {
        val n = 10
        val minProfit = 5
        val group = intArrayOf(2, 3, 5)
        val profit = intArrayOf(6, 7, 8)
        val expected = 7

        assertEquals(expected, ProfitableSchemes.profitableSchemesMine(n, minProfit, group, profit))
    }

    @Test
    fun test1dp() {
        val n = 5
        val minProfit = 3
        val group = intArrayOf(2, 2)
        val profit = intArrayOf(2, 3)
        val expected = 2

        assertEquals(expected, ProfitableSchemes.profitableSchemesDp(n, minProfit, group, profit))
    }

    @Test
    fun test2dp() {
        val n = 10
        val minProfit = 5
        val group = intArrayOf(2, 3, 5)
        val profit = intArrayOf(6, 7, 8)
        val expected = 7

        assertEquals(expected, ProfitableSchemes.profitableSchemesDp(n, minProfit, group, profit))
    }
}