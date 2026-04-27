package medium

/**
 * You are given an m x n grid. Each cell of grid represents a street. The street of grid[i][j] can be:
 *
 * * 1 which means a street connecting the left cell and the right cell.
 * * 2 which means a street connecting the upper cell and the lower cell.
 * * 3 which means a street connecting the left cell and the lower cell.
 * * 4 which means a street connecting the right cell and the lower cell.
 * * 5 which means a street connecting the left cell and the upper cell.
 * * 6 which means a street connecting the right cell and the upper cell.
 *
 * You will initially start at the street of the upper-left cell (0, 0).
 * A valid path in the grid is a path that starts from the upper left cell (0, 0) and ends at the bottom-right cell
 * (m - 1, n - 1). The path should only follow the streets.
 *
 * Notice that you are not allowed to change any street.
 *
 * Return true if there is a valid path in the grid or false otherwise.
 *
 * [URL](https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/)
 */
object CheckIfThereIsValidPathInGrid {

    fun hasValidPath(grid: Array<IntArray>): Boolean {
        val n = grid.size
        val m = grid[0].size

        val uf = UnionFind(n * m)

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                val road = grid[r][c]

                when (road) {
                    1 -> {
                        if (c > 0 && grid[r][c-1] in setOf(1,4,6)) uf.union(getIndex(r, c, m), getIndex(r, c - 1, m)) //left
                        if (c < m - 1 && grid[r][c+1] in setOf(1,3,5)) uf.union(getIndex(r, c, m), getIndex(r, c + 1, m)) //right
                    }
                    2 -> {
                        if (r > 0 && grid[r-1][c] in setOf(2,3,4)) uf.union(getIndex(r, c, m), getIndex(r - 1, c, m)) //top
                        if (r < n - 1 && grid[r+1][c] in setOf(2,5,6)) uf.union(getIndex(r, c, m), getIndex(r + 1, c, m)) //bottom
                    }
                    3 -> {
                        if (c > 0 && grid[r][c-1] in setOf(1,4,6)) uf.union(getIndex(r, c, m), getIndex(r, c - 1, m)) //left
                        if (r < n - 1 && grid[r+1][c] in setOf(2,5,6)) uf.union(getIndex(r, c, m), getIndex(r + 1, c, m)) //bottom
                    }
                    4 -> {
                        if (c < m - 1 && grid[r][c+1] in setOf(1,3,5)) uf.union(getIndex(r, c, m), getIndex(r, c + 1, m)) //right
                        if (r < n - 1 && grid[r+1][c] in setOf(2,5,6)) uf.union(getIndex(r, c, m), getIndex(r + 1, c, m)) //bottom
                    }
                    5 -> {
                        if (r > 0 && grid[r-1][c] in setOf(2,3,4)) uf.union(getIndex(r, c, m), getIndex(r - 1, c, m)) //top
                        if (c > 0 && grid[r][c-1] in setOf(1,4,6)) uf.union(getIndex(r, c, m), getIndex(r, c - 1, m)) //left
                    }
                    6 -> {
                        if (r > 0 && grid[r-1][c] in setOf(2,3,4)) uf.union(getIndex(r, c, m), getIndex(r - 1, c, m)) //top
                        if (c < m - 1 && grid[r][c+1] in setOf(1,3,5)) uf.union(getIndex(r, c, m), getIndex(r, c + 1, m)) //right
                    }
                }
            }
        }

        return uf.find(0) == uf.find(m * n - 1)
    }

    private fun getIndex(row: Int, col: Int, m: Int): Int {
        return row * m + col
    }

    private class UnionFind(val n: Int) {
        val parent = IntArray(n) { it }
        val rank = IntArray(n) { 1 }

        fun union(n1: Int, n2: Int): Boolean {
            var p1 = find(n1)
            var p2 = find(n2)
            if (p1 == p2) {
                return false
            }
            if (rank[p1] < rank[p2]) {
                val temp = p1
                p1 = p2
                p2 = temp
            }

            rank[p1] += rank[p2]
            parent[p2] = p1

            return true
        }

        fun find(n: Int): Int {
            if (parent[n] == n) {
                return n
            } else {
                parent[n] = find(parent[n])
            }
            return parent[n]
        }
    }
}