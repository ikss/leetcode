package medium

/**
 * Given a 2D character matrix grid, where `grid[i][j]` is either 'X', 'Y', or '.',
 * return the number of submatrices that contain:
 * * grid[0][0]
 * * an equal frequency of 'X' and 'Y'.
 * * at least one 'X'.
 *
 * [URL](https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y/)
 */
object CountSubmatricesWithEqualFrequencyOfXAndY {
    fun numberOfSubmatrices(grid: Array<CharArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var result = 0

        val sumx = IntArray(cols)
        val sumy = IntArray(cols)

        for (r in grid.indices) {
            var rx = 0
            var ry = 0

            for (c in grid[0].indices) {
                if (grid[r][c] == 'X') {
                    rx++
                } else if (grid[r][c] == 'Y') {
                    ry++
                }

                sumx[c] += rx
                sumy[c] += ry

                if (sumx[c] > 0 && sumx[c] == sumy[c]) {
                    result++
                }
            }
        }
        return result
    }
}
