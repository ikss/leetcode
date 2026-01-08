package medium

/**
 * There is a ball in a maze with empty spaces (represented as 0) and walls (represented as 1).
 * The ball can go through the empty spaces by rolling up, down, left or right, but it won't stop rolling until
 * hitting a wall. When the ball stops, it could choose the next direction.
 *
 * Given the m x n maze, the ball's start position and the destination, where `start = [startrow, startcol]` and
 * `destination = [destinationrow, destinationcol]`, return true if the ball can stop at the destination,
 * otherwise return false.
 *
 * You may assume that the borders of the maze are all walls.
 *
 * [URL](https://leetcode.com/problems/the-maze/)
 */
object TheMaze {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun hasPath(maze: Array<IntArray>, start: IntArray, destination: IntArray): Boolean {
        val visited = HashSet<Pair<Int, Int>>()
        val startPair = start[0] to start[1]
        val destPair = destination[0] to destination[1]
        visited.add(startPair)

        return canReach(maze, startPair, destPair, visited)
    }

    private fun canReach(maze: Array<IntArray>, curr: Pair<Int, Int>, destination: Pair<Int, Int>, visited: HashSet<Pair<Int, Int>>): Boolean {
        if (curr == destination) {
            return true
        }
        for ((dx, dy) in directions) {
            var (currx, curry) = curr

            while (currx + dx in maze.indices && curry + dy in maze[0].indices && maze[currx + dx][curry + dy] == 0) {
                currx += dx
                curry += dy
            }
            if ((currx == curr.first && curry == curr.second) || !visited.add(currx to curry)) {
                continue
            }

            if (canReach(maze, currx to curry, destination, visited)) {
                return true
            }
        }
        return false
    }
}