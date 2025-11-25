package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTotalNumberOfColoredCellsTest {
    @Test
    fun test1Simulation() {
        val n = 1
        val expected = 1L

        assertEquals(expected, CountTotalNumberOfColoredCells.coloredCellsSimulation(n))
    }

    @Test
    fun test2Simulation() {
        val n = 2
        val expected = 5L

        assertEquals(expected, CountTotalNumberOfColoredCells.coloredCellsSimulation(n))
    }

    @Test
    fun test1Numeric() {
        val n = 1
        val expected = 1L

        assertEquals(expected, CountTotalNumberOfColoredCells.coloredCellsNumeric(n))
    }

    @Test
    fun test2Numeric() {
        val n = 2
        val expected = 5L

        assertEquals(expected, CountTotalNumberOfColoredCells.coloredCellsNumeric(n))
    }
}