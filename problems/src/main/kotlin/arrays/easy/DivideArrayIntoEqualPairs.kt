package arrays.easy

/**
 * You are given an integer array nums consisting of 2 * n integers.
 *
 * You need to divide nums into n pairs such that:
 * * Each element belongs to exactly one pair.
 * * The elements present in a pair are equal.
 *
 * Return true if nums can be divided into n pairs, otherwise return false.
 *
 * [URL](https://leetcode.com/problems/divide-array-into-equal-pairs/)
 */
object DivideArrayIntoEqualPairs {
    fun divideArray(nums: IntArray): Boolean {
        nums.sort()

        for (i in nums.indices step 2) {
            if (nums[i] != nums[i + 1]) {
                return false
            }
        }

        return true
    }
}
