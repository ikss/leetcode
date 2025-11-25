package easy

/**
 * You are given an n x n integer matrix grid.
 *
 * Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
 * * `maxLocal[i][j]` is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
 *
 * In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
 *
 * Return the generated matrix.
 *
 * [URL](https://leetcode.com/problems/largest-local-values-in-a-matrix/)
 */
object LargestLocalValuesInMatrix {
    fun largestLocal(grid: Array<IntArray>): Array<IntArray> {
        val m = grid.size
        val n = grid[0].size
        val result = Array(m - 2) { IntArray(n - 2) }

        for (i in 1 until m - 1) {
            for (j in 1 until n - 1) {
                result[i - 1][j - 1] = findMaxAround(i, j, grid)
            }
        }

        return result
    }

    private fun findMaxAround(i: Int, j: Int, grid: Array<IntArray>): Int {
        var result = Int.MIN_VALUE

        for (x in i - 1 .. i + 1) {
            for (y in j - 1 .. j + 1) {
                result = maxOf(result, grid[x][y])
            }
        }

        return result
    }
}
