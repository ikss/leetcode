package data_structures.arrays.medium

/**
 * Given an integer array nums, handle multiple queries of the following types:
 *
 *  * Update the value of an element in nums.
 *  * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 *
 * Implement the NumArray class:
 *
 *  * NumArray(int[] nums) Initializes the object with the integer array nums.
 *  * void update(int index, int val) Updates the value of `nums[index]` to be val.
 *  * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive
 *  (i.e. `nums[left]` + `nums[left + 1]` + ... + `nums[right]`).
 *
 * [URL](https://leetcode.com/problems/range-sum-query-mutable/)
 */
object RangeSumQueryMutable {
    class NumArrayNaive(val nums: IntArray) {
        fun update(index: Int, `val`: Int) {
            nums[index] = `val`
        }

        fun sumRange(left: Int, right: Int): Int {
            var sum = 0
            for (i in left..right) {
                sum += nums[i]
            }
            return sum
        }

    }
}
