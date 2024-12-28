package arrays.hard

/**
 * Given an integer array nums and an integer k, find three non-overlapping subarrays of length k with maximum sum
 * and return them.
 *
 * Return the result as a list of indices representing the starting position of each interval (0-indexed).
 * If there are multiple answers, return the lexicographically smallest one.
 *
 * [URL](https://leetcode.com/problems/maximum-sum-of-3-non-overlapping-subarrays/)
 */
object MaximumSumOf3NonOverlappingSubarrays {

    fun maxSumOfThreeSubarrays(nums: IntArray, k: Int): IntArray {
        // Variables to track the best indices for one, two, and three subarray configurations
        var bestSingleStart = 0
        val bestDoubleStart = intArrayOf(0, k)
        val bestTripleStart = intArrayOf(0, k, k * 2)

        // Compute the initial sums for the first three subarrays
        var currentWindowSumSingle = 0
        for (i in 0..<k) {
            currentWindowSumSingle += nums[i]
        }

        var currentWindowSumDouble = 0
        for (i in k..<k * 2) {
            currentWindowSumDouble += nums[i]
        }

        var currentWindowSumTriple = 0
        for (i in k * 2..<k * 3) {
            currentWindowSumTriple += nums[i]
        }

        // Track the best sums found so far
        var bestSingleSum = currentWindowSumSingle
        var bestDoubleSum = currentWindowSumSingle + currentWindowSumDouble
        var bestTripleSum = currentWindowSumSingle + currentWindowSumDouble + currentWindowSumTriple

        // Sliding window pointers for the subarrays
        var singleStart = 1
        var doubleStart = k + 1
        var tripleStart = k * 2 + 1

        // Slide the windows across the array
        while (tripleStart <= nums.size - k) {
            // Update the sums using the sliding window technique
            currentWindowSumSingle = currentWindowSumSingle - nums[singleStart - 1] + nums[singleStart + k - 1]
            currentWindowSumDouble = currentWindowSumDouble - nums[doubleStart - 1] + nums[doubleStart + k - 1]
            currentWindowSumTriple = currentWindowSumTriple - nums[tripleStart - 1] + nums[tripleStart + k - 1]

            // Update the best single subarray start index if a better sum is found
            if (currentWindowSumSingle > bestSingleSum) {
                bestSingleStart = singleStart
                bestSingleSum = currentWindowSumSingle
            }

            // Update the best double subarray start indices if a better sum is found
            if (currentWindowSumDouble + bestSingleSum > bestDoubleSum) {
                bestDoubleStart[0] = bestSingleStart
                bestDoubleStart[1] = doubleStart
                bestDoubleSum = currentWindowSumDouble + bestSingleSum
            }

            // Update the best triple subarray start indices if a better sum is found
            if (currentWindowSumTriple + bestDoubleSum > bestTripleSum) {
                bestTripleStart[0] = bestDoubleStart[0]
                bestTripleStart[1] = bestDoubleStart[1]
                bestTripleStart[2] = tripleStart
                bestTripleSum = currentWindowSumTriple + bestDoubleSum
            }

            // Move the sliding windows forward
            singleStart += 1
            doubleStart += 1
            tripleStart += 1
        }

        // Return the starting indices of the three subarrays with the maximum sum
        return bestTripleStart
    }
}
