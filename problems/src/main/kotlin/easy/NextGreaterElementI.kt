package easy

import java.util.*

/**
 * he next greater element of some element x in an array is the first greater element that is to the right of x
 * in the same array.
 *
 * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
 *
 * For each 0 <= i < nums1.length, find the index j such that `nums1[i] == nums2[j]` and determine the next greater
 * element of `nums2[j]` in nums2. If there is no next greater element, then the answer for this query is -1.
 *
 * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 *
 * [URL](https://leetcode.com/problems/next-greater-element-i/)
 */
object NextGreaterElementI {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val stack = Stack<Int>()
        val map = HashMap<Int, Int>(nums2.size)

        for (n in nums2) {
            while (stack.isNotEmpty() && stack.peek() < n) {
                map[stack.pop()] = n
            }
            stack.push(n)
        }

        val result = IntArray(nums1.size) { -1 }

        for (i in nums1.indices) {
            result[i] = map.getOrDefault(nums1[i], -1)
        }

        return result
    }
}
