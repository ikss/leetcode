package medium

/**
 * You have n dice and each die has k faces numbered from 1 to k.
 *
 * Given three integers n, k, and target, return the number of possible ways (out of the kn total ways) to roll the dice
 * so the sum of the face-up numbers equals target. Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/)
 */
object NumberOfDiceRollsWithTargetSum {
    private var cache = mutableMapOf<Pair<Int, Int>, Int>()
    private const val MOD = 1_000_000_007

    fun numRollsToTargetRecursive(n: Int, k: Int, target: Int): Int {
        cache.clear()
        return dfs(n, k, target) % MOD
    }

    private fun dfs(n: Int, k: Int, target: Int): Int {
        if ((n == 0 && target == 0) || n == target) return 1
        if (n > target || n * k < target) return 0

        val cached = cache[n to target]
        if (cached != null) return cached

        var res = 0
        for (i in 1..k) {
            val tmp = dfs(n - 1, k, target - i)
            res = (res + tmp) % MOD
        }
        cache[n to target] = res
        return res
    }

    fun numRollsToTargetDp(n: Int, k: Int, target: Int): Int {
        val dp = Array(n + 1) { IntArray(target + 1) }
        dp[0][0] = 1

        for (dice in 1..n) {
            for (sum in 1..target) {
                for (left in 1..k) {
                    if (sum < left) break
                    dp[dice][sum] = (dp[dice][sum] + dp[dice - 1][sum - left]) % MOD
                }
            }
        }

        return dp[n][target]
    }
}
