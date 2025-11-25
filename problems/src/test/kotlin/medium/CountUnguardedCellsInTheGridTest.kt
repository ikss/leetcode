package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountUnguardedCellsInTheGridTest {
    @Test
    fun test1() {
        val m = 4
        val n = 6
        val guards = arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 3))
        val walls = arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(1, 4))
        val expected = 7

        assertEquals(expected, CountUnguardedCellsInTheGrid.countUnguarded(m, n, guards, walls))
    }

    @Test
    fun test2() {
        val m = 3
        val n = 3
        val guards = arrayOf(intArrayOf(1, 1))
        val walls = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(2, 1), intArrayOf(1, 2))
        val expected = 4

        assertEquals(expected, CountUnguardedCellsInTheGrid.countUnguarded(m, n, guards, walls))
    }
}