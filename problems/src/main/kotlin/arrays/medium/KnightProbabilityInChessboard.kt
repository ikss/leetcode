package arrays.medium

/**
 * On an n x n chessboard, a knight starts at the cell (row, column) and attempts to make exactly k moves.
 * The rows and columns are 0-indexed, so the top-left cell is (0, 0), and the bottom-right cell is (n - 1, n - 1).
 *
 * A chess knight has eight possible moves it can make, as illustrated below. Each move is two cells in a cardinal
 * direction, then one cell in an orthogonal direction.
 *
 * Each time the knight is to move, it chooses one of eight possible moves uniformly at random (even if the piece
 * would go off the chessboard) and moves there.
 *
 * The knight continues moving until it has made exactly k moves or has moved off the chessboard.
 *
 * Return the probability that the knight remains on the board after it has stopped moving.
 *
 * [URL](https://leetcode.com/problems/knight-probability-in-chessboard/)
 */
object KnightProbabilityInChessboard {
    private val directions = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(1, -2),
        intArrayOf(-1, 2),
        intArrayOf(-1, -2),
        intArrayOf(2, 1),
        intArrayOf(2, -1),
        intArrayOf(-2, 1),
        intArrayOf(-2, -1),
    )

    fun knightProbability(n: Int, k: Int, row: Int, column: Int): Double {
        // Define possible directions for the knight's moves

        // Initialize the previous and current DP tables
        var prevDp = Array(n) { DoubleArray(n) }
        var currDp = Array(n) { DoubleArray(n) }

        // Set the probability of the starting cell to 1
        prevDp[row][column] = 1.0

        // Iterate over the number of moves
        for (moves in 1..k) {
            // Iterate over the cells on the chessboard
            for (i in 0 until n) {
                for (j in 0 until n) {
                    currDp[i][j] = 0.0

                    // Iterate over possible directions
                    for ((dx, dy) in directions) {
                        val prevI = i - dx
                        val prevJ = j - dy

                        // Check if the previous cell is within the chessboard
                        if (prevI in 0 until n && prevJ in 0 until n) {
                            // Update the probability by adding the previous probability divided by 8
                            currDp[i][j] += prevDp[prevI][prevJ] / 8
                        }
                    }
                }
            }

            // Swap the previous and current DP tables
            val temp = prevDp
            prevDp = currDp
            currDp = temp
        }

        // Calculate the total probability by summing up the probabilities for all cells
        var totalProbability = 0.0
        for (i in 0 until n) {
            for (j in 0 until n) {
                totalProbability += prevDp[i][j]
            }
        }

        // Return the total probability
        return totalProbability
    }
}
