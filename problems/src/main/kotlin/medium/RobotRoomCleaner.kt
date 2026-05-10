package medium

/**
 * You are controlling a robot that is located somewhere in a room.
 * The room is modeled as an m x n binary grid where 0 represents a wall and 1 represents an empty slot.
 *
 * The robot starts at an unknown location in the room that is guaranteed to be empty,
 * and you do not have access to the grid, but you can move the robot using the given API Robot.
 *
 * You are tasked to use the robot to clean the entire room (i.e., clean every empty cell in the room).
 * The robot with the four given APIs can move forward, turn left, or turn right. Each turn is 90 degrees.
 *
 * When the robot tries to move into a wall cell, its bumper sensor detects the obstacle,
 * and it stays on the current cell.
 *
 * Design an algorithm to clean the entire room using the following APIs:
 *
 * interface Robot {
 *   // returns true if next cell is open and robot moves into the cell.
 *   // returns false if next cell is obstacle and robot stays on the current cell.
 *   boolean move();
 *
 *   // Robot will stay on the same cell after calling turnLeft/turnRight.
 *   // Each turn will be 90 degrees.
 *   void turnLeft();
 *   void turnRight();
 *
 *   // Clean the current cell.
 *   void clean();
 * }
 * Note that the initial direction of the robot will be facing up.
 * You can assume all four edges of the grid are all surrounded by a wall.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/)
 */
object RobotRoomCleaner {
    interface Robot {
        // returns true if next cell is open and robot moves into the cell.
        // returns false if next cell is obstacle and robot stays on the current cell.
        fun move(): Boolean

        // Robot will stay on the same cell after calling turnLeft/turnRight.
        // Each turn will be 90 degrees.
        fun turnLeft()
        fun turnRight()

        // Clean the current cell.
        fun clean()
    }

    private var directions = listOf(-1 to 0, 0 to 1, 1 to 0, 0 to -1)
    private var visited = HashSet<Pair<Int, Int>>()
    private lateinit var robot: Robot

    fun goBack() {
        robot.turnRight()
        robot.turnRight()
        robot.move()
        robot.turnRight()
        robot.turnRight()
    }

    fun backtrack(row: Int, col: Int, d: Int) {
        visited.add(Pair(row, col))
        robot.clean()
        // going clockwise : 0: 'up', 1: 'right', 2: 'down', 3: 'left'
        for (i in 0..3) {
            val newD = (d + i) % 4
            val newRow = row + directions[newD].first
            val newCol = col + directions[newD].second

            if (!visited.contains(Pair(newRow, newCol)) && robot.move()) {
                backtrack(newRow, newCol, newD)
                goBack()
            }
            // turn the robot following chosen direction : clockwise
            robot.turnRight()
        }
    }

    fun cleanRoom(robot: Robot) {
        this.robot = robot
        backtrack(0, 0, 0)
    }
}
