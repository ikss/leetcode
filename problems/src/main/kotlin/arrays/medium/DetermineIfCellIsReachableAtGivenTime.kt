package arrays.medium

/**
 * You are given four integers sx, sy, fx, fy, and a non-negative integer t.
 *
 * In an infinite 2D grid, you start at the cell (sx, sy). Each second, you must move to any of its adjacent cells.
 *
 * Return true if you can reach cell (fx, fy) after exactly t seconds, or false otherwise.
 *
 * A cell's adjacent cells are the 8 cells around it that share at least one corner with it.
 * You can visit the same cell several times.
 *
 * [URL](https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/)
 */
object DetermineIfCellIsReachableAtGivenTime {
    fun isReachableAtTime(sx: Int, sy: Int, fx: Int, fy: Int, t: Int): Boolean {
        val dx = Math.abs(sx - fx)
        val dy = Math.abs(sy - fy)

        if (dx == 0 && dy == 0) {
            return t != 1
        }

        return t >= maxOf(dx, dy)
    }
}
