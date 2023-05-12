package arrays.medium

/**
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object SolvingQuestionsWithBrainpower {
    fun mostPointsDp(questions: Array<IntArray>): Long {
        val l = questions.size

        val dp = LongArray(l)
        dp[l - 1] = questions[l - 1][0].toLong()

        for (i in l - 2 downTo 0) {
            val (points, skip) = questions[i]
            dp[i] = points.toLong()
            if (i + skip + 1 < l) {
                dp[i] += dp[i + skip + 1]
            }
            dp[i] = maxOf(dp[i], dp[i + 1])
        }

        return dp[0]
    }

    fun mostPointsDfs(questions: Array<IntArray>): Long {
        val n = questions.size
        val dp = LongArray(n)
        return dfs(questions, 0, dp)
    }

    private fun dfs(questions: Array<IntArray>, i: Int, dp: LongArray): Long {
        if (i >= questions.size) {
            return 0
        }
        if (dp[i] != 0L) {
            return dp[i]
        }
        val (points, skip) = questions[i]

        // dp[i] = max(skip it, solve it)
        dp[i] = maxOf(points + dfs(questions, i + skip + 1, dp), dfs(questions, i + 1, dp))
        return dp[i]
    }
}
