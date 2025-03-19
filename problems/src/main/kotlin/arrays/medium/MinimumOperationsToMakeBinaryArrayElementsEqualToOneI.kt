package arrays.medium

/**
 * You are given a binary array nums.
 *
 * You can do the following operation on the array any number of times (possibly zero):
 *
 * Choose any 3 consecutive elements from the array and flip all of them.
 * Flipping an element means changing its value from 0 to 1, and from 1 to 0.
 *
 * Return the minimum number of operations required to make all elements in nums equal to 1.
 * If it is impossible, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/)
 */
object MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    fun minOperations(nums: IntArray): Int {
        var result = 0

        for (i in 0 until nums.size - 2) {
            if (nums[i] != 0) {
                continue
            }
            nums[i] = 1
            nums[i + 1] = 1 - nums[i + 1]
            nums[i + 2] = 1 - nums[i + 2]
            result++
        }
        for (i in nums.size - 2 until nums.size) {
            if (nums[i] == 0) return -1
        }
        return result
    }
}