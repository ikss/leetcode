package hard

/**
 * You are given a m x n 2D integer array grid and an integer k. You start at the top-left cell (0, 0) and your goal
 * is to reach the bottom‐right cell (m - 1, n - 1).
 *
 * There are two types of moves available:
 *
 * * Normal move: You can move right or down from your current cell (i, j), i.e. you can move to (i, j + 1) (right) or
 * (i + 1, j) (down). The cost is the value of the destination cell.
 *
 * * Teleportation: You can teleport from any cell (i, j), to any cell (x, y) such that `grid[x][y] <= grid[i][j]`;
 * the cost of this move is 0. You may teleport at most k times.
 *
 * Return the minimum total cost to reach cell (m - 1, n - 1) from (0, 0).
 *
 * [URL](https://leetcode.com/problems/minimum-cost-path-with-teleportations/)
 */
object MinimumCostPathWithTeleportations {

    fun minCost(grid: Array<IntArray>, k: Int): Int {
        val m = grid.size
        val n = grid[0].size
        val points: MutableList<IntArray> = ArrayList()
        for (i in 0..<m) {
            for (j in 0..<n) {
                points.add(intArrayOf(i, j))
            }
        }
        points.sortWith(Comparator.comparingInt { p -> grid[p[0]][p[1]] })
        val costs: Array<IntArray> = Array(m) { IntArray(n) { Int.MAX_VALUE } }
        for (t in 0..k) {
            var minCost = Int.MAX_VALUE
            var i = 0
            var j = 0
            while (i < points.size) {
                minCost = minOf(minCost, costs[points[i][0]][points[i][1]])
                if (i + 1 < points.size && grid[points[i][0]][points[i][1]] == grid[points[i + 1][0]][points[i + 1][1]]) {
                    i++
                    continue
                }
                for (r in j..i) {
                    costs[points[r][0]][points[r][1]] = minCost
                }
                j = i + 1
                i++
            }
            for (i in m - 1 downTo 0) {
                for (j in n - 1 downTo 0) {
                    if (i == m - 1 && j == n - 1) {
                        costs[i][j] = 0
                        continue
                    }
                    if (i != m - 1) {
                        costs[i][j] = minOf(costs[i][j], costs[i + 1][j] + grid[i + 1][j])
                    }
                    if (j != n - 1) {
                        costs[i][j] = minOf(costs[i][j], costs[i][j + 1] + grid[i][j + 1])
                    }
                }
            }
        }
        return costs[0][0]
    }
}
