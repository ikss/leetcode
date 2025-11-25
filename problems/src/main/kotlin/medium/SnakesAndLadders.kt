package medium

/**
 * You are given an n x n integer matrix board where the cells are labeled from 1 to n^2 in a
 * [Boustrophedon](https://wikipedia.org/wiki/Boustrophedon) style starting from the bottom left of the board
 * (i.e. board[n - 1][0]) and alternating direction each row.
 *
 * You start on square 1 of the board. In each move, starting from square curr, do the following:
 *
 * * Choose a destination square next with a label in the range [curr + 1, min(curr + 6, n2)].
 * * * This choice simulates the result of a standard 6-sided die roll: i.e., there are always at most 6 destinations, regardless of the size of the board.
 * * If next has a snake or ladder, you must move to the destination of that snake or ladder. Otherwise, you move to next.
 * * The game ends when you reach the square n^2.
 *
 * A board square on row r and column c has a snake or ladder if `board[r][c] != -1`. The destination of that snake or
 * ladder is `board[r][c]`. Squares 1 and n2 do not have a snake or ladder.
 *
 * Note that you only take a snake or ladder at most once per move. If the destination to a snake or ladder is the start
 * of another snake or ladder, you do not follow the subsequent snake or ladder.
 *
 * For example, suppose the board is [[-1,4],[-1,3]], and on the first move, your destination square is 2.
 * You follow the ladder to square 3, but do not follow the subsequent ladder to 4.
 * Return the least number of moves required to reach the square n2. If it is not possible to reach the square,
 * return -1.
 *
 * [URL](https://leetcode.com/problems/snakes-and-ladders/)
 */
object SnakesAndLadders {
    fun snakesAndLadders(board: Array<IntArray>): Int {
        val n = board.size
        val n2 = n * n

        val queue = java.util.ArrayDeque<Int>(12)
        queue.offer(1)
        val visited = BooleanArray(n2 + 1)
        visited[1] = true

        var result = 1
        while (queue.isNotEmpty()) {
            val size = queue.size

            for (i in 0 until size) {
                val node = queue.poll()
                for (step in 1 .. minOf(6, n2 - node)) {
                    val next = getNextNode(node + step, visited, board)
                    if (next == -1) continue

                    if (next == n2) return result
                    queue.offer(next)
                }
            }
            result++
        }

        return -1
    }

    private fun getNextNode(node: Int, visited: BooleanArray, board: Array<IntArray>): Int {
        val row = (node - 1) / board.size
        val col = when (row % 2 == 0) {
            true -> node - row * board.size - 1
            false -> board.size - (node - row * board.size)
        }
        val nextNode = if (board[board.size - row - 1][col] == -1) {
            node
        } else {
            board[board.size - row - 1][col]
        }

        return if (visited[nextNode]) {
            -1
        } else {
            visited[nextNode] = true
            nextNode
        }
    }
}