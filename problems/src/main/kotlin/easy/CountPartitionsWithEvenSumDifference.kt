package easy

/**
 * You are given an integer array nums of length n.
 *
 * A partition is defined as an index i where 0 <= i < n - 1, splitting the array into two non-empty subarrays such that:
 *
 * * Left subarray contains indices `[0, i]`.
 * * Right subarray contains indices `[i + 1, n - 1]`.
 *
 * Return the number of partitions where the difference between the sum of the left and right subarrays is even.
 *
 * [URL](https://leetcode.com/problems/count-partitions-with-even-sum-difference/)
 */
object CountPartitionsWithEvenSumDifference {
    fun countPartitions(nums: IntArray): Int {
        var totalSum = 0

        for (n in nums) {
            totalSum += n
        }

        var result = 0
        var runningSum = 0
        for (i in 0 until nums.size - 1) {
            runningSum += nums[i]

            if ((totalSum - runningSum - runningSum) % 2 == 0) {
                result++
            }
        }

        return result
    }
}