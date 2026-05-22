package easy

import data_structures.TreeNode
import java.util.*

/**
 * Given an array of distinct integers arr, where arr is sorted in ascending order,
 * return the smallest index i that satisfies `arr[i] == i`. If there is no such index, return -1.
 *
 * [URL](https://leetcode.com/problems/fixed-point/)
 */
object FixedPoint {
    fun fixedPoint(arr: IntArray): Int {
        var left = 0
        var right = arr.size - 1

        var result = -1
        while (left <= right) {
            var mid = left + (right - left) / 2

            val numMid = arr[mid]

            if (numMid == mid) {
                result = mid
                right = mid - 1
            } else if (numMid > mid) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return result
    }
}
