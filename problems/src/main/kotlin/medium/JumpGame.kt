package medium

/**
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 *
 * Return _true_ if you can reach the last index, or _false_ otherwise.
 *
 * [URL](https://leetcode.com/problems/jump-game/)
 */
object JumpGame {
    fun canJumpGreedy(nums: IntArray): Boolean {
        var maxLocation = 0
        for (i in nums.indices) {
            if (maxLocation > nums.size) {
                return true
            } else if (maxLocation < i) {
                return false
            }
            maxLocation = maxOf(i + nums[i], maxLocation) // greedy:
        }
        return true
    }
}
