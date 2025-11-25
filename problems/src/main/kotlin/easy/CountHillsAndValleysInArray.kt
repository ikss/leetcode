package easy

/**
 * You are given a 0-indexed integer array nums. An index i is part of a hill in nums if the closest non-equal
 * neighbors of i are smaller than `nums[i]`. Similarly, an index i is part of a valley in nums if the closest non-equal
 * neighbors of i are larger than `nums[i]`. Adjacent indices i and j are part of the same hill or valley if
 * `nums[i] == nums[j]`.
 *
 * Note that for an index to be part of a hill or valley,
 * it must have a non-equal neighbor on both the left and right of the index.
 *
 * Return the number of hills and valleys in nums.
 *
 * [URL](https://leetcode.com/problems/count-hills-and-valleys-in-an-array/)
 */
object CountHillsAndValleysInArray {
    fun countHillValley(nums: IntArray): Int {
        var result = 0
        var prev = 0

        for (i in 1 until nums.size - 1) {
            if (nums[prev] == nums[i] || nums[i] == nums[i + 1]) continue
            val nprev = nums[prev]
            val ncurr = nums[i]
            val nnext = nums[i + 1]
            if (ncurr > nprev && ncurr > nnext) {
                result++
            } else if (ncurr < nprev && ncurr < nnext) {
                result++
            }

            prev = i
        }

        return result
    }
}
