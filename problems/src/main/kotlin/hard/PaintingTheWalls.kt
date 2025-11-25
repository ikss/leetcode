package hard

/**
 * You are given two 0-indexed integer arrays, cost and time, of size n representing the costs and the time taken
 * to paint n different walls respectively. There are two painters available:
 *
 * A paid painter that paints the ith wall in `time[i]` units of time and takes `cost[i]` units of money.
 * A free painter that paints any wall in 1 unit of time at a cost of 0. But the free painter can only be used
 * if the paid painter is already occupied.
 * Return the minimum amount of money required to paint the n walls.
 *
 * [URL](https://leetcode.com/problems/painting-the-walls/)
 */
object PaintingTheWalls {
    fun paintWalls(cost: IntArray, time: IntArray): Int {
        val n = cost.size
        val dp = Array(n + 1) { IntArray(n + 1) }

        for (i in 1..n) {
            dp[n][i] = 1e9.toInt()
        }

        for (i in n - 1 downTo 0) {
            for (remain in 1..n) {
                val paint = cost[i] + dp[i + 1][maxOf(0, remain - 1 - time[i])]
                val dontPaint = dp[i + 1][remain]
                dp[i][remain] = minOf(paint, dontPaint)
            }
        }

        return dp[0][n]
    }
}
