package medium

/**
 * You are given an integer array nums of size n and a positive integer k.
 *
 * Divide the array into one or more arrays of size 3 satisfying the following conditions:
 *
 * Each element of nums should be in exactly one array.
 * The difference between any two elements in one array is less than or equal to k.
 * Return a 2D array containing all the arrays. If it is impossible to satisfy the conditions, return an empty array.
 * And if there are multiple answers, return any of them.
 *
 * [URL](https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/)
 */
object DivideArrayIntoArraysWithMaxDifference {
    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        val result = ArrayList<IntArray>(nums.size / 3)
        nums.sort()

        var i = 0
        while (i < nums.size) {
            if (nums[i + 2] - nums[i] > k) {
                return emptyArray()
            }
            result.add(intArrayOf(nums[i], nums[i + 1], nums[i + 2]))
            i += 3
        }

        return result.toTypedArray()
    }
}