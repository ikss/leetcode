package medium

/**
 * A k x k magic square is a k x k grid filled with integers such that every row sum, every column sum,
 * and both diagonal sums are all equal. The integers in the magic square do not have to be distinct.
 * Every 1 x 1 grid is trivially a magic square.
 *
 * Given an m x n integer grid, return the size (i.e., the side length k)
 * of the largest magic square that can be found within this grid.
 *
 * [URL](https://leetcode.com/problems/largest-magic-square/)
 */
object LargestMagicSquare {
    fun largestMagicSquare(grid: Array<IntArray>): Int {
        val maxSize = minOf(grid.size, grid[0].size)

        for (size in maxSize downTo 2) {
            for (i in 0..grid.size - size) {
                for (j in 0..grid[0].size - size) {
                    if (isMagic(grid, size, i, j)) {
                        return size
                    }
                }
            }
        }

        return 1
    }

    private fun isMagic(grid: Array<IntArray>, size: Int, startRow: Int, startCol: Int): Boolean {
        if (startRow + size > grid.size || startCol + size > grid[0].size) return false
        var neededSum = 0L

        for (col in startCol until startCol + size) {
            neededSum += grid[startRow][col]
        }

        // check rows
        for (row in startRow until startRow + size) {
            var currSum = 0L
            for (col in startCol until startCol + size) {
                currSum += grid[row][col]
            }

            if (neededSum != currSum) return false
        }


        // check columns
        for (col in startCol until startCol + size) {
            var currSum = 0L
            for (row in startRow until startRow + size) {
                currSum += grid[row][col]
            }

            if (neededSum != currSum) return false
        }

        // check diagonals
        var diag1 = 0L
        var diag2 = 0L

        for (i in 0 until size) {
            diag1 += grid[startRow + i][startCol + i]
            diag2 += grid[startRow + i][startCol + size - i - 1]
        }


        return neededSum == diag1 && neededSum == diag2
    }
}