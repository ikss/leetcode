package medium

/**
 * You are given a binary array nums and an integer k.
 *
 * A k-bit flip is choosing a subarray of length k from nums and simultaneously changing every 0 in the subarray to 1,
 * and every 1 in the subarray to 0.
 *
 * Return the minimum number of k-bit flips required so that there is no 0 in the array.
 * If it is not possible, return -1.
 *
 * A subarray is a contiguous part of an array.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/)
 */
object MinimumNumberOfKConsecutiveBitFlips {
    fun minKBitFlips(nums: IntArray, k: Int): Int {
        var result = 0

        for (i in nums.indices) {
            if (nums[i] == 1) continue
            if (i + k > nums.size) return -1
            result++

            for (j in i until i + k) {
                nums[j] = 1 - nums[j]
            }
        }

        return result
    }
}
