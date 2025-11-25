package medium

/**
 * You are given a 0-indexed integer array nums. You have to partition the array into one or more contiguous subarrays.
 *
 * We call a partition of the array valid if each of the obtained subarrays satisfies one of the following conditions:
 * * The subarray consists of exactly 2 equal elements. For example, the subarray `[2,2]` is good.
 * * The subarray consists of exactly 3 equal elements. For example, the subarray `[4,4,4]` is good.
 * * The subarray consists of exactly 3 consecutive increasing elements, that is, the difference between
 * adjacent elements is 1. For example, the subarray `[3,4,5]` is good, but the subarray `[1,3,5]` is not.
 *
 * Return true if the array has at least one valid partition. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/best-team-with-no-conflicts/)
 */
object CheckIfThereIsValidPartitionForTheArray {
    fun validPartition(nums: IntArray): Boolean {
        val n = nums.size
        val dp = BooleanArray(n + 1)
        dp[0] = true

        for (i in 0 until n) {
            val dpIndex = i + 1
            var result = false

            if (i > 0 && nums[i] == nums[i - 1]) {
                result = dp[dpIndex - 2]
            }
            if (!result && i > 1 && nums[i - 2] == nums[i - 1] && nums[i - 1] == nums[i]) {
                result = dp[dpIndex - 3]
            }
            if (!result && i > 1 && nums[i - 2] + 1 == nums[i - 1] && nums[i - 1] + 1 == nums[i]) {
                result = dp[dpIndex - 3]
            }
            dp[dpIndex] = result
        }

        return dp[n]
    }
}