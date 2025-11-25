package medium

/**
 * On day 1, one person discovers a secret.
 *
 * You are given an integer delay, which means that each person will share the secret with a new person every day,
 * starting from delay days after discovering the secret. You are also given an integer forget,
 * which means that each person will forget the secret forget days after discovering it.
 * A person cannot share the secret on the same day they forgot it, or on any day afterwards.
 *
 * Given an integer n, return the number of people who know the secret at the end of day n.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-people-aware-of-a-secret/)
 */
object NumberOfPeopleAwareOfSecret {
    fun peopleAwareOfSecret(n: Int, delay: Int, forget: Int): Int {
        val dp = LongArray(n + 1)
        val mod = 1_000_000_007
        dp[1] = 1

        var share = 0L
        for (i in 2 .. n) {
            share = (share + (dp.getOrNull(i - delay) ?: 0) + mod) % mod
            share = (share - (dp.getOrNull(i - forget) ?: 0) + mod) % mod
            dp[i] = share
        }

        var result = 0L
        for (i in n - forget + 1 .. n) {
            result += dp[i]
            result %= 1_000_000_007
        }

        return result.toInt()
    }
}
