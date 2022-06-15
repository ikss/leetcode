package data_structures.arrays.medium


/**
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k)
 * such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 *
 * [URL](https://leetcode.com/problems/increasing-triplet-subsequence/)
 */
object IncreasingTriplet {
    fun increasingTriplet(nums: IntArray): Boolean {
        var small = Int.MAX_VALUE
        var big = Int.MAX_VALUE
        for (n in nums) {
            if (n <= small) {
                small = n
            } else if (n <= big) {
                big = n
            } else {
                return true
            }
        }
        return false
    }
}
