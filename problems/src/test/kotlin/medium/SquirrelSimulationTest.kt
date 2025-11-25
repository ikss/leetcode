package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SquirrelSimulationTest {
    @Test
    fun test1() {
        val height = 5
        val width = 7
        val tree = intArrayOf(2, 2)
        val squirrel = intArrayOf(4, 4)
        val nuts = arrayOf(intArrayOf(3, 0), intArrayOf(2, 5))
        val expected = 12

        assertEquals(expected, SquirrelSimulation.minDistance(height, width, tree, squirrel, nuts))
    }

    @Test
    fun test2() {
        val height = 1
        val width = 3
        val tree = intArrayOf(0, 1)
        val squirrel = intArrayOf(0, 0)
        val nuts = arrayOf(intArrayOf(0, 2))
        val expected = 3

        assertEquals(expected, SquirrelSimulation.minDistance(height, width, tree, squirrel, nuts))
    }
}