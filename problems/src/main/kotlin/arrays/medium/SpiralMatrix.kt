package arrays.medium

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * [URL](https://leetcode.com/problems/spiral-matrix/)
 */
object SpiralMatrix {
    fun spiralOrder(matrix: Array<IntArray>): List<Int>? {
        var startRow = 0
        var endRow = matrix.size - 1
        var startCol = 0
        var endCol = matrix[0].size - 1

        val res = ArrayList<Int>(endRow * endCol)
        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (j in startCol..endCol) {
                res.add(matrix[startRow][j])
            }
            // right
            for (i in startRow + 1..endRow) {
                res.add(matrix[i][endCol])
            }
            // bottom
            for (j in endCol - 1 downTo startCol) {
                if (startRow == endRow) {
                    break
                }
                res.add(matrix[endRow][j])
            }
            // left
            for (i in endRow - 1 downTo startRow + 1) {
                if (startCol == endCol) {
                    break
                }
                res.add(matrix[i][startCol])
            }
            startCol++
            startRow++
            endCol--
            endRow--
        }
        return res
    }
}
