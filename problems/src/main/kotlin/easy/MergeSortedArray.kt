package easy

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.

 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.

 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
 * should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 *
 * [URL](https://leetcode.com/problems/merge-sorted-array/)
 */
object MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n)
            return
        }

        if (n == 0) return

        var lastIndex1 = nums1.size - 1
        while (nums1[lastIndex1] == 0) {
            lastIndex1--
        }
        var lastIndex2 = nums2.size - 1

        for (i in nums1.size - 1 downTo 0) {
            if (lastIndex1 >= 0 && (lastIndex2 < 0 || nums1[lastIndex1] >= nums2[lastIndex2])) {
                nums1[i] = nums1[lastIndex1]
                lastIndex1--
            } else {
                nums1[i] = nums2[lastIndex2]
                lastIndex2--
            }
        }
    }
}
