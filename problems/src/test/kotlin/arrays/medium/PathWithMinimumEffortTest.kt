package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathWithMinimumEffortTest {
    @Test
    fun test1() {
        val heights = arrayOf(
            intArrayOf(1, 2, 2),
            intArrayOf(3, 8, 2),
            intArrayOf(5, 3, 5),
        )
        val expected = 2

        assertEquals(expected, PathWithMinimumEffort.minimumEffortPath(heights))
    }

    @Test
    fun test2() {
        val heights = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 8, 4),
            intArrayOf(5, 3, 5),
        )
        val expected = 1

        assertEquals(expected, PathWithMinimumEffort.minimumEffortPath(heights))
    }

    @Test
    fun test3() {
        val heights = arrayOf(
            intArrayOf(1, 2, 1, 1, 1),
            intArrayOf(1, 2, 1, 2, 1),
            intArrayOf(1, 2, 1, 2, 1),
            intArrayOf(1, 2, 1, 2, 1),
            intArrayOf(1, 1, 1, 2, 1),
        )
        val expected = 0

        assertEquals(expected, PathWithMinimumEffort.minimumEffortPath(heights))
    }
}