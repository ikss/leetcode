package arrays.hard

/**
 * The score of an array is defined as the product of its sum and its length.
 * * For example, the score of `[1, 2, 3, 4, 5]` is (1 + 2 + 3 + 4 + 5) * 5 = 75.
 *
 * Given a positive integer array nums and an integer k, return the number of non-empty subarrays of nums whose score
 * is strictly less than k.
 *
 * A subarray is a contiguous sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/count-subarrays-with-score-less-than-k/)
 */
object CountSubarraysWithScoreLessThanK {
    fun countSubarrays(nums: IntArray, k: Long): Long {
        var start = 0
        var end = 0
        var sum = 0L

        var result = 0L
        while (end < nums.size) {
            sum += nums[end]
            while (start <= end && sum * (end - start + 1) >= k) {
                sum -= nums[start]
                start++
            }
            result += end - start + 1
            end++
        }
        return result
    }
}
