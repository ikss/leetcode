package arrays.medium

/**
 * You are given a positive integer n, indicating that we initially have an n x n 0-indexed integer matrix mat filled with zeroes.
 *
 * You are also given a 2D integer array query. For each `query[i] = [row1i, col1i, row2i, col2i]`,
 * you should do the following operation:
 *
 * Add 1 to every element in the submatrix with the top left corner (row1i, col1i) and the bottom right corner
 * (row2i, col2i). That is, add 1 to `mat[x][y]` for all row1i <= x <= row2i and col1i <= y <= col2i.
 * Return the matrix mat after performing every query.
 *
 * [URL](https://leetcode.com/problems/increment-submatrices-by-one/)
 */
object IncrementSubmatricesByOne {
    fun rangeAddQueries(n: Int, queries: Array<IntArray>): Array<IntArray> {
        val result = Array(n) { IntArray(n) }
        for ((r1, c1, r2, c2) in queries) {
            for (r in r1..r2) {
                result[r][c1] += 1
                if (c2 < n - 1) {
                    result[r][c2 + 1] -= 1
                }
            }
        }

        for (r in result.indices) {
            for (c in 1 until n) {
                result[r][c] += result[r][c - 1]
            }
        }

        return result
    }

    fun rangeAddQueriesOptimized(n: Int, queries: Array<IntArray>): Array<IntArray> {
        val diffarr = Array(n + 1) { IntArray(n + 1) }
        for ((r1, c1, r2, c2) in queries) {
            diffarr[r1][c1] += 1
            diffarr[r1][c2 + 1] -= 1
            diffarr[r2 + 1][c1] -= 1
            diffarr[r2 + 1][c2 + 1] += 1
        }
        val result = Array(n) { IntArray(n) }
        for (i in 0..<n) {
            for (j in 0..<n) {
                val x1 = if (i == 0) 0 else result[i - 1][j]
                val x2 = if (j == 0) 0 else result[i][j - 1]
                val x3 = if (i == 0 || j == 0) 0 else result[i - 1][j - 1]
                result[i][j] = diffarr[i][j] + x1 + x2 - x3
            }
        }

        return result
    }
}
