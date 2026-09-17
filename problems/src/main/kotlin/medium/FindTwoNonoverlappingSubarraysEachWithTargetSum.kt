package medium

/**
 * You are given an array of integers arr and an integer target.
 *
 * You have to find two non-overlapping sub-arrays of arr each with a sum equal target.
 * There can be multiple answers so you have to find an answer where the sum of the lengths of the two sub-arrays is minimum.
 *
 * Return the minimum sum of the lengths of the two required sub-arrays,
 * or return -1 if you cannot find such two sub-arrays.
 *
 * [URL](https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/)
 */
object FindTwoNonoverlappingSubarraysEachWithTargetSum {
    fun minSumOfLengths(arr: IntArray, target: Int): Int {
        val n = arr.size
        val dp = IntArray(n + 1) { n }

        var result = n + 1
        var l = 0
        var r = 0
        var slidingWindowSum = 0
        while (r < n) {
            slidingWindowSum += arr[r]
            while (slidingWindowSum > target) {
                slidingWindowSum -= arr[l++]
            }
            if (slidingWindowSum == target) {
                result = minOf(result, r - l + 1 + dp[l])
                dp[r + 1] = minOf(dp[r], r - l + 1)
            } else {
                dp[r + 1] = dp[r]
            }
            r++
        }
        return if (result == n + 1) -1 else result
    }
}