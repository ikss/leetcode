package hard

/**
 * Given an n x n integer matrix grid, return the minimum sum of a falling path with non-zero shifts.
 *
 * A falling path with non-zero shifts is a choice of exactly one element from each row of grid
 * such that no two elements chosen in adjacent rows are in the same column.
 *
 * [URL](https://leetcode.com/problems/minimum-falling-path-sum-ii/)
 */
object MinimumFallingPathSumII {
    fun minFallingPathSum(matrix: Array<IntArray>): Int {
        val length = matrix.size

        for (row in 1 until length) {
            val prevRow = matrix[row - 1]
            for (column in matrix[0].indices) {
                var min = Int.MAX_VALUE
                for (validColumn in matrix[row].indices) {
                    if (validColumn == column) continue
                    min = minOf(min, prevRow[validColumn])
                }
                matrix[row][column] += min
            }
        }

        return matrix[length - 1].min()
    }
}