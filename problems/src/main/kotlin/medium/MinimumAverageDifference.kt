package medium

/**
 * You are given a 0-indexed integer array nums of length n.
 *
 * The average difference of the index i is the absolute difference between the average of the first i + 1 elements
 * of nums and the average of the last n - i - 1 elements. Both averages should be rounded down to the nearest integer.
 *
 * Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.
 *
 * Note:
 *
 * The absolute difference of two numbers is the absolute value of their difference.
 * The average of n elements is the sum of the n elements divided (integer division) by n.
 * The average of 0 elements is considered to be 0.
 *
 * [URL](https://leetcode.com/problems/minimum-average-difference/)
 */
object MinimumAverageDifference {
    fun minimumAverageDifference(nums: IntArray): Int {
        val size = nums.size
        var ans = -1
        var minAvgDiff = Int.MAX_VALUE
        var currPrefixSum = 0L

        // Get total sum of array.
        var totalSum = 0L
        for (n in nums) {
            totalSum += n
        }
        for (index in 0 until size) {
            currPrefixSum += nums[index]

            // Calculate average of left part of array, index 0 to i.
            var leftPartAverage = currPrefixSum
            leftPartAverage /= (index + 1)

            // Calculate average of right part of array, index i+1 to n-1.
            var rightPartAverage = totalSum - currPrefixSum
            // If right part have 0 elements, then we don't divide by 0.
            if (index != size - 1) {
                rightPartAverage /= (size - index - 1)
            }
            val currDifference = Math.abs(leftPartAverage - rightPartAverage).toInt()
            // If current difference of averages is smaller,
            // then current index can be our answer.
            if (currDifference < minAvgDiff) {
                minAvgDiff = currDifference
                ans = index
            }
        }
        return ans
    }
}