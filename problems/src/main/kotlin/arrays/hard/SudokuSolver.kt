package arrays.hard

/**
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 *
 * A sudoku solution must satisfy all of the following rules:
 *
 * 1. Each of the digits 1-9 must occur exactly once in each row.
 * 2. Each of the digits 1-9 must occur exactly once in each column.
 * 3. Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
 * The '.' character indicates empty cells.
 *
 * [URL](https://leetcode.com/problems/sudoku-solver/)
 */
object SudokuSolver {
    private val uniqSet = setOf('1', '2', '3', '4', '5', '6', '7', '8', '9')

    fun solveSudoku(board: Array<CharArray>) {
        backtrack(0, 0, board)
    }

    fun backtrack(i: Int, j: Int, board: Array<CharArray>): Boolean {
        if (i == 9) return true
        if (j == 9) return backtrack(i + 1, 0, board)
        if (board[i][j] != '.') return backtrack(i, j + 1, board)

        for (c in '1'..'9') {
            board[i][j] = c
            if (isValidSudoku(board) && backtrack(i, j + 1, board)) return true
            board[i][j] = '.'
        }
        return false
    }


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
