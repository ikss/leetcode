package arrays.medium

/**
 * Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
 *
 * [URL](https://leetcode.com/problems/count-square-submatrices-with-all-ones/)
 */
object CountSquareSubmatricesWithAllOnes {
    fun countSquares(matrix: Array<IntArray>): Int {
        var dp = IntArray(matrix[0].size + 1)

        var result = 0

        for (r in matrix.indices) {
            val temp = IntArray(matrix[0].size + 1)
            for (c in matrix[0].indices) {
                if (matrix[r][c] == 0) continue

                temp[c + 1] = minOf(temp[c], dp[c], dp[c + 1]) + 1

                result += temp[c + 1]
            }
            dp = temp
        }

        return result
    }
}
