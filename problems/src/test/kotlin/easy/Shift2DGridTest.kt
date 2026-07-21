package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Shift2DGridTest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val k = 1
        val expected = listOf(listOf(9, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8))

        assertEquals(expected, Shift2DGrid.shiftGrid(grid, k))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(3, 8, 1, 9),
            intArrayOf(19, 7, 2, 5),
            intArrayOf(4, 6, 11, 10),
            intArrayOf(12, 0, 21, 13),
        )
        val k = 4
        val expected = listOf(listOf(12, 0, 21, 13), listOf(3, 8, 1, 9), listOf(19, 7, 2, 5), listOf(4, 6, 11, 10))

        assertEquals(expected, Shift2DGrid.shiftGrid(grid, k))
    }

    @Test
    fun test3() {
        val grid = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val k = 9
        val expected = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))

        assertEquals(expected, Shift2DGrid.shiftGrid(grid, k))
    }

    @Test
    fun test4() {
        val grid = arrayOf(
            intArrayOf(1),
            intArrayOf(2),
            intArrayOf(3),
            intArrayOf(4),
            intArrayOf(7),
            intArrayOf(6),
            intArrayOf(5)
        )
        val k = 23
        val expected = listOf(listOf(6), listOf(5), listOf(1), listOf(2), listOf(3), listOf(4), listOf(7))

        assertEquals(expected, Shift2DGrid.shiftGrid(grid, k))
    }
}