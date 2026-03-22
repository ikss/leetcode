package easy

/**
 * Given two n x n binary matrices mat and target,
 * return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)
 */
object DetermineWhetherMatrixCanBeObtainedByRotation {

    fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        val n = mat.size
        // at most 4 rotations
        for (k in 0..3) {
            // rotation operation
            for (i in 0..<n / 2) {
                for (j in 0..<(n + 1) / 2) {
                    val temp = mat[i][j]
                    mat[i][j] = mat[n - 1 - j][i]
                    mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j]
                    mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i]
                    mat[j][n - 1 - i] = temp
                }
            }

            if (isEqual(mat, target)) {
                return true
            }
        }
        return false
    }

    private fun isEqual(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        val n = mat.size
        for (i in 0..<n) {
            for (j in 0..<n) {
                if (mat[i][j] != target[i][j]) {
                    return false
                }
            }
        }
        return true
    }
}