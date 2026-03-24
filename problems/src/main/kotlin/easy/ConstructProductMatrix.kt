package easy

/**
 * Given a 0-indexed 2D integer matrix grid of size n * m, we define a 0-indexed 2D matrix p of size n * m
 * as the product matrix of grid if the following condition is met:
 *
 * Each element `p[i][j]` is calculated as the product of all elements in grid except for the element `grid[i][j]`.
 * This product is then taken modulo 12345.
 * Return the product matrix of grid.
 *
 * [URL](https://leetcode.com/problems/construct-product-matrix/)
 */
object ConstructProductMatrix {
    fun constructProductMatrix(grid: Array<IntArray>): Array<IntArray> {
        val MOD = 12345
        val n = grid.size
        val m = grid[0].size
        val p = Array(n) { IntArray(m) }

        var suffix = 1L
        for (i in n - 1 downTo 0) {
            for (j in m - 1 downTo 0) {
                p[i][j] = suffix.toInt()
                suffix = (suffix * grid[i][j]) % MOD
            }
        }

        var prefix = 1L
        for (i in 0..<n) {
            for (j in 0..<m) {
                p[i][j] = ((p[i][j].toLong() * prefix) % MOD).toInt()
                prefix = (prefix * grid[i][j]) % MOD
            }
        }

        return p
    }
}
