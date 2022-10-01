package arrays.medium

import kotlin.math.absoluteValue

/**
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
 * The result should also be sorted in ascending order.
 *
 * An integer a is closer to x than an integer b if:
 * * |a - x| < |b - x|, or
 * * |a - x| == |b - x| and a < b
 *
 * [URL](https://leetcode.com/problems/find-k-closest-elements/)
 */
object FindKClosestElements {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        if (x < arr[0]) {
            return arr.slice(0 until k)
        } else if (x > arr[arr.size - 1]) {
            return arr.slice(arr.size - k until arr.size)
        }

        val index = arr.binarySearch(x)
        var start = if (index >= 0) index else index.absoluteValue - 2
        var end = start + 1

        val result = mutableListOf<Int>()
        while (result.size < k) {
            val d1 = if (start >= 0) (arr[start] - x).absoluteValue else Int.MAX_VALUE
            val d2 = if (end < arr.size) (arr[end] - x).absoluteValue else Int.MAX_VALUE
            if (d1 <= d2) {
                result.add(arr[start--])
            } else {
                result.add(arr[end++])
            }
        }
        return result.sorted()
    }
}