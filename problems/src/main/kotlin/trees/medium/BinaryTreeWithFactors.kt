package trees.medium

import java.util.*

/**
 * Given an array of unique integers, arr, where each integer `arr[i]` is strictly greater than 1.
 *
 * We make a binary tree using these integers, and each number may be used for any number of times.
 * Each non-leaf node's value should be equal to the product of the values of its children.
 *
 * Return the number of binary trees we can make. The answer may be too large so return the answer modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/binary-trees-with-factors/)
 */
object BinaryTreeWithFactors {
    private const val MOD = 1_000_000_007

    fun numFactoredBinaryTrees(arr: IntArray): Int {
        val dp = LinkedHashMap<Int, Int>()
        arr.sort()

        var result = 0
        for (n in arr) {
            var subresult = 1

            for ((k, v) in dp) {
                if (k > n / 2) break

                val rem = n % k
                val div = n / k

                if (rem == 0 && dp[div] != null) {
                    val subtrees = (v.toLong() * dp[div]!!) % MOD
                    subresult = (subresult + subtrees.toInt()) % MOD
                }
            }

            dp[n] = subresult
            result = (result + subresult) % MOD
        }
        return result
    }
}
