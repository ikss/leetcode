package easy

/**
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
 * return the number of negative numbers in grid.
 *
 * [URL](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
 */
object CountNegativeNumbersInSortedMatrix {
    fun countNegatives(grid: Array<IntArray>): Int {
        val n = grid[0].size

        var currRowNegativeIndex = n - 1
        var result = 0

        for (row in grid) {
            while (currRowNegativeIndex >= 0 && row[currRowNegativeIndex] < 0) {
                currRowNegativeIndex--
            }
            result += n - (currRowNegativeIndex + 1)
        }

        return result
    }
}
