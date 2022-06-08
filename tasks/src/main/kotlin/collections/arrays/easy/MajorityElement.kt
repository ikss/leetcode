package collections.arrays.easy

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * [URL](https://leetcode.com/problems/majority-element/)
 */
object MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        if (nums.size <= 1) return nums[0]
        return nums.sorted()[nums.size / 2]
    }
}
