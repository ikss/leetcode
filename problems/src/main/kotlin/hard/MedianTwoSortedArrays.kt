package hard

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * [URL](https://leetcode.com/problems/median-of-two-sorted-arrays/)
 */
object MedianTwoSortedArrays {
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
            } else if (left1 > right1 || (left2 <= right2 && nums2[right2] > nums1[right1])) {
                right2--
            } else {
                right1--
            }
        }
        val a = if (left1 > right1) nums2[left2] else nums1[left1]
        val b = if (left2 > right2) nums1[right1] else nums2[right2]
        return (a + b) / 2.0
    }

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val size1 = nums1.size
        val size2 = nums2.size

        if (size1 > size2) {
            return findMedianSortedArrays(nums2, nums1)
        } else if (size1 == 0) {
            return median(nums2)
        }
        var left = 0
        var right = size1

        while (left <= right) {
            val partitionA = left + (right - left) / 2
            val partitionB = (size1 + size2 + 1) / 2 - partitionA

            val maxLeftA = if (partitionA == 0) Integer.MIN_VALUE else nums1[partitionA - 1]
            val minRightA = if (partitionA == size1) Integer.MAX_VALUE else nums1[partitionA]

            val maxLeftB = if (partitionB == 0) Integer.MIN_VALUE else nums2[partitionB - 1]
            val minRightB = if (partitionB == size2) Integer.MAX_VALUE else nums2[partitionB]

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                return if ((size1 + size2) % 2 == 0) {
                    (maxOf(maxLeftA, maxLeftB).toDouble() + minOf(minRightA, minRightB).toDouble()) / 2
                } else {
                    maxOf(maxLeftA.toDouble(), maxLeftB.toDouble())
                }
            } else if (maxLeftA > minRightB) {
                right = partitionA - 1
            } else {
                left = partitionA + 1
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
