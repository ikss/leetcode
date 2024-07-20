package arrays.medium

/**
 * You are given two arrays rowSum and colSum of non-negative integers where `rowSum[i]` is the sum of the elements in
 * the ith row and `colSum[j]` is the sum of the elements of the jth column of a 2D matrix. In other words,
 * you do not know the elements of the matrix, but you do know the sums of each row and column.
 *
 * Find any matrix of non-negative integers of size rowSum.length x colSum.length that satisfies the rowSum and colSum
 * requirements.
 *
 * Return a 2D array representing any matrix that fulfills the requirements. It's guaranteed that at least one matrix
 * that fulfills the requirements exists.
 *
 * [URL](https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/)
 */
object FindValidMatrixGivenRowAndColumnSums {
    fun restoreMatrix(rowSum: IntArray, colSum: IntArray): Array<IntArray> {
        val m = rowSum.size
        val n = colSum.size
        val currRowSum = IntArray(m)
        val currColSum = IntArray(n)

        val result = Array(m) { IntArray(n) }

        for (i in result.indices) {
            for (j in result[0].indices) {
                result[i][j] = minOf(rowSum[i] - currRowSum[i], colSum[j] - currColSum[j])

                currRowSum[i] += result[i][j]
                currColSum[j] += result[i][j]
            }
        }

        return result
    }
}
