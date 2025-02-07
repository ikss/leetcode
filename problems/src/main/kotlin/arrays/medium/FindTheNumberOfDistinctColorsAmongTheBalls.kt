package arrays.medium

/**
 * You are given an integer limit and a 2D array queries of size n x 2.
 *
 * There are limit + 1 balls with distinct labels in the range [0, limit]. Initially, all balls are uncolored.
 * For every query in queries that is of the form `[x, y]`, you mark ball x with the color y.
 * After each query, you need to find the number of distinct colors among the balls.
 *
 * Return an array result of length n, where `result[i]` denotes the number of distinct colors after ith query.
 *
 * Note that when answering a query, lack of a color will not be considered as a color.
 *
 * [URL](https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/)
 */
object FindTheNumberOfDistinctColorsAmongTheBalls {
    fun queryResults(limit: Int, queries: Array<IntArray>): IntArray {
        val colorsToBalls = HashMap<Int, Int>()
        val ballsToColors = HashMap<Int, Int>()

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            val (ball, color) = queries[i]
            if (ballsToColors.contains(ball)) {
                val oldColor = ballsToColors[ball]!!
                val old = colorsToBalls[oldColor]!!
                if (old == 1) {
                    colorsToBalls.remove(oldColor)
                } else {
                    colorsToBalls[oldColor] = old - 1
                }
            }
            colorsToBalls[color] = colorsToBalls.getOrDefault(color, 0) + 1
            ballsToColors[ball] = color

            result[i] = colorsToBalls.size
        }

        return result
    }
}
