package arrays.medium

import java.util.*

/**
 * You are given an m x n grid where each cell can have one of three values:
 *
 *  * 0 representing an empty cell,
 *  * 1 representing a fresh orange, or
 *  * 2 representing a rotten orange.
 *
 * Every minute, any fresh orange that is __4-directionally adjacent__ to a rotten orange becomes rotten.
 *
 * Return the _minimum number of minutes_ that must elapse until no cell has a fresh orange. If this is impossible,
 * return -1.
 *
 * [URL](https://leetcode.com/problems/rotting-oranges/)
 */
object RottenOranges {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val rows: Int = grid.size
        val cols: Int = grid[0].size
        val queue = LinkedList<Pair<Int, Int>>()
        var countFresh = 0
        //Put the position of all rotten oranges in queue
        //count the number of fresh oranges
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (grid[i][j] == 2) {
                    queue.offer(i to j)
                } else if (grid[i][j] == 1) {
                    countFresh++
                }
            }
        }
        //if count of fresh oranges is zero --> return 0
        if (countFresh == 0) return 0
        var count = 0
        val dirs = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
        //bfs starting from initially rotten oranges
        while (!queue.isEmpty()) {
            ++count
            val size: Int = queue.size
            for (i in 0 until size) {
                val point = queue.poll()
                for (dir in dirs) {
                    val x = point.first + dir[0]
                    val y = point.second + dir[1]
                    //if x or y is out of bound
                    //or the orange at (x , y) is already rotten
                    //or the cell at (x , y) is empty
                    //we do nothing
                    if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2) continue
                    //mark the orange at (x , y) as rotten
                    grid[x][y] = 2
                    //put the new rotten orange at (x , y) in queue
                    queue.offer(x to y)
                    //decrease the count of fresh oranges by 1
                    countFresh--
                }
            }
        }
        return if (countFresh == 0) count - 1 else -1
    }
}
