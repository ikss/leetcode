package arrays.hard

/**
 * On an 2 x 3 board, there are five tiles labeled from 1 to 5, and an empty square represented by 0.
 * A move consists of choosing 0 and a 4-directionally adjacent number and swapping it.
 *
 * The state of the board is solved if and only if the board is [[1,2,3],[4,5,0]].
 *
 * Given the puzzle board __board__, return the least number of moves required so that the state of the board is solved.
 * If it is impossible for the state of the board to be solved, return -1.
 *
 * [URL](https://leetcode.com/problems/sliding-puzzle/)
 */
object SlidingPuzzle {
    private val solvedState = listOf(1, 2, 3, 4, 5, 0)
    private val possibleMoves = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(0, 2, 4),
        intArrayOf(1, 5),
        intArrayOf(0, 4),
        intArrayOf(1, 3, 5),
        intArrayOf(2, 4),
    )

    fun slidingPuzzle(board: Array<IntArray>): Int {
        val state = getState(board)
        val visited = HashSet<List<Int>>()
        visited.add(state)

        val queue = java.util.ArrayDeque<Pair<ArrayList<Int>, Int>>()
        queue.offer(state to 0)

        while (queue.isNotEmpty()) {
            val (curr, depth) = queue.poll()
            if (curr == solvedState) {
                return depth
            }

            val zeroIndex = curr.indexOf(0)
            for (move in possibleMoves[zeroIndex]) {
                curr[zeroIndex] = curr[move]
                curr[move] = 0
                val nextState = ArrayList(curr)
                if (visited.add(nextState)) {
                    queue.offer(nextState to depth + 1)
                }
                curr[move] = curr[zeroIndex]
                curr[zeroIndex] = 0
            }
        }
        return -1
    }

    private fun getState(board: Array<IntArray>): ArrayList<Int> {
        val result = ArrayList<Int>(6)
        for (i in board.indices) {
            for (j in board[i].indices) {
                result.add(board[i][j])
            }
        }
        return result
    }
}
