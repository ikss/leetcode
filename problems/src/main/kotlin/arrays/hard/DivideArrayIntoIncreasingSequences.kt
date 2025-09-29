package arrays.hard

/**
 * YGiven an integer array nums sorted in non-decreasing order and an integer k, return true if this array can be
 * divided into one or more disjoint increasing subsequences of length at least k, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/divide-array-into-increasing-sequences/)
 */
object DivideArrayIntoIncreasingSequences {
    fun canDivideIntoSubsequences(nums: IntArray, k: Int): Boolean {
        var currFreq = 0
        var prev = -1

        for (n in nums) {
            if (n == prev) {
                currFreq++
                if (currFreq * k > nums.size) return false
            } else {
                currFreq = 1
                prev = n
            }
        }

        return true
    }
}
