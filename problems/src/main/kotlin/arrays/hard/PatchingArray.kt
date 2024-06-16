package arrays.hard

/**
 * Given a sorted integer array nums and an integer n, add/patch elements to the array such that any number in the
 * range `[1, n]` inclusive can be formed by the sum of some elements in the array.
 *
 * Return the minimum number of patches required.
 *
 * [URL](https://leetcode.com/problems/patching-array/)
 */
object PatchingArray {
    fun minPatches(nums: IntArray, n: Int): Int {
        var result = 0
        var i = 0
        var miss = 1L

        while (miss <= n) {
            if (i < nums.size && nums[i] <= miss) {
                miss += nums[i++]
            } else {
                result++
                miss += miss
            }
        }

        return result
    }
}
