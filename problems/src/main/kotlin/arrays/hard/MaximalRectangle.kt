package arrays.hard

/**
 * Given a rows x cols binary matrix filled with 0's and 1's,
 * find the largest rectangle containing only 1's and return its area.
 *
 * [URL](https://leetcode.com/problems/maximal-rectangle/)
 */
object MaximalRectangle {
    fun maxRectangle(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty()) return 0

        var result = 0
        val dp = Array(matrix.size) { IntArray(matrix[0].size) }
        
        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                if (matrix[i][j] != '1') continue
                
                dp[i][j] = if (j == 0) 1 else dp[i][j - 1] + 1

                var width = dp[i][j]
                for (k in i downTo 0) {
                    width = minOf(width, dp[k][j])
                    result = maxOf(result, width * (i - k + 1))
                }
            }
        }
        return result
    }
}
