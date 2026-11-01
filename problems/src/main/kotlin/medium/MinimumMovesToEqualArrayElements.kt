package medium

/**
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
 *
 * In one move, you can increment n - 1 elements of the array by 1.
 *
 * [URL](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/)
 */
object MinimumMovesToEqualArrayElements {
    fun minMoves(nums: IntArray): Int {
        nums.sort()
        var result = 0

        for (i in nums.size - 1 downTo 0) {
            if (nums[i] == nums[0]) break
            result += nums[i] - nums[0]
        }

        return result
    }
}
