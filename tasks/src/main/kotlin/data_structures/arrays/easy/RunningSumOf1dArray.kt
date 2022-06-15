package data_structures.arrays.easy

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 * Return the running sum of nums.
 *
 * [URL](https://leetcode.com/problems/running-sum-of-1d-array/)
 */
object RunningSumOf1dArray {
    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size) { 0 }
        var sum = 0
        nums.forEachIndexed { index, it ->
            sum += it
            result[index] = sum
        }
        return result
    }
}
