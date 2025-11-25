package medium

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * * Each row must contain the digits 1-9 without repetition.
 * * Each column must contain the digits 1-9 without repetition.
 * * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * (URL)(https://leetcode.com/problems/valid-sudoku/)
 */
object ValidSudoku {
    private val uniqSet = setOf('1', '2', '3', '4', '5', '6', '7', '8', '9')

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        return validRows(board)
                && validColumns(board)
                && validNines(board)
    }

    private fun validRows(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            val copySet = HashSet(uniqSet)
            for (j in 0 until 9) {
                if (board[i][j] == '.') continue
                if (!copySet.remove(board[i][j])) return false
            }
        }
        return true
    }

    private fun validColumns(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            val copySet = HashSet(uniqSet)
            for (j in 0 until 9) {
                if (board[j][i] == '.') continue
                if (!copySet.remove(board[j][i])) return false
            }
        }
        return true
    }

    private fun validNines(board: Array<CharArray>): Boolean {
        for (i in 0 until 9 step 3) {
            for (j in 0 until 9 step 3) {
                val copySet = HashSet(uniqSet)
                for (ii in 0 until 3) {
                    for (jj in 0 until 3) {
                        if (board[i + ii][j + jj] == '.') continue
                        if (!copySet.remove(board[i + ii][j + jj])) return false
                    }
                }
            }
        }
        return true
    }
}
