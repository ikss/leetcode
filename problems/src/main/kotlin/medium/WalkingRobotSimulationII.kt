package medium

/**
 * A width x height grid is on an XY-plane with the bottom-left cell at (0, 0) and the top-right cell at (width - 1, height - 1).
 * The grid is aligned with the four cardinal directions ("North", "East", "South", and "West").
 * A robot is initially at cell (0, 0) facing direction "East".
 *
 * The robot can be instructed to move for a specific number of steps. For each step, it does the following.
 *
 * 1. Attempts to move forward one cell in the direction it is facing.
 * 2. If the cell the robot is moving to is out of bounds,
 * the robot instead turns 90 degrees counterclockwise and retries the step.
 *
 * After the robot finishes moving the number of steps required, it stops and awaits the next instruction.
 *
 * Implement the Robot class:
 *
 * * Robot(int width, int height) Initializes the width x height grid with the robot at (0, 0) facing "East".
 * * void step(int num) Instructs the robot to move forward num steps.
 * * int[] getPos() Returns the current cell the robot is at, as an array of length 2, `[x, y]`.
 * * String getDir() Returns the current direction of the robot, "North", "East", "South", or "West".
 *
 * [URL](https://leetcode.com/problems/walking-robot-simulation-ii/)
 */
object WalkingRobotSimulationII {
    class Robot(val w: Int, val h: Int) {
        private val width = w - 1
        private val height = h - 1
        private val fullPath = 2 * (width + height)

        enum class Direction(val dx: Int, val dy: Int, val dir: String) {
            EAST(1, 0, "East"),
            NORTH(0, 1, "North"),
            WEST(-1, 0, "West"),
            SOUTH(0,  -1, "South"),
        }

        data class Position(
            val x: Int,
            val y: Int,
            val dir: Direction,
        )

        private var currentPosition = Position(0, 0, Direction.EAST)

        fun step(num: Int) {
            var stepsLeft = num % fullPath
            if (stepsLeft == 0) stepsLeft = fullPath

            while (stepsLeft > 0) {
                val pos = currentPosition
                val (diffx, diffy) = when (pos.dir) {
                   Direction.EAST -> Pair(maxOf(minOf(stepsLeft, width - pos.x), 0), 0)
                   Direction.NORTH -> Pair(0, maxOf(minOf(stepsLeft, height - pos.y), 0))
                   Direction.WEST -> Pair(-minOf(stepsLeft, pos.x), 0)
                   Direction.SOUTH -> Pair(0, -minOf(stepsLeft, pos.y))
                }
                stepsLeft -= Math.abs(diffx + diffy)
                val newDir = if (stepsLeft > 0) Direction.entries[(pos.dir.ordinal + 1) % Direction.entries.size] else pos.dir
                currentPosition = Position(pos.x + diffx, pos.y + diffy, newDir)
            }
        }

        fun getPos(): IntArray {
            return intArrayOf(currentPosition.x, currentPosition.y)
        }

        fun getDir(): String {
            return currentPosition.dir.dir
        }

    }
}
