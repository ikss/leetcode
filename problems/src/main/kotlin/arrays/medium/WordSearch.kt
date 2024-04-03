package arrays.medium

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 * [URL](https://leetcode.com/problems/word-search/)
 */
object WordSearch {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (dfs(i, j, 0, word, board)) {
                    return true
                }
            }
        }
        return false
    }

    private fun dfs(i: Int, j: Int, index: Int, word: String, board: Array<CharArray>): Boolean {
        if (index == word.length) return true
        if (i !in board.indices || j !in board[0].indices || board[i][j] != word[index]) return false

        board[i][j] = '-'
        val newIndex = index + 1
        if (
            dfs(i - 1, j, newIndex, word, board) ||
            dfs(i, j - 1, newIndex, word, board) ||
            dfs(i + 1, j, newIndex, word, board) ||
            dfs(i, j + 1, newIndex, word, board)
        ) return true

        board[i][j] = word[index]
        
        return false
    }
}