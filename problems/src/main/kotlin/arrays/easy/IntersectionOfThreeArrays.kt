package arrays.easy

import java.util.*

/**
 * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order,
 * return a sorted array of only the integers that appeared in all three arrays.
 *
 * [URL](https://leetcode.com/problems/intersection-of-three-sorted-arrays/)
 */
object IntersectionOfThreeArrays {
    fun arraysIntersection(arr1: IntArray, arr2: IntArray, arr3: IntArray): List<Int> {
        val map = TreeMap<Int, Int>()

        for (i in arr1) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        for (i in arr2) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        for (i in arr3) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        val result = ArrayList<Int>()
        for ((key, value) in map) {
            if (value == 3) {
                result.add(key)
            }
        }

        return result
    }
}
