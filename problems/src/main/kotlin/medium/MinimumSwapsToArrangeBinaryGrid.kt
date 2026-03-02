package medium


/**
 * Given an n x n binary grid, in one step you can choose two adjacent rows of the grid and swap them.
 *
 * A grid is said to be valid if all the cells above the main diagonal are zeros.
 *
 * Return the minimum number of steps needed to make the grid valid, or -1 if the grid cannot be valid.
 *
 * The main diagonal of a grid is the diagonal that starts at cell (1, 1) and ends at cell (n, n).
 *
 * [URL](https://leetcode.com/problems/minimum-swaps-to-arrange-a-binary-grid/)
 */
object MinimumSwapsToArrangeBinaryGrid {
    fun minSwaps(grid: Array<IntArray>): Int {
        val n: Int = grid.size
        val pos = IntArray(n) { -1 }
        for (i in 0..<n) {
            for (j in n - 1 downTo 0) {
                if (grid[i][j] == 1) {
                    pos[i] = j
                    break
                }
            }
        }
        var result = 0
        for (i in 0..<n) {
            var k = -1
            for (j in i..<n) {
                if (pos[j] <= i) {
                    result += j - i
                    k = j
                    break
                }
            }
            if (k < 0) {
                return -1
            }
            for (j in k downTo i + 1) {
                val temp = pos[j]
                pos[j] = pos[j - 1]
                pos[j - 1] = temp
            }
        }
        return result
    }
}
