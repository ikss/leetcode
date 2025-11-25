package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WalkingRobotSimulationTest {
    @Test
    fun test1() {
        val commands = intArrayOf(4, -1, 3)
        val obstacles = emptyArray<IntArray>()
        val expected = 25

        assertEquals(expected, WalkingRobotSimulation.robotSim(commands, obstacles))
    }
    
    @Test
    fun test2() {
        val commands = intArrayOf(4, -1, 4, -2, 4)
        val obstacles = arrayOf(intArrayOf(2, 4))
        val expected = 65

        assertEquals(expected, WalkingRobotSimulation.robotSim(commands, obstacles))
    }
    
    @Test
    fun test3() {
        val commands = intArrayOf(6,-1,-1,6)
        val obstacles = emptyArray<IntArray>()
        val expected = 36

        assertEquals(expected, WalkingRobotSimulation.robotSim(commands, obstacles))
    }
}