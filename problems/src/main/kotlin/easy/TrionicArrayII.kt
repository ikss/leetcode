package easy

import kotlin.math.max

/**
 * You are given an integer array nums of length n.
 *
 * A trionic subarray is a contiguous subarray `nums[l...r]`
 * (with 0 <= l < r < n) for which there exist indices l < p < q < r such that:
 *
 * * `nums[l...p]` is strictly increasing,
 * * `nums[p...q]` is strictly decreasing,
 * * `nums[q...r]` is strictly increasing.
 *
 * Return the maximum sum of any trionic subarray in nums.
 *
 * [URL](https://leetcode.com/problems/trionic-array-ii/)
 */
object TrionicArrayII {
    fun maxSumTrionic(nums: IntArray): Long {
        val n = nums.size
        var ans = Long.MIN_VALUE

        var i = 0
        while (i < n) {
            var j = i + 1
            var res: Long = 0

            // first segment: increasing segment
            while (j < n && nums[j - 1] < nums[j]) {
                j++
            }
            val p = j - 1

            if (p == i) {
                i++
                continue
            }

            // second segment: decreasing segment
            res += nums[p] + nums[p - 1]
            while (j < n && nums[j - 1] > nums[j]) {
                res += nums[j]
                j++
            }
            val q = j - 1

            if (q == p || q == n - 1 || (j < n && nums[j] <= nums[q])) {
                i = q
                i++
                continue
            }

            // third segment: increasing segment
            res += nums[q + 1]

            // find the maximum sum of the third segment
            var maxSum = 0L
            var sum = 0L
            var k = q + 2
            while (k < n && nums[k] > nums[k - 1]) {
                sum += nums[k]
                maxSum = max(maxSum, sum)
                k++
            }
            res += maxSum

            // find the maximum sum of the first segment
            maxSum = 0
            sum = 0
            for (k in p - 2 downTo i) {
                sum += nums[k]
                maxSum = max(maxSum, sum)
            }
            res += maxSum

            // update answer
            ans = max(ans, res)
            i = q - 1
            i++
        }

        return ans
    }
}