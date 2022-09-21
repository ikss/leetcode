package arrays.easy

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * [URL](https://leetcode.com/problems/contains-duplicate/)
 */
object ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        nums.forEach {
            if (!set.add(it)) {
                return true
            }
        }
        return false
    }
}
