package arrays.easy

/**
 * Given a 2D integer array matrix, return the transpose of matrix.
 *
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 *
 * [URL](https://leetcode.com/problems/transpose-matrix/)
 */
object TransposeMatrix {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val r = matrix.size
        val c = matrix[0].size
        val ans = Array(c) { IntArray(r) }
        for (row in 0 until r) {
            for (col in 0 until c) {
                ans[col][row] = matrix[row][col]
            }
        }
        return ans
    }
}
