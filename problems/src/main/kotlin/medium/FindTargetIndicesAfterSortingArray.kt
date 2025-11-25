package medium

/**
 * You are given a 0-indexed integer array nums and a target element target.
 *
 * A target index is an index i such that `nums[i] == target`.
 *
 * Return a list of the target indices of nums after sorting nums in non-decreasing order.
 * If there are no target indices, return an empty list. The returned list must be sorted in
 * increasing order.
 *
 * [URL](https://leetcode.com/problems/find-target-indices-after-sorting-array/)
 */
object FindTargetIndicesAfterSortingArray {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        var less = 0
        var count = 0

        for (n in nums) {
            if (n < target) {
                less++
            } else if (n == target) {
                count++
            }
        }
        if (count == 0) return emptyList()

        val result = ArrayList<Int>(count)

        for (i in 0 until count) {
            result.add(less + i)
        }
        return result
    }
}
