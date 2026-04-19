package easy

/**
 * You are given two non-increasing 0-indexed integer arrays nums1 and nums2.
 *
 * A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and
 * `nums1[i] <= nums2[j]`. The distance of the pair is j - i.
 *
 * Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.
 *
 * An array arr is non-increasing if `arr[i-1] >= arr[i]` for every 1 <= i < arr.length.
 *
 * [URL](https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/)
 */
object MaximumDistanceBetweenPairOfValues {
    fun maxDistance(nums1: IntArray, nums2: IntArray): Int {
        var i = 0
        var j = 0

        var result = 0

        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] <= nums2[j] && i <= j) {
                result = maxOf(result, j - i)
                j++
                continue
            }
            if (i > j) {
                j++
            } else {
                i++
            }
        }

        return result
    }
}
