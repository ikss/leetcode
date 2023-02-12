package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumFuelCostToReportToTheCapitalTest {

    @Test
    fun test1() {
        val roads = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3))
        val seats = 5
        val expected = 3L

        assertEquals(expected, MinimumFuelCostToReportToTheCapital.minimumFuelCost(roads, seats))
    }

    @Test
    fun test2() {
        val roads = arrayOf(
            intArrayOf(3, 1),
            intArrayOf(3, 2),
            intArrayOf(1, 0),
            intArrayOf(0, 4),
            intArrayOf(0, 5),
            intArrayOf(4, 6),
        )
        val seats = 2
        val expected = 7L

        assertEquals(expected, MinimumFuelCostToReportToTheCapital.minimumFuelCost(roads, seats))
    }

    @Test
    fun test3() {
        val roads = emptyArray<IntArray>()
        val seats = 1
        val expected = 0L

        assertEquals(expected, MinimumFuelCostToReportToTheCapital.minimumFuelCost(roads, seats))
    }
}