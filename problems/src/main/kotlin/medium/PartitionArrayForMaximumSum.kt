package medium

/**
 * Given an integer array arr, partition the array into (contiguous) subarrays of length at most k.
 * After partitioning, each subarray has their values changed to become the maximum value of that subarray.
 *
 * Return the largest sum of the given array after partitioning.
 * Test cases are generated so that the answer fits in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/partition-array-for-maximum-sum/)
 */
object PartitionArrayForMaximumSum {
    fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
        val n = arr.size

        val dp = IntArray(n + 1)

        for (start in n - 1 downTo 0) {
            var currMax = 0
            val end = minOf(n, start + k)

            for (i in start until end) {
                currMax = maxOf(currMax, arr[i])
                // Store the maximum of all options for the current subarray.
                dp[start] = maxOf(dp[start], dp[i + 1] + currMax * (i - start + 1))
            }
        }
        return dp[0]
    }
}
