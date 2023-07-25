package arrays.medium

import java.util.*

/**
 * An array arr a mountain if the following properties hold:
 * * arr.length >= 3
 * * There exists some i with 0 < i < arr.length - 1 such that:
 * * * `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
 * * * `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`
 *
 * Given a mountain array arr, return the index i such that
 * `arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`.
 *
 * You must solve it in O(log(arr.length)) time complexity.
 *
 * [URL](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
 */
object PeakIndexInMountainArray {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 0
        var right = arr.size - 1

        while (left < right) {
            val mid = left + (right - left) / 2

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return left
    }

}