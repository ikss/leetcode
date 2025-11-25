package easy

/**
 * Given a 0-indexed integer array nums of size n, find the maximum difference between `nums[i]` and `nums[j]`
 * (i.e., `nums[j] - nums[i]`), such that 0 <= i < j < n and `nums[i] < nums[j]`.
 *
 * Return the maximum difference. If no such i and j exists, return -1.
 *
 * [URL](https://leetcode.com/problems/maximum-difference-between-increasing-elements/)
 */
object MaximumDifferenceBetweenIncreasingElements {
    fun maximumDifference(nums: IntArray): Int {
        var result = -1
        var min = nums[0]

        for (i in 1 until nums.size) {
            val n = nums[i]
            if (n > min) {
                result = maxOf(result, n - min)
            } else {
                min = n
            }
        }
        
        return result
    }
}
