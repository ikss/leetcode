package medium

/**
 * There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer n,
 * indicating that you must do the following routine for n minutes:
 * * At the first minute, color any arbitrary unit cell blue.
 * * Every minute thereafter, color blue every uncolored cell that touches a blue cell.
 *
 * Below is a pictorial representation of the state of the grid after minutes 1, 2, and 3.
 *
 * [URL](https://leetcode.com/problems/count-total-number-of-colored-cells/)
 */
object CountTotalNumberOfColoredCells {
    fun coloredCellsSimulation(n: Int): Long {
        var res = 1L
        for (i in 1..n) {
            res += (i - 1) * 4
        }
        return res
    }

    fun coloredCellsNumeric(n: Int): Long {
        val result = 2L * n * (n - 1) + 1
        return result
    }
}