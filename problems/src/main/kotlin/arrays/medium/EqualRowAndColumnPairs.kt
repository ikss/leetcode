package arrays.medium

/**
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj)
 * such that row ri and column cj are equal.
 *
 * A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 *
 * [URL](https://leetcode.com/problems/equal-row-and-column-pairs/)
 */
object EqualRowAndColumnPairs {
    fun equalPairsNaive(grid: Array<IntArray>): Int {
        var result = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (checkSame(i, j, grid)) {
                    result++
                }
            }
        }
        return result
    }

    private fun checkSame(row: Int, column: Int, grid: Array<IntArray>): Boolean {
        for (i in grid.indices) {
            if (grid[row][i] != grid[i][column]) {
                return false
            }
        }
        return true
    }

    fun equalPairsHashMap(grid: Array<IntArray>): Int {
        var result = 0
        val rows = HashMap<String, Int>()
        for (arr in grid) {
            rows.merge(arr.contentToString(), 1, Integer::sum)
        }

        for (i in grid.indices) {
            val count = rows[getColumn(grid, i)] ?: continue
            result += count
        }
        return result
    }

    private fun getColumn(grid: Array<IntArray>, index: Int): String {
        val column = IntArray(grid.size) { grid[it][index] }
        return column.contentToString()
    }
}
