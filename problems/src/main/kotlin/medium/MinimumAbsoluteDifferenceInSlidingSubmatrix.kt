package medium

/**
 * You are given an m x n integer matrix grid and an integer k.
 *
 * For every contiguous k x k submatrix of grid,
 * compute the minimum absolute difference between any two distinct values within that submatrix.
 *
 * Return a 2D array ans of size (m - k + 1) x (n - k + 1), where `ans[i][j]` is the minimum absolute difference in the
 * submatrix whose top-left corner is (i, j) in grid.
 *
 * Note: If all elements in the submatrix have the same value, the answer will be 0.
 *
 * A submatrix (x1, y1, x2, y2) is a matrix that is formed by choosing all cells `matrix[x][y]`
 * where x1 <= x <= x2 and y1 <= y <= y2.
 *
 * [URL](https://leetcode.com/problems/minimum-absolute-difference-in-sliding-submatrix/)
 */
object MinimumAbsoluteDifferenceInSlidingSubmatrix {
    fun minAbsDiff(grid: Array<IntArray>, k: Int): Array<IntArray> {
        val rows = grid.size
        val cols = grid[0].size
        val result = Array(rows - k + 1) { IntArray(cols - k + 1) }

        if (k > 1) {
            for (r in 0 .. rows - k) {
                for (c in 0 .. cols - k) {
                    result[r][c] = calculate(grid, r, c, k)
                }
            }
        }

        return result
    }

    private fun calculate(grid: Array<IntArray>, r: Int, c: Int, k: Int): Int {
        val set = HashSet<Int>(k)

        for (i in 0 until k) {
            for (j in 0 until k) {
                set.add(grid[r + i][c + j])
            }
        }
        if (set.size == 1) return 0
        val list = set.sorted()

        var result = Int.MAX_VALUE
        for (i in 0 until list.size - 1) {
            result = minOf(result, Math.abs(list[i + 1] - list[i]))
        }

        return result
    }
}
