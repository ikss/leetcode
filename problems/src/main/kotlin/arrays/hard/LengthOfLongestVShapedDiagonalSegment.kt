package arrays.hard

/**
 * You are given a 2D integer matrix grid of size n x m, where each element is either 0, 1, or 2.
 *
 * A V-shaped diagonal segment is defined as:
 *
 * * The segment starts with 1.
 * * The subsequent elements follow this infinite sequence: 2, 0, 2, 0, ....
 * * The segment:
 *     * Starts along a diagonal direction (top-left to bottom-right, bottom-right to top-left, top-right to bottom-left,
 * or bottom-left to top-right).
 *     * Continues the sequence in the same diagonal direction.
 *
 * Makes at most one clockwise 90-degree turn to another diagonal direction while maintaining the sequence.
 *
 * Return the length of the longest V-shaped diagonal segment. If no valid segment exists, return 0.
 *
 * [URL](https://leetcode.com/problems/length-of-longest-v-shaped-diagonal-segment/)
 */
object LengthOfLongestVShapedDiagonalSegment {

    private val dirs = arrayOf(
        intArrayOf(1, 1),
        intArrayOf(1, -1),
        intArrayOf(-1, -1),
        intArrayOf(-1, 1),
    )

    fun lenOfVDiagonal(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val memo = Array(grid.size) { Array(grid[0].size) { Array(4) { IntArray(2) { -1 } } } }

        var res = 0
        for (i in 0..<m) {
            for (j in 0..<n) {
                if (grid[i][j] == 1) {
                    for (direction in 0..3) {
                        res = maxOf(res, dfs(grid, memo, i, j, direction, true, 2) + 1)
                    }
                }
            }
        }
        return res
    }

    private fun dfs(
        grid: Array<IntArray>,
        memo: Array<Array<Array<IntArray>>>,
        cx: Int,
        cy: Int,
        direction: Int,
        turn: Boolean,
        target: Int,
    ): Int {
        val m = grid.size
        val n = grid[0].size
        val nx = cx + dirs[direction][0]
        val ny = cy + dirs[direction][1]
        /* If it goes beyond the boundary or the next node's value is not the target value, then return */
        if (nx !in 0..m || ny !in 0..n || grid[nx][ny] != target) {
            return 0
        }

        val turnInt = if (turn) 1 else 0
        if (memo[nx][ny][direction][turnInt] != -1) {
            return memo[nx][ny][direction][turnInt]
        }

        /* Continue walking in the original direction. */
        var maxStep = dfs(grid, memo, nx, ny, direction, turn, 2 - target)
        if (turn) {
            /* Clockwise rotate 90 degrees turn */
            maxStep = maxOf(
                maxStep,
                dfs(grid, memo, nx, ny, (direction + 1) % 4, false, 2 - target)
            )
        }
        memo[nx][ny][direction][turnInt] = maxStep + 1
        return maxStep + 1
    }
}
