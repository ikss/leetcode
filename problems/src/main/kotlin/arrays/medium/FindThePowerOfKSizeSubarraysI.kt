package arrays.medium

/**
 * You are given an array of integers nums of length n and a positive integer k.
 *
 * The power of an array is defined as:
 * * Its maximum element if all of its elements are consecutive and sorted in ascending order.
 * * -1 otherwise.
 *
 * You need to find the power of all subarrays
 *  of nums of size k.
 *
 * Return an integer array results of size n - k + 1, where `results[i]` is the power of nums[i..(i + k - 1)].
 *
 * [URL](https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/)
 */
object FindThePowerOfKSizeSubarraysI {
    fun resultsArray(nums: IntArray, k: Int): IntArray {
        if (k == 1) return nums
        val diff = k - 1
        val result = IntArray(nums.size - diff)
        var wasSorted = false

        for (i in diff until nums.size) {
            if (wasSorted) {
                if (nums[i] == nums[i - 1] + 1) {
                    result[i - diff] = nums[i]
                } else {
                    result[i - diff] = -1
                    wasSorted = false
                }
                continue
            }
            if (nums[i] == nums[i - diff] + diff && consecutive(nums, i - diff, i)) {
                result[i - diff] = nums[i]
                wasSorted = true
            } else {
                result[i - diff] = -1
            }
        }

        return result
    }

    private fun consecutive(nums: IntArray, start: Int, end: Int): Boolean {
        for (i in start + 1..end) {
            if (nums[i] != nums[i - 1] + 1) return false
        }
        return true
    }
}
