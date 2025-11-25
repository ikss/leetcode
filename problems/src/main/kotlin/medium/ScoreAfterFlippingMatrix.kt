package medium

/**
 * You are given an m x n binary matrix grid.
 *
 * A move consists of choosing any row or column and toggling each value in that row or column
 * (i.e., changing all 0's to 1's, and all 1's to 0's).
 *
 * Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
 *
 * Return the highest possible score after making any number of moves (including zero moves).
 *
 * [URL](https://leetcode.com/problems/score-after-flipping-matrix/)
 */
object ScoreAfterFlippingMatrix {
    fun matrixScore(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        for (i in 0 until m) {
            if (grid[i][0] != 0) continue
            for (j in 0 until n) {
                grid[i][j] = 1 - grid[i][j]
            }
        }

        for (j in 1 until n) {
            var countZeroes = 0
            for (i in 0 until m) {
                if (grid[i][j] == 0) {
                    countZeroes++
                }
            }
            if (countZeroes * 2 > m) {
                for (i in 0 until m) {
                    grid[i][j] = 1 - grid[i][j]
                }
            }
        }

        var result = 0

        for (i in 0 until m) {
            var mul = 1
            var rowNum = 0
            for (j in n - 1 downTo 0) {
                rowNum += grid[i][j] * mul
                mul *= 2
            }
            result += rowNum
        }

        return result
    }
}
