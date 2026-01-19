package medium

/**
 * Given a m x n matrix mat and an integer threshold, return the maximum side-length of a square with a sum less than
 * or equal to threshold or return 0 if there is no such square.
 *
 * [URL](https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/)
 */
object MaximumSideLengthOfSquareWithSumLessThanOrEqualToThreshold {
    fun maxSideLength(mat: Array<IntArray>, threshold: Int): Int {
        val m = mat.size
        val n = mat[0].size

        val prefixGrid = Array(m + 1) { IntArray(n + 1) }
        for (i in 1..m) {
            for (j in 1..n) {
                prefixGrid[i][j] =
                    prefixGrid[i - 1][j] + prefixGrid[i][j - 1] - prefixGrid[i - 1][j - 1] + mat[i - 1][j - 1]
            }
        }
        val maxSize = minOf(m, n)

        for (size in maxSize downTo 1) {
            for (i in 0..m - size) {
                for (j in 0..n - size) {
                    if (isFit(prefixGrid, size, i, j, threshold)) {
                        return size
                    }
                }
            }
        }

        return 0
    }

    private fun isFit(prefixGrid: Array<IntArray>, size: Int, startRow: Int, startCol: Int, threshold: Int): Boolean {
        val sum =
            prefixGrid[startRow + size][startCol + size] - prefixGrid[startRow][startCol + size] - prefixGrid[startRow + size][startCol] +
                    prefixGrid[startRow][startCol]
        return sum <= threshold
    }
}