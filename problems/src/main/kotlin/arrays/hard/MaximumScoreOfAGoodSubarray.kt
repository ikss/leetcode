package arrays.hard

/**
 * You are given an array of integers nums (0-indexed) and an integer k.
 *
 * The score of a subarray (i, j) is defined as `min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1)`
 * A good subarray is a subarray where i <= k <= j.
 *
 * Return the maximum possible score of a good subarray.
 *
 * [URL](https://leetcode.com/problems/maximum-score-of-a-good-subarray/)
 */
object MaximumScoreOfAGoodSubarray {
    fun maximumScore(nums: IntArray, k: Int): Int {
        val n = nums.size
        var left = k
        var right = k
        var result = nums[k]
        var currMin = nums[k]
        
        while (left > 0 || right < n - 1) {
            val goRight = (if (left > 0) nums[left - 1] else 0) < (if (right < n - 1) nums[right + 1] else 0)
            if (goRight) {
                right++
                currMin = minOf(currMin, nums[right])
            } else {
                left--
                currMin = minOf(currMin, nums[left])
            }
            result = maxOf(result, currMin * (right - left + 1))
        }
        return result
    }
}
