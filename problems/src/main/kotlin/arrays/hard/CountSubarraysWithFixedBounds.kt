package arrays.hard

/**
 * You are given an integer array nums and two integers minK and maxK.
 *
 * A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
 * * The minimum value in the subarray is equal to minK.
 * * The maximum value in the subarray is equal to maxK.
 *
 * Return the number of fixed-bound subarrays.
 *
 * A subarray is a contiguous part of an array.
 *
 * [URL](https://leetcode.com/problems/count-subarrays-with-fixed-bounds/)
 */
object CountSubarraysWithFixedBounds {
    fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long {
        // minPosition, maxPosition: the MOST RECENT positions of minK and maxK.
        // leftBound: the MOST RECENT value outside the range [minK, maxK].
        var answer = 0L
        var minPosition = -1
        var maxPosition = -1
        var leftBound = -1

        // Iterate over nums, for each number at index i:
        for (i in nums.indices) {
            // If the number is outside the range [minK, maxK], update the most recent leftBound.
            if (nums[i] < minK || nums[i] > maxK) {
                leftBound = i
            }

            // If the number is minK or maxK, update the most recent position.
            if (nums[i] == minK) {
                minPosition = i
            }
            if (nums[i] == maxK) {
                maxPosition = i
            }

            // The number of valid subarrays equals the number of elements between leftBound and
            // the smaller of the two most recent positions (minPosition and maxPosition).
            answer += maxOf(0, minOf(maxPosition, minPosition) - leftBound).toLong()
        }
        return answer
    }
}
