package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfRemotenessOfAllCellsTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(-1, 1, -1),
            intArrayOf(5, -1, 4),
            intArrayOf(-1, 3, -1),
        )
        val expected = 39L

        assertEquals(expected, SumOfRemotenessOfAllCells.sumRemoteness(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(-1, 3, 4),
            intArrayOf(-1, -1, -1),
            intArrayOf(3, -1, -1),
        )
        val expected = 13L

        assertEquals(expected, SumOfRemotenessOfAllCells.sumRemoteness(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            intArrayOf(1),
        )
        val expected = 0L

        assertEquals(expected, SumOfRemotenessOfAllCells.sumRemoteness(grid))
    }
}