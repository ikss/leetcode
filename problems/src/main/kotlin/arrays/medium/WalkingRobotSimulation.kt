package arrays.medium

/**
 * A robot on an infinite XY-plane starts at point (0, 0) facing north.
 * The robot can receive a sequence of these three possible types of commands:
 * * -2: Turn left 90 degrees.
 * * -1: Turn right 90 degrees.
 * * 1 <= k <= 9: Move forward k units, one unit at a time.
 *
 * Some of the grid squares are obstacles. The ith obstacle is at grid point `obstacles[i] = (xi, yi)`.
 * If the robot runs into an obstacle, then it will instead stay in its current location and move on to the next command.
 *
 * Return the maximum Euclidean distance that the robot ever gets from the origin squared
 * (i.e. if the distance is 5, return 25).
 *
 * [URL](https://leetcode.com/problems/walking-robot-simulation/)
 */
object WalkingRobotSimulation {
    private val directions = listOf(
        0 to 1,   // north
        1 to 0,   // east
        0 to -1,  // south
        -1 to 0,  // west
    )

    fun robotSim(commands: IntArray, obstacles: Array<IntArray>): Int {
        var current = 0 to 0
        var direction = 0
        val n = directions.size

        val obstacleSet = HashSet<Pair<Int, Int>>()

        for ((x, y) in obstacles) {
            obstacleSet.add(x to y)
        }
        var result = 0
        for (command in commands) {
            if (command == -1) {
                direction = (direction + n + 1) % n
                continue
            }
            if (command == -2) {
                direction = (direction + n - 1) % n
                continue
            }
            val (dx, dy) = directions[direction]

            for (step in 1..command) {
                val nextx = current.first + dx
                val nexty = current.second + dy

                if (obstacleSet.contains(nextx to nexty)) break
                current = nextx to nexty
                result = maxOf(result, nextx * nextx + nexty * nexty)
            }
        }

        return result
    }
}
