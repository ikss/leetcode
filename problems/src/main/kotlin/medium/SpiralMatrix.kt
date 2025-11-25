package medium

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * [URL](https://leetcode.com/problems/spiral-matrix/)
 */
object SpiralMatrix {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var top = 0
        var bottom = matrix.size

        var left = 0
        var right = matrix[0].size

        val res = ArrayList<Int>(right * bottom)
        while (top < right && left < bottom) {
            // top
            for (col in left until right) {
                res.add(matrix[top][col])
            }
            top++

            // right
            for (row in top until bottom) {
                res.add(matrix[row][right - 1])
            }
            right--

            if (left >= right || top >= bottom) break

            // bottom
            for (col in right - 1 downTo left) {
                res.add(matrix[bottom - 1][col])
            }
            bottom--

            // left
            for (row in bottom - 1 downTo top) {
                res.add(matrix[row][left])
            }
            left++
        }
        return res
    }
}
