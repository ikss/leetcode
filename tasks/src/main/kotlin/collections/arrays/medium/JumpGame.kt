package collections.arrays.medium

/**
 * Given a triangle array, return the minimum path sum from top to bottom.
 *
 * For each step, you may move to an adjacent number of the row below. More formally,
 * if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 *
 * [URL](https://leetcode.com/problems/triangle/)
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
            maxLocation = Math.max(i + nums[i], maxLocation) // greedy:
        }
        return true
    }
}
