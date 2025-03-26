package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToMakeUniValueGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(2, 4), intArrayOf(6, 8))
        val x = 2
        val expected = 4

        assertEquals(expected, MinimumOperationsToMakeUniValueGrid.minOperations(grid, x))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 5), intArrayOf(2, 3))
        val x = 1
        val expected = 5

        assertEquals(expected, MinimumOperationsToMakeUniValueGrid.minOperations(grid, x))
    }
    
    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val x = 2
        val expected = -1

        assertEquals(expected, MinimumOperationsToMakeUniValueGrid.minOperations(grid, x))
    }
}