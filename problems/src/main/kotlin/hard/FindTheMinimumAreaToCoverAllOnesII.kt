package hard

/**
 * You are given a 2D binary array grid. You need to find 3 non-overlapping rectangles having non-zero areas with
 * horizontal and vertical sides such that all the 1's in grid lie inside these rectangles.
 *
 * Return the minimum possible sum of the area of these rectangles.
 *
 * Note that the rectangles are allowed to touch.
 *
 * [URL](https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-ii/)
 */
object FindTheMinimumAreaToCoverAllOnesII {

    fun minimumSum(grid: Array<IntArray>): Int {
        val rgrid = rotate(grid)

        return minOf(solve(grid), solve(rgrid))
    }

    fun minimumAreaOne(grid: Array<IntArray>, minLeft: Int, maxRight: Int, minTop: Int, maxBottom: Int): Int {
        var left = grid.size
        var right = 0
        var top = grid[0].size
        var bottom = 0

        for (r in minLeft..maxRight) {
            for (c in minTop..maxBottom) {
                if (grid[r][c] != 1) continue

                left = minOf(left, c)
                right = maxOf(right, c)
                top = minOf(top, r)
                bottom = maxOf(bottom, r)
            }
        }

        return (bottom - top + 1) * (right - left + 1)
    }

    private fun rotate(vec: Array<IntArray>): Array<IntArray> {
        val n = vec.size
        val m = vec[0].size
        val ret = Array(m) { IntArray(n) }
        for (i in 0..<n) {
            for (j in 0..<m) {
                ret[m - j - 1][i] = vec[i][j]
            }
        }
        return ret
    }

    private fun solve(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        var result = n * m
        run {
            var i = 0
            while (i + 1 < n) {
                var j = 0
                while (j + 1 < m) {
                    result = minOf(
                        result,
                        minimumAreaOne(grid, 0, i, 0, m - 1) +
                                minimumAreaOne(grid, i + 1, n - 1, 0, j) +
                                minimumAreaOne(grid, i + 1, n - 1, j + 1, m - 1)
                    )
                    result = minOf(
                        result,
                        minimumAreaOne(grid, 0, i, 0, j) +
                                minimumAreaOne(grid, 0, i, j + 1, m - 1) +
                                minimumAreaOne(grid, i + 1, n - 1, 0, m - 1)
                    )
                    j++
                }
                i++
            }
        }
        var i = 0
        while (i + 2 < n) {
            var j = i + 1
            while (j + 1 < n) {
                result = minOf(
                    result,
                    minimumAreaOne(grid, 0, i, 0, m - 1) +
                            minimumAreaOne(grid, i + 1, j, 0, m - 1) +
                            minimumAreaOne(grid, j + 1, n - 1, 0, m - 1)
                )
                j++
            }
            i++
        }
        return result
    }
}
