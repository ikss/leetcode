package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumXORPathInAGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val expected = 6

        assertEquals(expected, MinimumXORPathInAGrid.minCost(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(6, 7), intArrayOf(5, 8))
        val expected = 9

        assertEquals(expected, MinimumXORPathInAGrid.minCost(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(2, 7, 5))
        val expected = 0

        assertEquals(expected, MinimumXORPathInAGrid.minCost(grid))
    }
}