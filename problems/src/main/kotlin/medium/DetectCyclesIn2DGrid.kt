package medium


/**
 * Given a 2D array of characters grid of size m x n,
 * you need to find if there exists any cycle consisting of the same value in grid.
 *
 * A cycle is a path of length 4 or more in the grid that starts and ends at the same cell.
 * From a given cell, you can move to one of the cells adjacent to it - in one of the four directions
 * (up, down, left, or right), if it has the same value of the current cell.
 *
 * Also, you cannot move to the cell that you visited in your last move.
 * For example, the cycle (1, 1) -> (1, 2) -> (1, 1) is invalid because from (1, 2) we visited (1, 1)
 * which was the last visited cell.
 *
 * Return true if any cycle of the same value exists in grid, otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/add-two-numbers/)
 */
object DetectCyclesIn2DGrid {
    fun containsCycle(grid: Array<CharArray>): Boolean {
        val m = grid.size
        val n = grid[0].size
        val uf = UnionFind(m * n)

        for (r in 0..<m) {
            for (c in 0..<n) {
                if (r > 0 && grid[r][c] == grid[r - 1][c]) {
                    if (!uf.union(r * n + c, (r - 1) * n + c)) {
                        return true
                    }
                }
                if (c > 0 && grid[r][c] == grid[r][c - 1]) {
                    if (!uf.union(r * n + c, r * n + c - 1)) {
                        return true
                    }
                }
            }
        }
        return false
    }

    class UnionFind(val n: Int) {
        var parent = IntArray(n) { it }
        var size = IntArray(n) { 1 }
        var setCount = n

        fun find(x: Int): Int {
            if (parent[x] == x) {
                return x
            } else {
                parent[x] = find(parent[x])
            }
            return parent[x]
        }

        fun union(x: Int, y: Int): Boolean {
            val parentX = find(x)
            val parentY = find(y)
            if (parentX == parentY) {
                return false
            }
            var x = parentX
            var y = parentY
            if (size[x] < size[y]) {
                val temp = x
                x = y
                y = temp
            }
            parent[y] = x
            size[x] += size[y]
            --setCount
            return true
        }
    }
}
