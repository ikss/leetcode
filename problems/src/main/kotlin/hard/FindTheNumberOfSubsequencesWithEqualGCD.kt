package hard

/**
 * You are given an integer array nums.
 *
 * Your task is to find the number of pairs of non-empty subsequences (seq1, seq2) of nums that satisfy the following conditions:
 *
 * * The subsequences seq1 and seq2 are disjoint, meaning no index of nums is common between them.
 * * The GCD of the elements of seq1 is equal to the GCD of the elements of seq2.
 *
 * Return the total number of such pairs.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/find-the-number-of-subsequences-with-equal-gcd/)
 */
object FindTheNumberOfSubsequencesWithEqualGCD {

    fun subsequencePairCount(nums: IntArray): Int {
        val MOD = 1_000_000_007
        var m = 0
        for (num in nums) {
            m = maxOf(m, num)
        }

        var dp = Array(m + 1) { IntArray(m + 1) }
        dp[0][0] = 1

        for (num in nums) {
            val ndp = Array(m + 1) { IntArray(m + 1) }
            for (j in 0..m) {
                val divisor1 = gcd(j, num)
                for (k in 0..m) {
                    val value = dp[j][k]
                    if (value == 0) {
                        continue
                    }
                    val divisor2 = gcd(k, num)
                    ndp[j][k] = (ndp[j][k] + value) % MOD
                    ndp[divisor1][k] = (ndp[divisor1][k] + value) % MOD
                    ndp[j][divisor2] = (ndp[j][divisor2] + value) % MOD
                }
            }
            dp = ndp
        }

        var result = 0
        for (j in 1..m) {
            result = (result + dp[j][j]) % MOD
        }
        return result
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val temp = a
            a = b
            b = temp % b
        }
        return a
    }
}