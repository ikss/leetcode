package arrays.medium

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
        var left = Int.MAX_VALUE
        var right = -1
        var top = Int.MAX_VALUE
        var bottom = -1

        for (r in grid.indices) {
            for (c in grid[r].indices) {
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
