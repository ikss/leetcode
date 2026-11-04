package easy

/**
 * You are given an integer array nums.
 *
 * In one move, you may increase the value of any single element `nums[i]` by 1.
 *
 * Return the minimum total number of moves required so that all elements in nums become equal.
 *
 * [URL](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/)
 */
object MinimumMovesToEqualArrayElementsIII {
    fun minMoves(nums: IntArray): Int {
        var result = 0

        val max = nums.max()

        for (n in nums) {
            result += max - n
        }

        return result
    }
}
