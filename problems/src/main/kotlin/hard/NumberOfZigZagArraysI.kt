package hard

/**
 * You are given three integers n, l, and r.
 *
 * A ZigZag array of length n is defined as follows:
 * * Each element lies in the range `[l, r]`.
 * * No two adjacent elements are equal.
 * * No three consecutive elements form a strictly increasing or strictly decreasing sequence.
 *
 * Return the total number of valid ZigZag arrays.
 *
 * Since the answer may be large, return it modulo 10^9 + 7.
 *
 * A sequence is said to be strictly increasing if each element is strictly greater than its previous one (if exists).
 *
 * A sequence is said to be strictly decreasing if each element is strictly smaller than its previous one (if exists).
 *
 * [URL](https://leetcode.com/problems/number-of-zigzag-arrays-i/)
 */
object NumberOfZigZagArraysI {

    fun zigZagArrays(n: Int, l: Int, r: Int): Int {
        val MOD = 1_000_000_007
        val dp0 = IntArray(r + 1)
        val dp1 = IntArray(r + 1)
        val sum0 = IntArray(r + 2)
        val sum1 = IntArray(r + 2)

        for (i in l..r) {
            dp0[i] = 1
            dp1[i] = 1
            sum0[i] = i - l + 1
            sum1[i] = i - l + 1
        }

        for (i in 1 until n) {
            for (j in l..r) {
                dp0[j] = (sum1[r] - sum1[j] + MOD) % MOD
                dp1[j] = sum0[j - 1]
            }

            sum0[l] = dp0[l]
            sum1[l] = dp1[l]
            for (j in l + 1..r) {
                sum0[j] = (sum0[j - 1] + dp0[j]) % MOD
                sum1[j] = (sum1[j - 1] + dp1[j]) % MOD
            }
        }

        return (sum0[r] + sum1[r]) % MOD
    }
}
