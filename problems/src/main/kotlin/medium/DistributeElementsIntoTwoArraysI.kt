package medium

import java.util.ArrayDeque

/**
 * You are given a 1-indexed array of distinct integers nums of length n.
 *
 * You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations.
 * In the first operation, append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards, in the ith operation:
 *
 * If the last element of arr1 is greater than the last element of arr2, append `nums[i]` to arr1.
 * Otherwise, append `nums[i]` to arr2.
 * The array result is formed by concatenating the arrays arr1 and arr2. For example,
 * if `arr1 == [1,2,3]` and `arr2 == [4,5,6]`, then `result = [1,2,3,4,5,6]`.
 *
 * Return the array result.
 *
 * [URL](https://leetcode.com/problems/distribute-elements-into-two-arrays-i/)
 */
object DistributeElementsIntoTwoArraysI {
    fun resultArray(nums: IntArray): IntArray {
        val arr1 = IntArray(nums.size)
        arr1[0] = nums[0]
        val arr2 = IntArray(nums.size)
        arr2[0] = nums[1]

        var i1 = 1
        var i2 = 1

        for (i in 2 until nums.size) {
            val n = nums[i]

            if (arr1[i1 - 1] > arr2[i2 - 1]) {
                arr1[i1++] = n
            } else {
                arr2[i2++] = n
            }
        }

        System.arraycopy(arr2, 0, arr1, i1, i2)

        return arr1
    }
}
