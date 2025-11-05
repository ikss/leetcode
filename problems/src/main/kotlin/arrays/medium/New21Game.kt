package arrays.medium

/**
 * Alice plays the following game, loosely based on the card game "21".
 *
 * Alice starts with 0 points and draws numbers while she has less than k points.
 * During each draw, she gains an integer number of points randomly from the range `[1, maxPts]`,
 * where maxPts is an integer. Each draw is independent and the outcomes have equal probabilities.
 *
 * Alice stops drawing numbers when she gets k or more points.
 *
 * Return the probability that Alice has n or fewer points.
 *
 * Answers within 10-5 of the actual answer are considered accepted.
 *
 * [URL](https://leetcode.com/problems/new-21-game/)
 */
object New21Game {
    fun new21GameDp(n: Int, k: Int, maxPts: Int): Double {
        val dp = DoubleArray(n + 1)
        dp[0] = 1.0

        for (i in 1..n) {
            for (j in 1..maxPts) {
                if (i - j !in 0..<k) {
                    continue
                }
                dp[i] += dp[i - j] / maxPts
            }
        }
        var result = 0.0
        for (i in k..n) {
            result += dp[i]
        }
        return result
    }

    fun new21GameDpOptimized(n: Int, k: Int, maxPts: Int): Double {
        val dp = DoubleArray(n + 1)
        dp[0] = 1.0
        var s = if (k > 0) 1.0 else 0.0

        for (i in 1..n) {
            dp[i] = s / maxPts
            if (i < k) {
                s += dp[i]
            }
            if (i - maxPts in 0 until k) {
                s -= dp[i - maxPts]
            }
        }
        var result = 0.0
        for (i in k..n) {
            result += dp[i]
        }
        return result
    }
}
