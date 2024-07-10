package arrays.medium

/**
 * You are given an m x n matrix board, representing the current state of a crossword puzzle.
 * The crossword contains lowercase English letters (from solved words), ' ' to represent any empty cells,
 * and '#' to represent any blocked cells.
 *
 * A word can be placed horizontally (left to right or right to left) or vertically (top to bottom or bottom to top)
 * in the board if:
 * * It does not occupy a cell containing the character '#'.
 * * The cell each letter is placed in must either be ' ' (empty) or match the letter already on the board.
 * * There must not be any empty cells ' ' or other lowercase letters directly left or right of the word
 * if the word was placed horizontally.
 * * There must not be any empty cells ' ' or other lowercase letters directly above or below the word
 * if the word was placed vertically.
 *
 * Given a string word, return true if word can be placed in board, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/check-if-word-can-be-placed-in-crossword/)
 */
object CheckIfWordCanBePlacedInCrossword {
    private val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun placeWordInCrossword(board: Array<CharArray>, word: String): Boolean {
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == ' ' || board[i][j] == word[0]) {
                    if (checkWord(i, j, word, board)) {
                        return true
                    }
                }
            }
        }

        return false
    }

    private fun checkWord(i: Int, j: Int, word: String, board: Array<CharArray>): Boolean {
        for ((di, dj) in directions) {
            if (i - di in board.indices && j - dj in board[0].indices && board[i - di][j - dj] != '#') {
                continue
            }
            for (dir in directions) {
                var r = i
                var c = j
                var idx = 0
                if (r - dir.first in board.indices && c - dir.second in board[0].indices && board[r - dir.first][c - dir.second] != '#') {
                    continue
                }

                while (idx < word.length && r in board.indices && c in board[0].indices) {
                    if (board[r][c] == '#' || (board[r][c] != ' ' && board[r][c] != word[idx])) break
                    idx++
                    r += dir.first
                    c += dir.second
                }

                if (idx == word.length && (r !in board.indices || c !in board[0].indices || board[r][c] == '#')) {
                    return true
                }
            }
        }
        return false
    }
}