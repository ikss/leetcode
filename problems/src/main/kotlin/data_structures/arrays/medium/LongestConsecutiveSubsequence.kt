package data_structures.arrays.medium

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 *
 * [URL](https://leetcode.com/problems/longest-increasing-subsequence/)
 */
object LongestConsecutiveSubsequence {

    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        nums.sort()
        var longest = 1
        var curr = 1

        for (i in 0 until nums.size - 1) {
            if (nums[i] == nums[i + 1]) {
                continue
            } else if (nums[i] + 1 == nums[i + 1]) {
                curr++
            } else {
                longest = Math.max(longest, curr)
                curr = 1
            }
        }
        return Math.max(longest, curr)
    }
}
