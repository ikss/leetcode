package medium

/**
 * This question is about implementing a basic elimination algorithm for Candy Crush.
 *
 * Given an m x n integer array board representing the grid of candy where `board[i][j]` represents the type of candy.
 * A value of `board[i][j] == 0` represents that the cell is empty.
 *
 * The given board represents the state of the game following the player's move.
 * Now, you need to restore the board to a stable state by crushing candies according to the following rules:
 * * If three or more candies of the same type are adjacent vertically or horizontally,
 * crush them all at the same time - these positions become empty.
 * * After crushing all candies simultaneously, if an empty space on the board has candies on top of itself,
 * then these candies will drop until they hit a candy or bottom at the same time.
 * No new candies will drop outside the top boundary.
 * * After the above steps, there may exist more candies that can be crushed. If so, you need to repeat the above steps.
 * * If there does not exist more candies that can be crushed (i.e., the board is stable), then return the current board.
 *
 * You need to perform the above rules until the board becomes stable, then return the stable board.
 *
 * [URL](https://leetcode.com/problems/candy-crush/)
 */
object CandyCrush {
    fun candyCrush(board: Array<IntArray>): Array<IntArray> {
        while (true) {
            if (!destoy(board)) break
            move(board)
        }
        return board
    }

    private fun destoy(board: Array<IntArray>): Boolean {
        val visited = HashSet<Pair<Int, Int>>()
        val destroyed = HashSet<Pair<Int, Int>>()
        for (r in board.indices) {
            for (c in board[0].indices) {
                if (board[r][c] == 0) continue

                traverse(r, c, board, visited, destroyed)
            }
        }

        for ((r, c) in destroyed) {
            board[r][c] = 0
        }

        return destroyed.isNotEmpty()
    }

    private fun traverse(
        r: Int,
        c: Int,
        board: Array<IntArray>,
        visited: HashSet<Pair<Int, Int>>,
        crushed: HashSet<Pair<Int, Int>>,
    ) {
        val num = board[r][c]

        // crush right
        var right = c + 1

        while (right < board[0].size && board[r][right] == num) {
            visited.add(r to right)
            right++
        }
        right--

        if (right - c > 1) {
            for (col in c..right) {
                crushed.add(r to col)
            }
        }


        // crush down
        var bottom = r + 1

        while (bottom < board.size && board[bottom][c] == num) {
            visited.add(bottom to c)
            bottom++
        }
        bottom--

        if (bottom - r > 1) {
            for (row in r..bottom) {
                crushed.add(row to c)
            }
        }
    }

    private fun move(board: Array<IntArray>) {
        for (c in board[0].indices) {
            var nextRow = board.size - 1

            for (r in board.size - 1 downTo 0) {
                val cell = board[r][c]

                if (cell == 0) {
                    continue
                }
                if (nextRow != r) {
                    board[nextRow][c] = board[r][c]
                    board[r][c] = 0
                }
                nextRow--
            }
        }
    }
}
