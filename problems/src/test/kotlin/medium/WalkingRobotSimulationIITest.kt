package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WalkingRobotSimulationIITest {
    @Test
    fun test1() {
        val width = 6
        val height = 3
        val robot = WalkingRobotSimulationII.Robot(width, height)
        robot.step(2)
        robot.step(2)
        assertArrayEquals(intArrayOf(4, 0), robot.getPos())
        assertEquals(WalkingRobotSimulationII.Robot.Direction.EAST.dir, robot.getDir())
        robot.step(2)
        robot.step(1)
        robot.step(4)
        assertArrayEquals(intArrayOf(1, 2), robot.getPos())
        assertEquals(WalkingRobotSimulationII.Robot.Direction.WEST.dir, robot.getDir())
    }

    @Test
    fun test2() {
        val width = 20
        val height = 13
        val robot = WalkingRobotSimulationII.Robot(width, height)
        robot.step(12)
        robot.step(21)
        assertArrayEquals(intArrayOf(17, 12), robot.getPos())
        assertEquals(WalkingRobotSimulationII.Robot.Direction.WEST.dir, robot.getDir())
        robot.step(17)
        assertArrayEquals(intArrayOf(0, 12), robot.getPos())
        assertEquals(WalkingRobotSimulationII.Robot.Direction.WEST.dir, robot.getDir())
        assertArrayEquals(intArrayOf(0, 12), robot.getPos())
        assertEquals(WalkingRobotSimulationII.Robot.Direction.WEST.dir, robot.getDir())
    }
}