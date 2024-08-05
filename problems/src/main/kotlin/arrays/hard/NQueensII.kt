package arrays.hard

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 *
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 *
 * [URL](https://leetcode.com/problems/n-queens-ii/)
 */
object NQueensII {
    fun totalNQueens(n: Int): Int {
        val state = Array(n) { BooleanArray(n) }
        return backtrack(0, state)
    }

    private fun backtrack(currRow: Int, state: Array<BooleanArray>): Int {
        if (currRow == state.size) return 1
        var result = 0

        for (c in state[currRow].indices) {
            if (validState(currRow, c, state)) {
                state[currRow][c] = true
                result += backtrack(currRow + 1, state)
                state[currRow][c] = false
            }
        }

        return result
    }

    private fun validState(row: Int, col: Int, state: Array<BooleanArray>): Boolean {
        for (r in state[row]) {
            if (r) return false
        }

        for (i in state.indices) {
            if (state[i][col]) return false
        }

        for (i in 1 .. minOf(row, col)) {
            if (state[row - i][col - i]) return false
        }

        for (i in 1 .. minOf(row, state.size - col - 1)) {
            if (state[row - i][col + i]) return false
        }

        return true
    }
}
