package medium

/**
 * A row-sorted binary matrix means that all elements are 0 or 1 and each row of the matrix is sorted in non-decreasing order.
 *
 * Given a row-sorted binary matrix binaryMatrix, return the index (0-indexed) of the leftmost column with a 1 in it.
 * If such an index does not exist, return -1.
 *
 * You can't access the Binary Matrix directly. You may only access the matrix using a BinaryMatrix interface:
 * * BinaryMatrix.get(row, col) returns the element of the matrix at index (row, col) (0-indexed).
 * * BinaryMatrix.dimensions() returns the dimensions of the matrix as a list of 2 elements [rows, cols],
 * which means the matrix is rows x cols.
 *
 * Submissions making more than 1000 calls to BinaryMatrix.get will be judged Wrong Answer.
 * Also, any solutions that attempt to circumvent the judge will result in disqualification.
 *
 * For custom testing purposes, the input will be the entire binary matrix mat.
 * You will not have access to the binary matrix directly.
 *
 * [URL](https://leetcode.com/problems/leftmost-column-with-at-least-a-one/)
 */
object LeftmostColumnWithAtLeastOne {
    fun leftMostColumnWithOne(binaryMatrix: BinaryMatrix): Int {
        val (rows, cols) = binaryMatrix.dimensions()
        var leftmost = cols

        for (r in 0 until rows) {
            val index = binarySearch(binaryMatrix, r, 0, leftmost)
            if (index != -1) {
                leftmost = minOf(leftmost, index)
            }
        }

        return if (leftmost == cols) -1 else leftmost
    }

    private fun binarySearch(binaryMatrix: BinaryMatrix, row: Int, from: Int, to: Int): Int {
        var l = from
        var r = to - 1

        if (binaryMatrix.get(row, r) == 0) {
            return -1
        }
        while (l <= r) {
            if (binaryMatrix.get(row, l) == 1) {
                return l
            }
            val mid = (r - l) / 2 + l
            if (binaryMatrix.get(row, mid) == 0) {
                l = mid + 1
            } else {
                r = mid
            }
        }
        return l
    }

    class BinaryMatrix(private val matrix: Array<IntArray>) {
        fun get(row: Int, col: Int): Int = matrix[row][col]
        fun dimensions(): List<Int> = listOf(matrix.size, matrix[0].size)
    }
}
