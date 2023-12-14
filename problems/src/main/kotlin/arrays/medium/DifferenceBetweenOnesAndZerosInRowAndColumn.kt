package arrays.medium

/**
 * You are given a 0-indexed m x n binary matrix grid.
 *
 * A 0-indexed m x n difference matrix diff is created with the following procedure:
 * * Let the number of ones in the ith row be onesRowi.
 * * Let the number of ones in the jth column be onesColj.
 * * Let the number of zeros in the ith row be zerosRowi.
 * * Let the number of zeros in the jth column be zerosColj.
 * * `diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj`
 *
 * Return the difference matrix diff.
 *
 * [URL](https://leetcode.com/problems/difference-between-ones-and-zeros-in-row-and-column/)
 */
object DifferenceBetweenOnesAndZerosInRowAndColumn {
    fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
        val n = grid.size
        val m = grid[0].size
        val onesRow = IntArray(n)
        val onesCol = IntArray(m)
        val zeroesRow = IntArray(n)
        val zeroesCol = IntArray(m)

        for (i in grid.indices){
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) {
                    onesRow[i]++
                    onesCol[j]++
                } else {
                    zeroesRow[i]++
                    zeroesCol[j]++
                }
            }
        }
        val result = Array(n) { IntArray(m) }

        for (i in grid.indices){
            for (j in grid[0].indices) {
                result[i][j] = onesRow[i] + onesCol[j] - zeroesRow[i] - zeroesCol[j]
            }
        }

        return result
    }
}
