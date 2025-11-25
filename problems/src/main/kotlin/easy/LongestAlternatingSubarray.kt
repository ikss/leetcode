package easy

/**
 * You are given a 0-indexed integer array nums. A subarray s of length m is called alternating if:
 * * m is greater than 1.
 * * s1 = s0 + 1.
 * * The 0-indexed subarray s looks like` [s0, s1, s0, s1,...,s(m-1) % 2]`. In other words, s1 - s0 = 1, s2 - s1 = -1,
 * s3 - s2 = 1, s4 - s3 = -1, and so on up to `s[m - 1] - s[m - 2] = (-1)m`.
 * Return the maximum length of all alternating subarrays present in nums or -1 if no such subarray exists.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/two-sum/)
 */
object LongestAlternatingSubarray {
    fun alternatingSubarray(nums: IntArray): Int {
        val n = nums.size
        var result = 0
        var j = 0
        var i = 0

        while (i < n) {
            j = i + 1
            while (j < n && nums[j] == nums[i] + (j - i) % 2) {
                result = maxOf(result, j++ - i + 1)
            }
            i = maxOf(i + 1, j - 1)
        }
        return if (result > 1) result else -1
    }
}
