package medium

/**
 * Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the
 * elements in both subsets is equal or false otherwise.
 *
 * [URL](https://leetcode.com/problems/partition-equal-subset-sum/)
 */
object PartitionEqualSubsetSum {
    fun canPartition(nums: IntArray): Boolean {
        val sum = nums.sum()

        if (sum % 2 != 0) return false

        val wanted = sum / 2

        val dp = BooleanArray(sum + 1)
        dp[0] = true

        for (n in nums) {
            if (n == wanted) return true

            for (i in dp.size - 1 downTo n) {
                if (dp[i - n]) {
                    if (i == wanted) {
                        return true
                    }
                    dp[i] = true
                }
            }
        }

        return false
    }
}
