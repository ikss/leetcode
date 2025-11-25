package medium

/**
 * Given two integer arrays nums1 and nums2 of length n, count the pairs of indices (i, j)
 * such that i < j and `nums1[i] + nums1[j] > nums2[i] + nums2[j]`.
 *
 * Return the number of pairs satisfying the condition.
 *
 * [URL](https://leetcode.com/problems/count-pairs-in-two-arrays/)
 */
object CountPairsInTwoArrays {
    fun countPairs(nums1: IntArray, nums2: IntArray): Long {
        val n = nums1.size

        val difference = LongArray(n) { nums1[it].toLong() - nums2[it] }
        difference.sort()

        var result = 0L
        var left = 0
        var right = n - 1
        while (left < right) {
            if (difference[left] + difference[right] > 0) {
                result += (right - left).toLong()
                right--
            } else {
                left++
            }
        }
        return result
    }
}
