package easy

/**
 * You are given a 0-indexed integer array nums, where `nums[i]` represents the score of the ith student.
 * You are also given an integer k.
 *
 * Pick the scores of any k students from the array so that the difference between the highest and the lowest
 * of the k scores is minimized.
 *
 * Return the minimum possible difference.
 *
 * [URL](https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/)
 */
object MinimumDifferenceBetweenHighestAndLowestOfKScores {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        val delta = k - 1
        nums.sort()
        var diff = Int.MAX_VALUE

        for (i in 0 until nums.size - delta) {
            diff = minOf(diff, nums[i + delta] - nums[i])
        }

        return diff
    }
}
