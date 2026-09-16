package medium

/**
 * Given n points on a 1-D plane, where the ith point (from 0 to n-1) is at x = i, find the number of ways we can draw
 * exactly k non-overlapping line segments such that each segment covers two or more points. The endpoints of each
 * segment must have integral coordinates.
 * The k line segments do not have to cover all n points, and they are allowed to share endpoints.
 *
 * Return the number of ways we can draw k non-overlapping line segments.
 * Since this number can be huge, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/)
 */
object NumberOfSetsOfKNonOverlappingLineSegments {

    fun numberOfSets(n: Int, k: Int): Int {
        val MOD = 1_000_000_007
        val dp = IntArray(n)

        val prefixSums = IntArray(n + 1)
        for (j in 0..<n) {
            dp[j] = 1
            prefixSums[j + 1] = (prefixSums[j] + dp[j]) % MOD
        }
        for (i in 1..k) {
            dp[0] = 0
            for (j in 1..<n) {
                dp[j] = (dp[j - 1] + prefixSums[j]) % MOD
            }
            for (j in 0..<n) {
                prefixSums[j + 1] = (prefixSums[j] + dp[j]) % MOD
            }
        }
        return dp[n - 1]
    }
}
