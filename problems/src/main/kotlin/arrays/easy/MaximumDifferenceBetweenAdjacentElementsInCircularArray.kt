package arrays.easy

/**
 * Given a circular array nums, find the maximum absolute difference between adjacent elements.
 *
 * Note: In a circular array, the first and last elements are adjacent.
 *
 * [URL](https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/)
 */
object MaximumDifferenceBetweenAdjacentElementsInCircularArray {
    fun maxAdjacentDistance(nums: IntArray): Int {
        val n = nums.size
        var maxDiff = Math.abs(nums[0] - nums[n - 1])
        for (i in 0 until nums.size - 1) {
            val first = nums[i]
            val next = nums[i + 1]
            maxDiff = maxOf(maxDiff, Math.abs(first - next))
        }

        return maxDiff
    }
}
