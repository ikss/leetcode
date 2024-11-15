package arrays.medium

/**
 * Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining
 * elements in arr are non-decreasing.
 *
 * Return the length of the shortest subarray to remove.
 *
 * A subarray is a contiguous subsequence of the array.
 *
 * [URL](https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/)
 */
object ShortestSubarrayToBeRemovedToMakeArraySorted {
    fun findLengthOfShortestSubarray(arr: IntArray): Int {
        var right = arr.size - 1
        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--
        }

        var result = right
        var left = 0
        while (left < right && (left == 0 || arr[left - 1] <= arr[left])) {
            while (right < arr.size && arr[left] > arr[right]) {
                right++
            }
            result = minOf(result, right - left - 1)
            left++
        }
        return result
    }
}
