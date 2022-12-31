package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniquePathsIIITest {

    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 2, -1))
        val expected = 2

        assertEquals(expected, UniquePathsIII.uniquePathsIII(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(0, 0, 0, 0), intArrayOf(0, 0, 0, 2))
        val expected = 4

        assertEquals(expected, UniquePathsIII.uniquePathsIII(grid))
    }
}