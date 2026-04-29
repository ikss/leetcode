package hard

/**
 * You are given a 2D matrix grid of size n x n. Initially, all cells of the grid are colored white.
 * In one operation, you can select any cell of indices (i, j),
 * and color black all the cells of the jth column starting from the top row down to the ith row.
 *
 * The grid score is the sum of all `grid[i][j]` such that cell (i, j) is white and it has a horizontally adjacent black cell.
 *
 * Return the maximum score that can be achieved after some number of operations.
 *
 * [URL](https://leetcode.com/problems/maximum-score-from-grid-operations/)
 */
object MaximumScoreFromGridOperations {
    fun maximumScore(grid: Array<IntArray>): Long {
        val n = grid[0].size
        if (n == 1) {
            return 0
        }

        val dp = Array(n) { Array(n + 1) { LongArray(n + 1) } }
        val prevMax = Array(n + 1) { LongArray(n + 1) }
        val prevSuffixMax = Array(n + 1) { LongArray(n + 1) }
        val colSum = Array(n) { LongArray(n + 1) }

        for (c in 0..<n) {
            for (r in 1..n) {
                colSum[c][r] = colSum[c][r - 1] + grid[r - 1][c]
            }
        }

        for (i in 1..<n) {
            for (currH in 0..n) {
                for (prevH in 0..n) {
                    if (currH <= prevH) {
                        val extraScore = colSum[i][prevH] - colSum[i][currH]
                        dp[i][currH][prevH] = maxOf(
                            dp[i][currH][prevH],
                            prevSuffixMax[prevH][0] + extraScore
                        )
                    } else {
                        val extraScore = colSum[i - 1][currH] - colSum[i - 1][prevH]
                        dp[i][currH][prevH] = maxOf(
                            dp[i][currH][prevH],
                            maxOf(
                                prevSuffixMax[prevH][currH],
                                prevMax[prevH][currH] + extraScore
                            )
                        )
                    }
                }
            }

            for (currH in 0..n) {
                prevMax[currH][0] = dp[i][currH][0]
                for (prevH in 1..n) {
                    val penalty = if (prevH > currH)
                        (colSum[i][prevH] - colSum[i][currH])
                    else
                        0
                    prevMax[currH][prevH] = maxOf(
                        prevMax[currH][prevH - 1],
                        dp[i][currH][prevH] - penalty
                    )
                }

                prevSuffixMax[currH][n] = dp[i][currH][n]
                for (prevH in n - 1 downTo 0) {
                    prevSuffixMax[currH][prevH] = maxOf(
                        prevSuffixMax[currH][prevH + 1],
                        dp[i][currH][prevH]
                    )
                }
            }
        }

        var result = 0L
        for (k in 0..n) {
            result = maxOf(result, maxOf(dp[n - 1][n][k], dp[n - 1][0][k]))
        }

        return result
    }
}
