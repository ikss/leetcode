package arrays.easy

/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j
 * in the array such that `nums[i] == nums[j]` and abs(i - j) <= k.
 *
 * [URL](https://leetcode.com/problems/contains-duplicate-ii/)
 */
object ContainsDuplicateII {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val n = nums[i]
            val oldI = map[n]
            if (oldI != null && (i - oldI <= k)) {
                return true
            }
            map[n] = i
        }
        return false
    }
}
