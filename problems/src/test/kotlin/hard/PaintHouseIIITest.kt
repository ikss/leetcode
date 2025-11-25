package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PaintHouseIIITest {

    @Test
    fun test1() {
        val houses = intArrayOf(0, 0, 0, 0, 0)
        val cost = arrayOf(intArrayOf(1, 10), intArrayOf(10, 1), intArrayOf(10, 1), intArrayOf(1, 10), intArrayOf(5, 1))
        val m = 5
        val n = 2
        val target = 3
        val expected = 9

        assertEquals(expected, PaintHousesIII.minCost(houses, cost, m, n, target))
    }

    @Test
    fun test2() {
        val houses = intArrayOf(0, 2, 1, 2, 0)
        val cost = arrayOf(intArrayOf(1, 10), intArrayOf(10, 1), intArrayOf(10, 1), intArrayOf(1, 10), intArrayOf(5, 1))
        val m = 5
        val n = 2
        val target = 3
        val expected = 11

        assertEquals(expected, PaintHousesIII.minCost(houses, cost, m, n, target))
    }

    @Test
    fun test3() {
        val houses = intArrayOf(3, 1, 2, 3)
        val cost = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))
        val m = 4
        val n = 3
        val target = 3
        val expected = -1

        assertEquals(expected, PaintHousesIII.minCost(houses, cost, m, n, target))
    }
}
