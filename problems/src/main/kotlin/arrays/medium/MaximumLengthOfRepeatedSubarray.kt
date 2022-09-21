package arrays.medium

/**
 * Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.
 *
 * [URL](https://leetcode.com/problems/maximum-length-of-repeated-subarray/)
 */
object MaximumLengthOfRepeatedSubarray {
    fun findLengthDp(nums1: IntArray, nums2: IntArray): Int {
        val dp = Array(nums1.size + 1) { IntArray(nums2.size + 1) }
        var res = 0
        for (i in nums1.size - 1 downTo 0) {
            for (j in nums2.size - 1 downTo 0) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1
                    res = maxOf(res, dp[i][j])
                }
            }
        }

        return res
    }

    fun findLengthDp1d(nums1: IntArray, nums2: IntArray): Int {
        var dp = IntArray(nums2.size + 1)
        var res = 0
        for (i in nums1.size - 1 downTo 0) {
            val tmp = IntArray(nums2.size + 1)
            for (j in nums2.size - 1 downTo 0) {
                if (nums1[i] == nums2[j]) {
                    tmp[j] = dp[j + 1] + 1
                    res = maxOf(res, tmp[j])
                }
            }
            dp = tmp
        }

        return res
    }
}
