package hard

/**
 * You are given an m x n matrix grid of positive integers. Your task is to determine if it is possible to make either
 * one horizontal or one vertical cut on the grid such that:
 * * Each of the two resulting sections formed by the cut is non-empty.
 * * The sum of elements in both sections is equal, or can be made equal by discounting at most one single cell in total (from either section).
 * * If a cell is discounted, the rest of the section must remain connected.
 *
 * Return true if such a partition exists; otherwise, return false.
 *
 * Note: A section is connected if every cell in it can be reached from any other cell by moving up, down, left,
 * or right through other cells in the section.
 *
 * [URL](https://leetcode.com/problems/equal-sum-grid-partition-ii/)
 */
object EqualSumGridPartitionII {
    fun canPartitionGrid(grid: Array<IntArray>): Boolean {
        var rows = grid.size
        var cols = grid[0].size
        var grid = grid
        var total = 0L
        for (i in 0..<rows) {
            for (j in 0..<cols) {
                total += grid[i][j]
            }
        }
        for (k in 0..3) {
            val exist = HashSet<Long>()
            exist.add(0L)
            var sum: Long = 0
            rows = grid.size
            cols = grid[0].size
            if (rows < 2) {
                grid = rotation(grid)
                continue
            }
            if (cols == 1) {
                for (i in 0..<rows - 1) {
                    sum += grid[i][0]
                    val tag = sum * 2 - total
                    if (tag == 0L || tag == grid[0][0].toLong() || tag == grid[i][0].toLong()) {
                        return true
                    }
                }
                grid = rotation(grid)
                continue
            }
            for (i in 0..<rows - 1) {
                for (j in 0..<cols) {
                    exist.add(grid[i][j].toLong())
                    sum += grid[i][j]
                }
                val tag = sum * 2 - total
                if (i == 0) {
                    if (tag == 0L || tag == grid[0][0].toLong() || tag == grid[0][cols - 1].toLong()) {
                        return true
                    }
                    continue
                }
                if (tag in exist) {
                    return true
                }
            }
            grid = rotation(grid)
        }
        return false
    }

    fun rotation(grid: Array<IntArray>): Array<IntArray> {
        val m = grid.size
        val n = grid[0].size
        val tmp = Array(n) { IntArray(m) }
        for (i in 0..<m) {
            for (j in 0..<n) {
                tmp[j][m - 1 - i] = grid[i][j]
            }
        }
        return tmp
    }
}
