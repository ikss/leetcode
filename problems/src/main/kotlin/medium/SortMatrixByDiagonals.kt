package medium

/**
 * You are given an n x n square matrix of integers grid. Return the matrix such that:
 *
 * * The diagonals in the bottom-left triangle (including the middle diagonal) are sorted in non-increasing order.
 * * The diagonals in the top-right triangle are sorted in non-decreasing order.
 *
 * [URL](https://leetcode.com/problems/sort-matrix-by-diagonals/)
 */
object SortMatrixByDiagonals {
    fun sortMatrix(grid: Array<IntArray>): Array<IntArray> {
        val rows = grid.size
        val cols = grid[0].size
        // sort top-right part

        for (start in 1 until cols) {
            var r = 0
            var c = start
            val list = ArrayList<Int>()
            while (c < cols && r < rows) {
                list.add(grid[r][c])
                r++
                c++
            }
            list.sort()
            r = 0
            c = start
            while (c < cols && r < rows) {
                grid[r][c] = list[r]
                r++
                c++
            }
        }

        // sort bottom-left part
        for (start in 0 until rows) {
            var r = start
            var c = 0
            val list = ArrayList<Int>()
            while (c < cols && r < rows) {
                list.add(grid[r][c])
                r++
                c++
            }
            list.sortDescending()
            r = start
            c = 0
            while (c < cols && r < rows) {
                grid[r][c] = list[c]
                r++
                c++
            }
        }


        return grid
    }
}
