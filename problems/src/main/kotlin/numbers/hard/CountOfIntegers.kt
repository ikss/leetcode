package numbers.hard

/**
 * You are given two numeric strings num1 and num2 and two integers max_sum and min_sum.
 * We denote an integer x to be good if:
 * * num1 <= x <= num2
 * * min_sum <= digit_sum(x) <= max_sum.
 *
 * Return the number of good integers. Since the answer may be large, return it modulo 10^9 + 7.
 *
 * Note that digit_sum(x) denotes the sum of the digits of x.
 *
 * [URL](https://leetcode.com/problems/count-of-integers/)
 */
object CountOfIntegers {
    private const val MOD = 1e9.toInt() + 7

    fun count(num1: String, num2: String, min_sum: Int, max_sum: Int): Int {
        var dp = Array(23) { Array(9 * 22) { IntArray(2) { -1 } } }
        val dfs1 = dfs(0, 0, min_sum, max_sum, num2, true, true, dp)
        
        dp = Array(23) { Array(9 * 22) { IntArray(2) { -1 } } }
        val dfs2 = dfs(0, 0, min_sum, max_sum, num1, true, false, dp)
        return (MOD + dfs1 - dfs2) % MOD
    }

    private fun dfs(
        i: Int,
        sum: Int,
        min_sum: Int,
        max_sum: Int,
        num: String,
        lim: Boolean,
        equal: Boolean,
        dp: Array<Array<IntArray>>,
    ): Int {
        if (i == num.length || sum > max_sum) {
            return if (sum in min_sum..max_sum && (equal || !lim)) 1 else 0
        }
        val index = if (lim) 0 else 1
        if (dp[i][sum][index] == -1) {
            val upper = if (lim) num[i] else '9'
            for (n in '0'..upper) {
                val max = maxOf(0, dp[i][sum][index])
                dp[i][sum][index] = (max +
                        dfs(i + 1, sum + (n - '0'), min_sum, max_sum, num, lim && n == num[i], equal, dp)) % 1000000007
            }
        }
        return dp[i][sum][index]
    }

}