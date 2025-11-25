package hard

/**
 * Given two sorted 0-indexed integer arrays nums1 and nums2 as well as an integer k, return the kth (1-based) smallest
 * product of `nums1[i] * nums2[j]` where 0 <= i < nums1.length and 0 <= j < nums2.length.
 *
 * [URL](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/)
 */
object KthSmallestProductOfTwoSortedArrays {

    fun kthSmallestProduct(nums1: IntArray, nums2: IntArray, k: Long): Long {
        val n1 = nums1.size
        var left = -10000000000L
        var right = 10000000000L
        while (left <= right) {
            val mid = (left + right) / 2
            var count: Long = 0
            for (i in 0 until n1) {
                count += calc(nums2, nums1[i].toLong(), mid).toLong()
            }
            if (count < k) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return left
    }

    private fun calc(nums2: IntArray, x1: Long, v: Long): Int {
        val n2 = nums2.size
        var left = 0
        var right = n2 - 1
        while (left <= right) {
            val mid = (left + right) / 2
            val prod = nums2[mid].toLong() * x1
            if ((x1 >= 0 && prod <= v) || (x1 < 0 && prod > v)) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return if (x1 >= 0) {
            left
        } else {
            n2 - left
        }
    }
}
