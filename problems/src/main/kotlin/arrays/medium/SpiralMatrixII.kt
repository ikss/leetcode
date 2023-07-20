package arrays.medium

/**
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.
 *
 * [URL](https://leetcode.com/problems/spiral-matrix-ii/)
 */
object SpiralMatrixII {
    fun generateMatrixNaive(n: Int): Array<IntArray> {
        val result = Array(n) { IntArray(n) }

        var top = 0
        var left = 0

        var bottom = n - 1
        var right = n - 1

        var elem = 1

        while (top <= bottom && left <= right) {
            // top row
            for (row in left..right) {
                result[top][row] = elem++
            }
            top++

            // right column
            for (col in top..bottom) {
                result[col][right] = elem++
            }
            right--

            // bottom row
            for (row in right downTo left) {
                result[bottom][row] = elem++
            }
            bottom--

            // left col
            for (col in bottom downTo top) {
                result[col][left] = elem++
            }
            left++

        }

        return result
    }
}
