package arrays.easy

/**
 * Given an m x n binary matrix mat, return the number of special positions in mat.
 *
 * A position (i, j) is called special if `mat[i][j] == 1` and all other elements in row i and column j are 0
 * (rows and columns are 0-indexed).
 *
 * [URL](https://leetcode.com/problems/special-positions-in-a-binary-matrix/)
 */
object SpecialPositionsInBinaryMatrix {
    fun numSpecial(mat: Array<IntArray>): Int {
        val rowCount = IntArray(mat.size)
        val colCount = IntArray(mat[0].size)
        for (i in mat.indices) {
            for (j in mat[0].indices) {
                if (mat[i][j] == 1) {
                    rowCount[i]++
                    colCount[j]++
                }
            }
        }

        var result = 0

        for (i in mat.indices) {
            for (j in mat[0].indices) {
                if (mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    result++
                }
            }
        }

        return result
    }
}
