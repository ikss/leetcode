package medium

/**
 * You are given an integer array nums and an integer k.
 *
 * The frequency of an element x is the number of times it occurs in an array.
 *
 * An array is called good if the frequency of each element in this array is less than or equal to k.
 *
 * Return the length of the longest good subarray of nums.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/)
 */
object LengthOfLongestSubarrayWithAtMostKFrequency {
    fun maxSubarrayLength(nums: IntArray, k: Int): Int {
        val hash = HashMap<Int, Int>()

        var result = 0
        var start = 0

        for (end in nums.indices) {
            hash.merge(nums[end], 1, Int::plus)!!

            while (hash[nums[end]]!! > k) {
                hash.merge(nums[start], 1, Int::minus)
                start++
            }
            result = maxOf(result, end - start + 1)
        }

        return result
    }
}