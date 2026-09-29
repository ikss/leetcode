package hard

/**
 * A parentheses string is a non-empty string consisting only of '(' and ')'. It is valid if any of the following conditions is true:
 * * It is ().
 * * It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
 * * It can be written as (A), where A is a valid parentheses string.
 *
 * You are given an m x n matrix of parentheses grid. A valid parentheses string path in the grid is a path satisfying
 * all of the following conditions:
 * * The path starts from the upper left cell (0, 0).
 * * The path ends at the bottom-right cell (m - 1, n - 1).
 * * The path only ever moves down or right.
 * * The resulting parentheses string formed by the path is valid.
 *
 * Return true if there exists a valid parentheses string path in the grid. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/)
 */
object CheckIfThereIsAValidParenthesesStringPath {
    fun hasValidPath(grid: Array<CharArray>): Boolean {
        val r = grid.size
        val c = grid[0].size

        if ((r + c) % 2 == 0 || grid[0][0] != '(') {
            return false
        }

        val len = r + c - 1

        val dp = Array(r) { Array(c) { BooleanArray(len + 1) } }
        dp[0][0][1] = true

        for (r in dp.indices) {
            for (c in dp[0].indices) {
                val ch = grid[r][c]
                val i = charToInt(ch)

                if (r == 0 && c == 0) {
                    continue
                }

                for (l in dp[r][c].indices) {
                    if (r > 0) {
                        if (dp[r - 1][c][l] && l + i >= 0) {
                            dp[r][c][l + i] = true
                        }
                    }
                    if (c > 0) {
                        if (dp[r][c - 1][l] && l + i >= 0) {
                            dp[r][c][l + i] = true
                        }
                    }
                }

            }
        }

        return dp[r - 1][c - 1][0]
    }

    private fun charToInt(ch: Char): Int {
        return if (ch == '(') {
            1
        } else {
            -1
        }
    }
}
