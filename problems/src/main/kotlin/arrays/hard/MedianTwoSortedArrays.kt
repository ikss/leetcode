package arrays.hard

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * [URL](https://leetcode.com/problems/median-of-two-sorted-arrays/)
 */
object MedianTwoSortedArrays {
    @Suppress("unused")
    fun findMedianSortedArraysNaive(nums1: IntArray, nums2: IntArray): Double {
        val totalSize = nums1.size + nums2.size
        if (totalSize == 0) {
            return 0.0
        }
        if (nums1.isEmpty()) {
            if (totalSize % 2 != 0) {
                return nums2[totalSize / 2].toDouble()
            }
            return (nums2[nums2.size / 2] + nums2[nums2.size / 2 - 1]) / 2.0
        } else if (nums2.isEmpty()) {
            if (totalSize % 2 != 0) {
                return nums1[totalSize / 2].toDouble()
            }
            return (nums1[nums1.size / 2] + nums1[nums1.size / 2 - 1]) / 2.0
        }
        val needToRemove = if (totalSize % 2 == 0) totalSize - 2 else totalSize - 1

        var left1 = 0
        var right1 = nums1.size - 1
        var left2 = 0
        var right2 = nums2.size - 1
        repeat(needToRemove) {
            if (it % 2 == 0) {
                if (left1 > right1 || (left2 <= right2 && nums2[left2] < nums1[left1])) {
                    left2++
                } else {
                    left1++
                }
            } else {
                if (left1 > right1 || (left2 <= right2 && nums2[right2] > nums1[right1])) {
                    right2--
                } else {
                    right1--
                }
            }
        }
        val a = if (left1 > right1) nums2[left2] else nums1[left1]
        val b = if (left2 > right2) nums1[right1] else nums2[right2]
        return (a + b) / 2.0
    }

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val m = nums1.size
        val n = nums2.size

        if (m > n) return findMedianSortedArrays(nums2, nums1)

        if (m == 0) return median(nums2)

        var low = 0
        var high = m

        while (low <= high) {
            val partitionX = low + (high - low) / 2
            val partitionY = ((m + n + 1) / 2) - partitionX

            val maxX: Int = if (partitionX == 0) Integer.MIN_VALUE else nums1[partitionX - 1]
            val minX: Int = if (partitionX == m) Integer.MAX_VALUE else nums1[partitionX]

            val maxY: Int = if (partitionY == 0) Integer.MIN_VALUE else nums2[partitionY - 1]
            val minY: Int = if (partitionY == n) Integer.MAX_VALUE else nums2[partitionY]

            if (maxX <= minY && maxY <= minX) {
                return if ((m + n) % 2 == 0) {
                    (maxX.coerceAtLeast(maxY).toDouble() + minX.coerceAtMost(minY).toDouble()) / 2
                } else {
                    maxX.toDouble().coerceAtLeast(maxY.toDouble())
                }
            } else if (maxX > minY) {
                high = partitionX - 1
            } else {
                low = partitionX + 1
            }
        }
        return 0.0
    }

    private fun median(nums: IntArray): Double {
        val low = 0
        val high = nums.size - 1
        val mid = low + (high - low) / 2

        return if (nums.size % 2 == 0) {
            (nums[mid].toDouble() + nums[mid + 1].toDouble()) / 2
        } else {
            nums[mid].toDouble()
        }
    }

}
