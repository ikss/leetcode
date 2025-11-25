package hard

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard
 * such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement,
 * where 'Q' and '.' both indicate a queen and an empty space, respectively.
 *
 * [URL](https://leetcode.com/problems/n-queens/)
 */
object NQueens {
    fun solveNQueens(n: Int): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val board = Array(n) { CharArray(n) { '.' } }
        traverse(0, n, board, result)
        return result
    }

    private fun traverse(currCol: Int, n: Int, board: Array<CharArray>, result: MutableList<List<String>>) {
        if (currCol == n) {
            result.add(board.map { String(it) })
            return
        }
        for (i in 0 until n) {
            if (valid(board, i, currCol)) {
                board[i][currCol] = 'Q'
                traverse(currCol + 1, n, board, result)
                board[i][currCol] = '.'
            }
        }
    }

    private fun valid(board: Array<CharArray>, row: Int, col: Int): Boolean {
        // check all cols
        for (j in 0 until col) {
            if (board[row][j] == 'Q') {
                return false
            }
        }
        //check 45 degree
        var i = row + 1
        var j = col - 1
        while (j >= 0 && i < board.size) {
            if (board[i++][j--] == 'Q') {
                return false
            }
        }
        //check 135
        i = row - 1
        j = col - 1
        while (i >= 0 && j >= 0) {
            if (board[i--][j--] == 'Q') {
                return false
            }
        }
        return true
    }
}
