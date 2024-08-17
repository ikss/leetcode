package arrays.medium

/**
 * You are given an m x n integer matrix points (0-indexed). Starting with 0 points, you want to maximize the number of
 * points you can get from the matrix.
 *
 * To gain points, you must pick one cell in each row. Picking the cell at coordinates (r, c) will add `points[r][c]`
 * to your score.
 *
 * However, you will lose points if you pick a cell too far from the cell that you picked in the previous row.
 * For every two adjacent rows r and r + 1 (where 0 <= r < m - 1), picking cells at coordinates (r, c1) and (r + 1, c2)
 * will subtract abs(c1 - c2) from your score.
 *
 * Return the maximum number of points you can achieve.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-points-with-cost/)
 */
object MaximumNumberOfPointsWithCost {
    fun maxPointsSimpleDp(points: Array<IntArray>): Long {
        val m = points.size
        val n = points[0].size
        var dp = LongArray(n)

        for (c in points[0].indices) {
            dp[c] = points[0][c].toLong()
        }

        for (r in 1 until m) {
            val newdp = LongArray(n)
            for (c in 0 until n) {
                for (cprev in 0 until n) {
                    newdp[c] = maxOf(newdp[c], dp[cprev] + points[r][c] - Math.abs(c - cprev))
                }
            }
            dp = newdp
        }
        return dp.max()
    }

    fun maxPointsLeftRightMaxDp(points: Array<IntArray>): Long {
        val cols = points[0].size
        val currRow = LongArray(cols)
        var prevRow = LongArray(cols)

        for (row in points) {
            var runningMax = 0L

            // Left to right pass
            for (col in 0 until cols) {
                runningMax = maxOf(runningMax - 1, prevRow[col])
                currRow[col] = runningMax
            }

            runningMax = 0
            // Right to left pass
            for (col in cols - 1 downTo 0) {
                runningMax = maxOf(runningMax - 1, prevRow[col])
                currRow[col] = maxOf(currRow[col], runningMax) + row[col]
            }

            prevRow = currRow
        }

        return prevRow.max()
    }
}
