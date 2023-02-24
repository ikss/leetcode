package arrays.medium

/**
 * Given an n x n grid containing only values 0 and 1, where 0 represents water and 1 represents land,
 * find a water cell such that its distance to the nearest land cell is maximized, and return the distance.
 * If no land or water exists in the grid, return -1.
 *
 * The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0) and (x1, y1)
 * is |x0 - x1| + |y0 - y1|.
 *
 * [URL](https://leetcode.com/problems/as-far-from-land-as-possible/)
 */
object AsFarFromLandAsPossible {
    fun maxDistance(grid: Array<IntArray>): Int {
        val n = grid.size
        // Although it's a square matrix, using different variable for readability.

        // Maximum manhattan distance possible + 1.
        val maxDistance = n + n + 1
        val dist = Array(n) { IntArray(n) { maxDistance } }

        // First pass: check for left and top neighbours
        for (i in 0 until n) {
            for (j in 0 until n) {
                // Distance of land cells will be 0.
                if (grid[i][j] == 1) {
                    dist[i][j] = 0
                } else {
                    // Check left and top cell distances if they exist and update the current cell distance.
                    val minTopLeft = minOf(
                        if (i > 0) dist[i - 1][j] + 1 else maxDistance,
                        if (j > 0) dist[i][j - 1] + 1 else maxDistance,
                    )
                    dist[i][j] = minOf(dist[i][j], minTopLeft)
                }
            }
        }

        // Second pass: check for the bottom and right neighbours.
        var ans = Int.MIN_VALUE
        for (i in n - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                // Check the right and bottom cell distances if they exist and update the current cell distance.
                val minBottomRight = minOf(
                    if (i < n - 1) dist[i + 1][j] + 1 else maxDistance,
                    if (j < n - 1) dist[i][j + 1] + 1 else maxDistance,
                )
                dist[i][j] = minOf(dist[i][j], minBottomRight)
                ans = maxOf(ans, dist[i][j])
            }
        }

        // If ans is 0, it means there is no water cell,
        // If ans is MAX_DISTANCE, it implies no land cell.
        return if (ans == 0 || ans == maxDistance) -1 else ans
    }
}
