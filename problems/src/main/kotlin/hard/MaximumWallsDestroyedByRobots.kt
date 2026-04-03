package hard

/**
 * There is an endless straight line populated with some robots and walls.
 * You are given integer arrays robots, distance, and walls:
 * * `robots[i]` is the position of the ith robot.
 * * `distance[i]` is the maximum distance the ith robot's bullet can travel.
 * * `walls[j]` is the position of the jth wall.
 *
 * Every robot has one bullet that can either fire to the left or the right at most `distance[i]` meters.
 *
 * A bullet destroys every wall in its path that lies within its range. Robots are fixed obstacles:\
 * if a bullet hits another robot before reaching a wall, it immediately stops at that robot and cannot continue.
 *
 * Return the maximum number of unique walls that can be destroyed by the robots.
 *
 * Notes:
 * * A wall and a robot may share the same position; the wall can be destroyed by the robot at that position.
 * * Robots are not destroyed by bullets.
 *
 * [URL](https://leetcode.com/problems/maximum-walls-destroyed-by-robots/)
 */
object MaximumWallsDestroyedByRobots {

    fun maxWalls(robots: IntArray, distance: IntArray, walls: IntArray): Int {
        val n = robots.size
        val robotDist = Array(n) { IntArray(2) }
        for (i in 0..<n) {
            robotDist[i][0] = robots[i]
            robotDist[i][1] = distance[i]
        }
        robotDist.sortWith { a: IntArray, b: IntArray -> a[0] - b[0] }
        walls.sort()

        val m = walls.size
        var rightPtr = 0
        var leftPtr = 0
        var curPtr = 0
        var robotPtr = 0

        var prevRight = 0
        var subLeft = 0
        var subRight = 0

        for (i in 0..<n) {
            val robotPos = robotDist[i][0]
            val robotDistVal = robotDist[i][1]

            while (rightPtr < m && walls[rightPtr] <= robotPos) {
                rightPtr++
            }
            val pos1 = rightPtr

            while (curPtr < m && walls[curPtr] < robotPos) {
                curPtr++
            }
            val pos2 = curPtr

            val leftBound = if (i >= 1) {
                maxOf(
                    robotPos - robotDistVal,
                    robotDist[i - 1][0] + 1,
                )
            } else {
                robotPos - robotDistVal
            }
            while (leftPtr < m && walls[leftPtr] < leftBound) {
                leftPtr++
            }
            val leftPos = leftPtr
            val currentLeft = pos1 - leftPos

            val rightBound = if (i < n - 1) {
                minOf(
                    robotPos + robotDistVal,
                    robotDist[i + 1][0] - 1,
                )
            } else {
                robotPos + robotDistVal
            }
            while (rightPtr < m && walls[rightPtr] <= rightBound) {
                rightPtr++
            }
            val rightPos = rightPtr
            val currentRight = rightPos - pos2

            var currentNum = 0
            if (i > 0) {
                while (robotPtr < m && walls[robotPtr] < robotDist[i - 1][0]) {
                    robotPtr++
                }
                val pos3 = robotPtr
                currentNum = pos1 - pos3
            }

            if (i == 0) {
                subLeft = currentLeft
                subRight = currentRight
            } else {
                val newsubLeft = maxOf(
                    subLeft + currentLeft,
                    subRight - prevRight + minOf(currentLeft + prevRight, currentNum),
                )
                val newsubRight = maxOf(
                    subLeft + currentRight,
                    subRight + currentRight,
                )
                subLeft = newsubLeft
                subRight = newsubRight
            }

            prevRight = currentRight
        }

        return maxOf(subLeft, subRight)
    }
}
