package easy

import data_structures.TreeNode
import java.util.*

/**
 * Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
 *
 * The distance value is defined as the number of elements `arr1[i]` such that there is not any element `arr2[j]`
 * where `|arr1[i]-arr2[j]| <= d`.
 *
 * [URL](https://leetcode.com/problems/find-the-distance-value-between-two-arrays/)
 */
object FindTheDistanceValueBetweenTwoArrays {
    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        val arr2Unique = arr2.toSet()

        var result = 0

        for (n in arr1) {
            var found = false
            for (v in n - d .. n + d) {
                if (v in arr2Unique) {
                    found = true
                    break
                }
            }
            if (!found) {
                result++
            }
        }

        return result
    }
}
