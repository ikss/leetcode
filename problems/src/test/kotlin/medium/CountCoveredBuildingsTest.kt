package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountCoveredBuildingsTest {
    @Test
    fun test1() {
        val n = 3
        val buildings = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 2),
            intArrayOf(3, 2),
            intArrayOf(2, 1),
            intArrayOf(2, 3),
        )
        val expected = 1

        assertEquals(expected, CountCoveredBuildings.countCoveredBuildings(n, buildings))
    }

    @Test
    fun test2() {
        val n = 3
        val buildings = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 2),
            intArrayOf(2, 1),
            intArrayOf(2, 2),
        )
        val expected = 0

        assertEquals(expected, CountCoveredBuildings.countCoveredBuildings(n, buildings))
    }

    @Test
    fun test3() {
        val n = 5
        val buildings = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(3, 2),
            intArrayOf(3, 3),
            intArrayOf(3, 5),
            intArrayOf(5, 3),
        )
        val expected = 1

        assertEquals(expected, CountCoveredBuildings.countCoveredBuildings(n, buildings))
    }
}