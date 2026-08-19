package easy

/**
 * You are given an integer array nums and an integer k.
 *
 * An integer x is almost missing from nums if x appears in exactly one subarray of size k within nums.
 *
 * Return the largest almost missing integer from nums. If no such integer exists, return -1.
 *
 * A subarray is a contiguous sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/find-the-largest-almost-missing-integer/)
 */
object FindTheLargestAlmostMissingInteger {
    fun largestInteger(nums: IntArray, k: Int): Int {
        if (nums.size == k) {
            return nums.max()
        }

        val counts = IntArray(51)
        for (n in nums) {
            counts[n]++
        }
        if (k == 1) {
            for (n in 50 downTo 0) {
                if (counts[n] == 1) {
                    return n
                }
            }
            return -1
        }
        var max = -1
        if (counts[nums.first()] == 1) {
            max = nums.first()
        }
        if (counts[nums.last()] == 1) {
            max = maxOf(max, nums.last())
        }

        return max
    }
}