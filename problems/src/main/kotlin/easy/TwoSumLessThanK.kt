package easy

/**
 * Given an array nums of integers and integer k, return the maximum sum such that there exists i < j with
 * `nums[i] + nums[j] = sum` and sum < k. If no i, j exist satisfying this equation, return -1.
 *
 * [URL](https://leetcode.com/problems/two-sum-less-than-k/)
 */
object TwoSumLessThanK {
    fun twoSumLessThanK(nums: IntArray, k: Int): Int {
        nums.sort()

        var left = 0
        var right = nums.size - 1

        var result = -1

        while (left < right && nums[left] <= k / 2) {
            val sum = nums[left] + nums[right]
            if (sum < k) {
                result = maxOf(result, sum)
                left++
            } else {
                right--
            }
        }
        return result
    }
}
