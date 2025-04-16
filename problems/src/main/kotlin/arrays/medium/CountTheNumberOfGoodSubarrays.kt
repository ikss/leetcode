package arrays.medium

/**
 * Given an integer array nums and an integer k, return the number of good subarrays of nums.
 *
 * A subarray arr is good if there are at least k pairs of indices (i, j) such that i < j and `arr[i] == arr[j]`.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-good-subarrays/)
 */
object CountTheNumberOfGoodSubarrays {
    fun countGood(nums: IntArray, k: Int): Long {
        var result = 0L

        var left = 0
        var right = 0
        var counts = HashMap<Int, Int>()
        var pairCount = 0

        while (right < nums.size) {
            val n = nums[right++]

            val oldCount = counts.getOrDefault(n, 0)
            counts[n] = oldCount + 1

            pairCount += oldCount

            while (pairCount >= k) {
                result += nums.size - right + 1
                val nleft = nums[left]

                val leftCount = counts[nleft]!!
                counts[nleft] = leftCount - 1

                pairCount -= counts[nleft]!!
                left++
            }
        }

        return result
    }
}
