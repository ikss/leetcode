package data_structures.arrays.hard

import java.util.*

/**
 * For an integer array nums, an inverse pair is a pair of integers `[i, j]`
 * where 0 <= i < j < nums.length and `nums[i] > nums[j]`.
 *
 * Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that
 * there are exactly k inverse pairs. Since the answer can be huge, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/k-inverse-pairs-array/)
 */
object KInversePairArrays {
    private var M = 1000000007
    fun kInversePairsRecursive(n: Int, k: Int): Int {
        val memo = Array<Array<Int?>>(1001) { arrayOfNulls(1001) }
        return kInversePairsRecursive(n, k, memo)
    }

    private fun kInversePairsRecursive(n: Int, k: Int, memo: Array<Array<Int?>>): Int {
        if (n == 0) {
            return 0
        }
        if (k == 0) {
            return 1
        }
        if (memo[n][k] != null) {
            return memo[n][k]!!
        }
        var result = 0
        for (i in 0..minOf(k, n - 1)) {
            result = (result + kInversePairsRecursive(n - 1, k - i, memo)) % M
        }
        memo[n][k] = result
        return result
    }

    fun kInversePairsDp(n: Int, k: Int): Int {
        var dp = IntArray(k + 1)

        for (i in 1..n) {
            val tmp = IntArray(k + 1)
            tmp[0] = 1
            for (j in 0..k) {
                if (j == 0) {
                    tmp[j] = 1
                } else {
                    val result = (dp[j] + M - if (j - i >= 0) dp[j - i] else 0) % M
                    tmp[j] = (tmp[j - 1] + result) % M
                }
            }
            dp = tmp
        }

        return (dp[k] + M - if (k > 0) dp[k - 1] else 0) % M
    }
}
