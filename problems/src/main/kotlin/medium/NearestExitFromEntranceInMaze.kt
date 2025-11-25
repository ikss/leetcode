package medium

/**
 * You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+').
 * You are also given the entrance of the maze, where `entrance = [entrancerow, entrancecol]` denotes the row and column
 * of the cell you are initially standing at.
 *
 * In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall,
 * and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance.
 * An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.
 *
 * Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.
 *
 * [URL](https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/)
 */
object NearestExitFromEntranceInMaze {

    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        var steps = 0
        val (er, ec) = entrance
        queue.offer(er to ec)

        while (queue.isNotEmpty()) {
            repeat(queue.size) {
                val (r, c) = queue.poll()
                if (maze[r][c] == '+') return@repeat
                maze[r][c] = '+'

                if (((r == 0 || r == maze.size - 1) || (c == 0 || c == maze[0].size - 1)) && (c != ec || r != er)) {
                    return steps
                }

                if (r - 1 >= 0) queue.offer(r - 1 to c)
                if (c - 1 >= 0) queue.offer(r to c - 1)
                if (r + 1 < maze.size) queue.offer(r + 1 to c)
                if (c + 1 < maze[0].size) queue.offer(r to c + 1)
            }
            steps++
        }
        return -1
    }
}
