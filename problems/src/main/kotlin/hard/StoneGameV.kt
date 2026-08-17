package hard

/**
 * There are several stones arranged in a row, and each stone has an associated value which is an integer
 * given in the array stoneValue.
 *
 * In each round of the game, Alice divides the row into two non-empty rows (i.e. left row and right row),
 * then Bob calculates the value of each row which is the sum of the values of all the stones in this row.
 * Bob throws away the row which has the maximum value, and Alice's score increases by the value of the remaining row.
 * If the value of the two rows are equal, Bob lets Alice decide which row will be thrown away.
 * The next round starts with the remaining row.
 *
 * The game ends when there is only one stone remaining. Alice's score is initially zero.
 *
 * Return the maximum score that Alice can obtain.
 *
 * [URL](https://leetcode.com/problems/stone-game-v/)
 */
object StoneGameV {
    fun stoneGameV(stoneValue: IntArray): Int {
        val n = stoneValue.size
        val prefSum = IntArray(n + 1)
        for (i in 0 until n) {
            prefSum[i + 1] = prefSum[i] + stoneValue[i]
        }

        // -1 means "not computed yet"
        val cache = Array(n + 1) { IntArray(n + 1) { -1 } }

        return recursiveCompute(0, n, prefSum, cache)
    }

    private fun recursiveCompute(start: Int, end: Int, prefSum: IntArray, cache: Array<IntArray>): Int {
        if (cache[start][end] != -1) {
            return cache[start][end]
        }

        var result = 0

        for (i in start + 1 until end) {
            val left = prefSum[i] - prefSum[start]
            val right = prefSum[end] - prefSum[i]

            if (left > right) {
                result = maxOf(result, right + recursiveCompute(i, end, prefSum, cache))
            } else if (right > left) {
                result = maxOf(result, left + recursiveCompute(start, i, prefSum, cache))
            } else {
                result = maxOf(
                    result,
                    right + recursiveCompute(i, end, prefSum, cache),
                    left + recursiveCompute(start, i, prefSum, cache),
                )
            }
        }

        cache[start][end] = result
        return result
    }
}