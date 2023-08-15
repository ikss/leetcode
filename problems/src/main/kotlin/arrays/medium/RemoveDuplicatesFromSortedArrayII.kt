package arrays.medium

/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique
 * element appears at most twice. The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be
 * placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first
 * k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1)
 * extra memory.
 *
 * [URL](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
 */
object RemoveDuplicatesFromSortedArrayII {
    fun removeDuplicatesNaive(nums: IntArray): Int {
        var curIndex = 0
        var curElem = Int.MIN_VALUE
        var curCount = 0

        for (n in nums) {
            if (n != curElem || curCount == 1) {
                nums[curIndex++] = n
                curCount = if (n == curElem) 2 else 1
                curElem = n
            } else {
                curCount++
            }
        }

        return curIndex
    }

    fun removeDuplicatesSimplified(nums: IntArray): Int {
        var i = 0

        for (j in nums.indices) {
            if (i < 2 || nums[i - 2] != nums[j]) {
                nums[i++] = nums[j]
            }
        }

        return i
    }
}
