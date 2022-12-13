package arrays.medium

/**
 * Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
 *
 * A falling path starts at any element in the first row and chooses the element in the next row
 * that is either directly below or diagonally left/right.
 * Specifically, the next element from position (row, col) will be (row + 1, col - 1),
 * (row + 1, col), or (row + 1, col + 1).
 *
 * [URL](https://leetcode.com/problems/minimum-falling-path-sum/)
 */
object MinimumFallingPathSum {
    fun minFallingPathSum(matrix: Array<IntArray>): Int {
        val length = matrix.size

        for (row in 1 until length) {
            val prevRow = matrix[row - 1]
            for (column in matrix[0].indices) {
                matrix[row][column] += minOf(
                    prevRow[maxOf(0, column - 1)],
                    prevRow[column],
                    prevRow[minOf(column + 1, length - 1)]
                )
            }
        }

        return matrix[length - 1].min()
    }
}
