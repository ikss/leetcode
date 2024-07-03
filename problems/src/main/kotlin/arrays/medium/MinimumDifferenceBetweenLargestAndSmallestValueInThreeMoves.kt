package arrays.medium

/**
 * You are given an integer array nums.
 *
 * In one move, you can choose one element of nums and change it to any value.
 *
 * Return the minimum difference between the largest and smallest value of nums after performing at most three moves.
 *
 * [URL](https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/)
 */
object MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
    fun minDifference(nums: IntArray): Int {
        val n = nums.size
        if (n <= 4) return 0
        nums.sort()

        var result = nums[n - 1] - nums[0]

        var left = 0
        var right = n - 4
        while (left < 4) {
            result = minOf(result, nums[right] - nums[left])
            left++
            right++
        }
        return result
    }
}
