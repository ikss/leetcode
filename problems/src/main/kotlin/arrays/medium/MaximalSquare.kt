package arrays.medium

/**
 * Given an m x n binary matrix filled with 0's and 1's,
 * find the largest square containing only 1's and return its area.
 *
 * [URL](https://leetcode.com/problems/maximal-square/)
 */
object MaximalSquare {
    fun maximalSquareDp(matrix: Array<CharArray>): Int {
        val m = matrix.size
        val n = matrix[0].size
        val dp = Array(m + 1) { IntArray(n + 1) }
        var max = 0

        for (i in 1..m) {
            for (j in 1..n) {
                if (matrix[i - 1][j - 1] == '0') continue
                dp[i][j] = minOf(dp[i - 1][j], dp[i - 1][j - 1], dp[i][j - 1]) + 1
                max = maxOf(max, dp[i][j])
            }
        }
        return max * max
    }

    fun maximalSquareOptimizedDp(matrix: Array<CharArray>): Int {
        val m = matrix.size
        val n = matrix[0].size
        var dp = IntArray(n + 1)
        var max = 0

        for (i in 1..m) {
            val tmpDp = IntArray(n + 1)
            for (j in 1..n) {
                if (matrix[i - 1][j - 1] == '0') continue
                tmpDp[j] = minOf(dp[j - 1], dp[j], tmpDp[j - 1]) + 1
                max = maxOf(max, tmpDp[j])
            }
            dp = tmpDp
        }
        return max * max
    }

}