package arrays.hard

/**
 * The distance of a pair of integers a and b is defined as the absolute difference between a and b.
 *
 * Given an integer array nums and an integer k, return the kth smallest distance among all the pairs
 * `nums[i] and nums[j]` where 0 <= i < j < nums.length.
 *
 * [URL](https://leetcode.com/problems/find-k-th-smallest-pair-distance/)
 */
object FindKthSmallestPairDistance {
    fun smallestDistancePair(nums: IntArray, k: Int): Int {
        val arrayLength: Int = nums.size

        var maxElement = Int.MIN_VALUE
        for (num in nums) {
            maxElement = maxOf(maxElement, num)
        }

        val distanceBucket = IntArray(maxElement + 1)

        for (i in 0 until arrayLength) {
            for (j in i + 1 until arrayLength) {
                val distance = Math.abs(nums[i] - nums[j])

                ++distanceBucket[distance]
            }
        }

        var k = k
        for (dist in 0..maxElement) {
            k -= distanceBucket[dist]

            if (k <= 0) {
                return dist
            }
        }

        return -1
    }
}
