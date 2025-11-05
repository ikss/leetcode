package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindSmallestCommonElementInAllRowsTest {
    @Test
    fun test1() {
        val mat = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 4, 5, 8, 10),
            intArrayOf(3, 5, 7, 9, 11),
            intArrayOf(1, 3, 5, 7, 9),
        )
        val expected = 5

        assertEquals(expected, FindSmallestCommonElementInAllRows.smallestCommonElement(mat))
    }

    @Test
    fun test2() {
        val mat = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(2, 3, 4),
            intArrayOf(2, 3, 5),
        )
        val expected = 2

        assertEquals(expected, FindSmallestCommonElementInAllRows.smallestCommonElement(mat))
    }
}