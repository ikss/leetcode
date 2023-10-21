package arrays.hard

/**
 * Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence of that array such
 * that for every two consecutive integers in the subsequence,
 * `nums[i]` and `nums[j]`, where i < j, the condition j - i <= k is satisfied.
 *
 * A subsequence of an array is obtained by deleting some number of elements (can be zero) from the array,
 * leaving the remaining elements in their original order.
 *
 * [URL](https://leetcode.com/problems/constrained-subsequence-sum/)
 */
object ConstrainedSubsequenceSum {
    fun constrainedSubsetSum(nums: IntArray, k: Int): Int {
        val queue = java.util.ArrayDeque<Int>()
        val dp = IntArray(nums.size)

        for (i in nums.indices) {
            if (!queue.isEmpty() && i - queue.peek() > k) {
                queue.poll()
            }
            dp[i] = (if (!queue.isEmpty()) dp[queue.peek()] else 0) + nums[i]
            while (!queue.isEmpty() && dp[queue.peekLast()] < dp[i]) {
                queue.pollLast()
            }
            if (dp[i] > 0) {
                queue.offer(i)
            }
        }
        var ans = Int.MIN_VALUE
        for (num in dp) {
            ans = maxOf(ans, num)
        }
        return ans
    }
}
