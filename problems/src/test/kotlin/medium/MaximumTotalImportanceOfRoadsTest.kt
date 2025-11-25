package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumTotalImportanceOfRoadsTest {
    @Test
    fun test1() {
        val n = 5
        val roads = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(0, 2),
            intArrayOf(1, 3),
            intArrayOf(2, 4),
        )
        val expected = 43L

        assertEquals(expected, MaximumTotalImportanceOfRoads.maximumImportance(n, roads))
    }

    @Test
    fun test2() {
        val n = 5
        val roads = arrayOf(
            intArrayOf(0, 3),
            intArrayOf(2, 4),
            intArrayOf(1, 3),
        )
        val expected = 20L

        assertEquals(expected, MaximumTotalImportanceOfRoads.maximumImportance(n, roads))
    }
}