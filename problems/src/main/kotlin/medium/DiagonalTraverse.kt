package medium

/**
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 *
 * [URL](https://leetcode.com/problems/diagonal-traverse/)
 */
object DiagonalTraverse {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        var direction = 1

        val result = IntArray(mat.size * mat[0].size)
        var curri = 0
        var curRow = 1
        var curCol = -1
        while (curri < result.size) {
            if (curRow in mat.indices && curCol in mat[0].indices) {
                curRow -= direction
                curCol += direction
            } else {
                while (curRow !in mat.indices || curCol !in mat[0].indices) {
                    curRow -= direction
                    curCol += direction
                }
            }

            if (curCol !in mat[0].indices) {
                curRow += 1
                direction = -direction
                continue
            }

            if (curRow !in mat.indices) {
                curCol += 1
                direction = -direction
                continue
            }

            result[curri++] = mat[curRow][curCol]
        }

        return result
    }
}