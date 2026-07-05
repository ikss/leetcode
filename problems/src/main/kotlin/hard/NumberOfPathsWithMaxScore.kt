package hard

/**
 * You are given a square board of characters. You can move on the board starting at the bottom right square marked
 * with the character 'S'.
 *
 * You need to reach the top left square marked with the character 'E'. The rest of the squares are labeled either
 * with a numeric character 1, 2, ..., 9 or with an obstacle 'X'. In one move you can go up, left or up-left
 * (diagonally) only if there is no obstacle there.
 *
 * Return a list of two integers: the first integer is the maximum sum of numeric characters you can collect,
 * and the second is the number of such paths that you can take to get that maximum sum, taken modulo 10^9 + 7.
 *
 * In case there is no path, return `[0, 0]`.
 *
 * [URL](https://leetcode.com/problems/number-of-paths-with-max-score/)
 */
object NumberOfPathsWithMaxScore {
    private val unvisited = intArrayOf(-1, -1)
    private val mod = 1_000_000_007

    fun pathsWithMaxScore(board: List<String>): IntArray {
        val rows = board.size
        val cols = board[0].length

        val sums = Array(rows + 1) { Array(cols + 1) { unvisited } }
        sums[rows - 1][cols - 1] = intArrayOf(0, 1)

        for (r in rows - 1 downTo 0) {
            for (c in cols - 1 downTo 0) {
                when (board[r][c]) {
                    'S' -> sums[r][c] = intArrayOf(0, 1)
                    'E' -> sums[r][c] = calcNew(r, c, sums, 0)
                    'X' -> continue
                    else -> sums[r][c] = calcNew(r, c, sums, board[r][c] - '0')
                }
            }
        }

        return if (sums[0][0] === unvisited) intArrayOf(0, 0) else sums[0][0]
    }


    private fun calcNew(r: Int, c: Int, sums: Array<Array<IntArray>>, num: Int): IntArray {
        val bottom = sums[r + 1][c]
        val right = sums[r][c + 1]
        val bottomRight = sums[r + 1][c + 1]

        val maxSum = maxOf(bottom[0], right[0], bottomRight[0])
        if (maxSum == -1) return unvisited

        var count = 0
        if (bottom[0] == maxSum) {
            count = bottom[1]
        }
        if (right[0] == maxSum) {
            count = (count + right[1]) % mod
        }
        if (bottomRight[0] == maxSum) {
            count = (count + bottomRight[1]) % mod
        }

        return intArrayOf(maxSum + num, count)
    }
}
