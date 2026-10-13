package medium

/**
 * You are given an integer array nums. You may rearrange the elements in any order.
 *
 * The alternating score of an array arr is defined as:
 * * score = arr[0]2 - arr[1]2 + arr[2]2 - arr[3]2 + ...
 *
 * Return an integer denoting the maximum possible alternating score of nums after rearranging its elements.
 *
 * [URL](https://leetcode.com/problems/maximum-alternating-sum-of-squares/)
 */
object MaximumAlternatingSumOfSquares {
    fun maxAlternatingSum(nums: IntArray): Long {
        for (i in nums.indices) {
            nums[i] = nums[i] * nums[i]
        }
        nums.sort()

        var result = 0L

        val n = nums.size
        for (i in nums.indices) {
            if (i < n / 2) {
                result -= nums[i]
            } else {
                result += nums[i]
            }
        }

        return result
    }
}
