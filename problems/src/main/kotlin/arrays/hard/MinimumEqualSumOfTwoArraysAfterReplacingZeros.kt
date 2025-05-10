package arrays.hard

/**
 * You are given two arrays nums1 and nums2 consisting of positive integers.
 *
 * You have to replace all the 0's in both arrays with strictly positive integers such that
 * the sum of elements of both arrays becomes equal.
 *
 * Return the minimum equal sum you can obtain, or -1 if it is impossible.
 *
 * [URL](https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/)
 */
object MinimumEqualSumOfTwoArraysAfterReplacingZeros {
    fun minSum(nums1: IntArray, nums2: IntArray): Long {
        var sum1 = 0L
        var cnt1 = 0

        for (n in nums1) {
            if (n == 0) {
                cnt1++
            } else {
                sum1 += n
            }
        }

        var sum2 = 0L
        var cnt2 = 0

        for (n in nums2) {
            if (n == 0) {
                cnt2++
            } else {
                sum2 += n
            }
        }

        if ((cnt1 == 0 && sum2 + cnt2 > sum1) || (cnt2 == 0 && sum1 + cnt1 > sum2)) return -1

        return maxOf(sum1 + cnt1, sum2 + cnt2)
    }
}
