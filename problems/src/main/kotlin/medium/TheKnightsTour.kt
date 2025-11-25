package medium

/**
 * Given two positive integers m and n which are the height and width of a 0-indexed 2D-array board,
 * a pair of positive integers (r, c) which is the starting position of the knight on the board.
 *
 * Your task is to find an order of movements for the knight, in a manner that every cell of the board gets visited
 * exactly once (the starting cell is considered visited and you shouldn't visit it again).
 *
 * Return the array board in which the cells' values show the order of visiting the cell starting from 0
 * (the initial place of the knight).
 *
 * Note that a knight can move from cell (r1, c1) to cell (r2, c2) if 0 <= r2 <= m - 1 and 0 <= c2 <= n - 1 and
 * min(abs(r1 - r2), abs(c1 - c2)) = 1 and max(abs(r1 - r2), abs(c1 - c2)) = 2.
 *
 * [URL](https://leetcode.com/problems/the-knights-tour/)
 */
object TheKnightsTour {
    private val moves = listOf(-1 to -2, -1 to 2, 1 to -2, 1 to 2, -2 to -1, -2 to 1, 2 to -1, 2 to 1)

    fun tourOfKnight(m: Int, n: Int, r: Int, c: Int): Array<IntArray> {
        val result = Array(m) { IntArray(n) { -1 } }
        result[r][c] = 0
        dfs(result, r to c, 1, m * n)
        return result
    }

    private fun dfs(board: Array<IntArray>, curr: Pair<Int, Int>, visited: Int, total: Int): Boolean {
        if (visited == total) {
            return true
        }
        val (m, n) = curr
        for ((dm, dn) in moves) {
            val newm = m + dm
            val newn = n + dn
            if (newm in board.indices && newn in board[0].indices && board[newm][newn] == -1) {
                board[newm][newn] = visited
                if (dfs(board, newm to newn, visited + 1, total)) {
                    return true
                }
                board[newm][newn] = -1
            }
        }
        return false
    }
}
