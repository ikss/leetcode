package arrays.medium

/**
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column,
 * and both diagonals all have the same sum.
 *
 * Given a row x col grid of integers, how many 3 x 3 contiguous magic square subgrids are there?
 *
 * Note: while a magic square can only contain numbers from 1 to 9, grid may contain numbers up to 15.
 *
 * [URL](https://leetcode.com/problems/magic-squares-in-grid/)
 */
object MagicSquaresInGrid {
    fun numMagicSquaresInside(grid: Array<IntArray>): Int {
        var result = 0
        for (r in 1 until grid.size - 1) {
            for (c in 1 until grid[0].size - 1) {
                if (isMagic(r, c, grid)) result++
            }
        }

        return result
    }

    private fun isMagic(rCenter: Int, cCenter: Int, grid: Array<IntArray>): Boolean {
        val checksum = grid[rCenter - 1][cCenter - 1] + grid[rCenter][cCenter] + grid[rCenter + 1][cCenter + 1]
        val set = HashSet<Int>(9)

        // second disagonal
        if  (checksum != (grid[rCenter - 1][cCenter + 1] + grid[rCenter][cCenter] + grid[rCenter + 1][cCenter - 1])) {
            return false
        }

        // rows sum
        for (i in rCenter - 1 .. rCenter + 1) {
            var sum = 0
            for (j in cCenter - 1 .. cCenter + 1) {
                val num = grid[i][j]
                if (num == 0 || num > 9 || !set.add(num)) return false
                sum += num
            }
            if (sum != checksum) return false
        }
        // cols sum
        for (j in cCenter - 1 .. cCenter + 1) {
            var sum = 0
            for (i in rCenter - 1 .. rCenter + 1) {
                sum += grid[i][j]
            }
            if (sum != checksum) return false
        }

        return true
    }
}
