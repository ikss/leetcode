package medium

/**
 * You are given a 2D binary array grid. Find a rectangle with horizontal and vertical sides with the smallest area,
 * such that all the 1's in grid lie inside this rectangle.
 *
 * Return the minimum possible area of the rectangle.
 *
 * [URL](https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/)
 */
object FindTheMinimumAreaToCoverAllOnesI {
    fun minimumArea(grid: Array<IntArray>): Int {
        return minimumAreaOne(grid, 0, grid[0].size - 1, 0, grid.size - 1)
    }

    fun minimumAreaOne(grid: Array<IntArray>, minLeft: Int, maxRight: Int, minTop: Int, maxBottom: Int): Int {
        var left = maxRight + 1
        var right = minLeft - 1
        var top = maxBottom + 1
        var bottom = minTop - 1

        for (r in minTop..maxBottom) {
            for (c in minLeft..maxRight) {
                if (grid[r][c] != 1) continue

                left = minOf(left, c)
                right = maxOf(right, c)
                top = minOf(top, r)
                bottom = maxOf(bottom, r)
            }
        }

        return (bottom - top + 1) * (right - left + 1)
    }
}
