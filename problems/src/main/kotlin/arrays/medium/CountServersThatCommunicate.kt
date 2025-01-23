package arrays.medium

/**
 * You are given a map of a server center, represented as a m * n integer matrix grid, where 1 means that on that cell
 * there is a server and 0 means that it is no server.
 * Two servers are said to communicate if they are on the same row or on the same column.
 *
 * Return the number of servers that communicate with any other server.
 *
 * [URL](https://leetcode.com/problems/count-servers-that-communicate/)
 */
object CountServersThatCommunicate {
    fun countServers(grid: Array<IntArray>): Int {
        var rows = IntArray(grid.size)
        var cols = IntArray(grid[0].size)

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] == 1) {
                    cols[c]++
                    rows[r]++
                }
            }
        }

        var result = 0


        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] == 1) {
                    if (cols[c] > 1 || rows[r] > 1) {
                        result++
                    }
                }
            }
        }

        return result
    }
}
