package medium

/**
 * You have some coins.  The i-th coin has a probability `prob[i]` of facing heads when tossed.
 *
 * Return the probability that the number of coins facing heads equals target if you toss every coin exactly once.
 *
 * [URL](https://leetcode.com/problems/toss-strange-coins/)
 */
object TossStrangeCoins {
    fun probabilityOfHeadsDpTopDown(prob: DoubleArray, target: Int): Double {
        val memo = Array(prob.size) { DoubleArray(target + 1) { -1.0 } }

        return findProbability(0, memo, prob, target)
    }

    private fun findProbability(index: Int, memo: Array<DoubleArray>, prob: DoubleArray, target: Int): Double {
        if (target < 0) return 0.0

        if (index == prob.size) {
            return if (target == 0) {
                1.0
            } else {
                0.0
            }
        }

        if (memo[index][target] != -1.0) {
            return memo[index][target]
        }

        val result = findProbability(index + 1, memo, prob, target - 1) * prob[index] +
                findProbability(index + 1, memo, prob, target) * (1.0 - prob[index])

        memo[index][target] = result

        return result
    }

    fun probabilityOfHeadsDpBottomUp(prob: DoubleArray, target: Int): Double {
        val memo = Array(prob.size + 1) { DoubleArray(target + 1) { 0.0 } }
        memo[0][0] = 1.0

        for (i in 1..prob.size) {
            memo[i][0] = memo[i - 1][0] * (1.0 - prob[i - 1])
            for (j in 1..target) {
                if (j > i) break
                memo[i][j] = memo[i - 1][j - 1] * prob[i - 1] + memo[i - 1][j] * (1.0 - prob[i - 1])
            }
        }
        return memo[prob.size][target]
    }

}