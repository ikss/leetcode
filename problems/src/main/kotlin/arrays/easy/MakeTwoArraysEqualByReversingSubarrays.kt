package arrays.easy

/**
 * You are given two integer arrays of equal length target and arr.
 * In one step, you can select any non-empty subarray of arr and reverse it.
 * You are allowed to make any number of steps.
 *
 * Return true if you can make arr equal to target or false otherwise.
 *
 * [URL](https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/)
 */
object MakeTwoArraysEqualByReversingSubarrays {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()

        for (t in target) {
            map.merge(t, 1, Int::plus)
        }

        for (a in arr) {
            val v = map.merge(a, -1, Int::plus)
            if (v!! < 0) return false
        }
        return true
    }
}
